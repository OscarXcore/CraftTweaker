package crafttweaker.api.event;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.item.IItemStack;
import stanhebben.zenscript.annotations.*;

/**
 * @author Stan
 */
@ZenRegister
@ZenClass("crafttweaker.event.PlayerUseItemTickEvent")
public interface PlayerUseItemTickEvent extends IEventCancelable, IPlayerEvent {
    
    @ZenGetter("item")
    IItemStack getItem();
    
    @ZenGetter("duration")
    int getDuration();
}
