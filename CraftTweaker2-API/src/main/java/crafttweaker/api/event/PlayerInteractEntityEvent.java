package crafttweaker.api.event;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.entity.IEntity;
import stanhebben.zenscript.annotations.*;

/**
 * @author Stan
 */
@ZenRegister
@ZenClass("crafttweaker.event.PlayerInteractEntityEvent")
public interface PlayerInteractEntityEvent extends IEventCancelable, IPlayerEvent {
    
    @ZenGetter("target")
    IEntity getTarget();
}
