package crafttweaker.api.event;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.recipes.ICraftingInventory;
import stanhebben.zenscript.annotations.*;

/**
 * @author Stan Hebben
 */
@ZenRegister
@ZenClass("crafttweaker.event.PlayerCraftedEvent")
public interface PlayerCraftedEvent extends IPlayerEvent {
    
    @ZenGetter("output")
    IItemStack getOutput();
    
    @ZenGetter("inventory")
    ICraftingInventory getInventory();
}
