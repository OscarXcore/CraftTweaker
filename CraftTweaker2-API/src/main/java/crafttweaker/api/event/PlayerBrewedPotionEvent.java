package crafttweaker.api.event;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.item.IItemStack;
import stanhebben.zenscript.annotations.*;

@ZenRegister
@ZenClass("crafttweaker.event.PlayerBrewedPotionEvent")
public interface PlayerBrewedPotionEvent extends IPlayerEvent {
    
    @ZenGetter("potion")
    IItemStack getPotion();
    
}
