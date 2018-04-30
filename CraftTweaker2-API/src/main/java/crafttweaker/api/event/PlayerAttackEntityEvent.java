package crafttweaker.api.event;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.entity.IEntity;
import stanhebben.zenscript.annotations.*;

/**
 * @author Stan
 */
@ZenRegister
@ZenClass("crafttweaker.event.PlayerAttackEntityEvent")
public interface PlayerAttackEntityEvent extends IEventCancelable, IPlayerEvent {
    
    @ZenGetter("target")
    IEntity getTarget();
}
