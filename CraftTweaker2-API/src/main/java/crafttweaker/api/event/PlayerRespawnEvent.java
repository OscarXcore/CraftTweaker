package crafttweaker.api.event;

import crafttweaker.annotations.ZenRegister;
import stanhebben.zenscript.annotations.*;

/**
 * @author Stan
 */
@ZenRegister
@ZenClass("crafttweaker.event.PlayerRespawnEvent")
public interface PlayerRespawnEvent extends IPlayerEvent {
    
    @ZenGetter("endConquered")
    boolean isEndConquered();
}
