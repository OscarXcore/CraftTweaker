package crafttweaker.mc1120.commands.dumpZScommand;

import java.util.HashMap;
import java.util.Map;

public class Formatter {

    private static final HashMap<String, String> TOKENS = new HashMap<>();
    private static final Formatter INSTANCE = new Formatter();

    private Formatter() {
        TOKENS.put("I#", "<i>%s</i>"); // I# - Italics
        TOKENS.put("B#", "<b>%s</b>"); // B# - Bold
        TOKENS.put("U#", "<u>%s</u>"); // U# - Underline
        TOKENS.put("Bi#", "<b><i>%s</i></b>"); // Bi# - Bold Italic
        TOKENS.put("Bu#", "<b><u>%s</u></b>"); // Bu# - Bold Underline
        TOKENS.put("Iu#", "<i><u>%s</u></i>"); // Iu# - Italic Underline
        TOKENS.put("Biu#", "<b><i><u>%s</u></i></b>"); // Biu# - Bold Italic Underline
        TOKENS.put("C#", "<code>%s</code>"); // C# - In-Line Code
        TOKENS.put("N#", "%s<br/>"); // N# - New Line
    }

    static String format(String string) {
        String[] split = string.split("(\\s+)");
        StringBuilder value = new StringBuilder();

        for (String s : split) {
            for (Map.Entry<String, String> entry : TOKENS.entrySet()) {
                String token = entry.getKey();
                String formatString = entry.getValue();
                if (s.contains(token)) {
                    String stripped = String.format(formatString, s.replace(token, "").replace("<", "&#60;").replace(">", "&#62;"));
                    value.append(stripped);
                    break;
                } else {
                    value.append(" ").append(s);
                    break;
                }
            }
        }
        return value.toString();
    }
}