package crafttweaker.api.event;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.block.*;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.world.*;
import stanhebben.zenscript.annotations.*;

/**
 * @author Stan
 */
@ZenRegister
@ZenClass("crafttweaker.event.PlayerBonemealEvent")
public interface PlayerBonemealEvent extends IEventCancelable, IPlayerEvent, IProcessableEvent, IEventPositionable {
    
    @ZenGetter("world")
    IWorld getWorld();
    
    @ZenGetter("block")
    IBlock getBlock();
    
    @ZenGetter("blockState")
    IBlockState getBlockState();
    
    @ZenGetter("dimension")
    int getDimension();
    
    @ZenGetter("item")
    IItemStack getItem();
}
