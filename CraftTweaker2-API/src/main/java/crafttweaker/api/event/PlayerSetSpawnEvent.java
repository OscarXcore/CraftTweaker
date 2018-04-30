package crafttweaker.api.event;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.world.IBlockPos;
import stanhebben.zenscript.annotations.*;

@ZenRegister
@ZenClass("crafttweaker.event.PlayerSetSpawnEvent")
public interface PlayerSetSpawnEvent extends IPlayerEvent, IEventCancelable {
    
    @ZenGetter("newSpawn")
    IBlockPos getNewSpawn();
    
    @ZenGetter("isForced")
    boolean getIsForced();
    
}
