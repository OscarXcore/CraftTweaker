package crafttweaker.api.enchantments;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.data.IData;
import stanhebben.zenscript.annotations.*;

@ZenRegister
@ZenClass("crafttweaker.enchantments.IEnchantment")
public interface IEnchantment {
    
    @ZenGetter("definition")
    IEnchantmentDefinition getDefinition();
    
    @ZenCaster
    @ZenMethod
    IData makeTag();
    
    @ZenGetter("level")
    int getLevel();
    
    @ZenSetter("level")
    void setLevel(int level);
    
    @ZenGetter("displayName")
    String displayName();
}
