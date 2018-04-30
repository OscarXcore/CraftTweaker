package crafttweaker.api.event;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.entity.IEntityItem;
import stanhebben.zenscript.annotations.*;

/**
 * @author Stan
 */
@ZenRegister
@ZenClass("crafttweaker.event.PlayerPickupItemEvent")
public interface PlayerPickupItemEvent extends IPlayerEvent {
    
    @ZenGetter("item")
    IEntityItem getItem();
}
