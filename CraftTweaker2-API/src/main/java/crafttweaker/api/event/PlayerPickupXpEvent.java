package crafttweaker.api.event;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.entity.IEntityXp;
import stanhebben.zenscript.annotations.*;

/**
 * @author Stan
 */
@ZenRegister
@ZenClass("crafttweaker.event.PlayerPickupXpEvent")
public interface PlayerPickupXpEvent extends IEventCancelable, IPlayerEvent {
    
    @ZenGetter("entityXp")
    IEntityXp getEntityXp();
    
    @ZenGetter("xp")
    float getXp();
}
