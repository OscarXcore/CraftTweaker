package crafttweaker.api.formatting;

import crafttweaker.annotations.ZenDoc;
import crafttweaker.annotations.ZenRegister;
import stanhebben.zenscript.annotations.*;

/**
 * @author Stan
 */
@ZenRegister
@ZenClass("crafttweaker.formatting.IFormattedText")
public interface IFormattedText {
    
    @ZenOperator(OperatorType.ADD)
    @ZenMethod
    IFormattedText add(IFormattedText other);
    
    @ZenOperator(OperatorType.CAT)
    @ZenMethod
    IFormattedText cat(IFormattedText other);
    
    String getText();
}
