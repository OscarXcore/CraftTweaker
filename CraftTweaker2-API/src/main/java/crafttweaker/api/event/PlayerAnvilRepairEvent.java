package crafttweaker.api.event;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.item.IItemStack;
import stanhebben.zenscript.annotations.*;

@ZenRegister
@ZenClass("crafttweaker.event.PlayerAnvilRepairEvent")
public interface PlayerAnvilRepairEvent extends IPlayerEvent {
    
    @ZenGetter("itemResult")
    IItemStack getItemResult();
    
    @ZenGetter("itemIngredient")
    IItemStack getItemIngredient();
    
    @ZenGetter("itemInput")
    IItemStack getItemInput();
    
    @ZenGetter("breakChance")
    float getBreakChance();
    
    @ZenSetter("breakChance")
    void setBreakChance(float breakChance);
}
