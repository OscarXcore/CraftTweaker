package crafttweaker.api.event;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.player.IPlayer;
import stanhebben.zenscript.annotations.*;

@ZenRegister
@ZenClass("crafttweaker.event.BlockBreakEvent")
public interface BlockBreakEvent extends IBlockEvent, IEventCancelable{
    
    @ZenGetter("isPlayer")
    boolean getIsPlayer();
    
    @ZenGetter("player")
    IPlayer getPlayer();
    
    @ZenGetter("experience")
    int getExperience();
    
    @ZenSetter("experience")
    void setExperience(int experience);
}
