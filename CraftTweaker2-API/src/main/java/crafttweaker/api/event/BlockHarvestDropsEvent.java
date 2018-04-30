package crafttweaker.api.event;


import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.item.IItemStack;
import crafttweaker.api.player.IPlayer;
import stanhebben.zenscript.annotations.*;

import java.util.List;

@ZenRegister
@ZenClass("crafttweaker.event.BlockHarvestDropsEvent")
public interface BlockHarvestDropsEvent extends IBlockEvent {
    
    @ZenGetter("dropChance")
    float getDropChance();
    
    @ZenSetter("dropChance")
    void setDropChance(float dropChance);
    
    @ZenGetter("fortuneLevel")
    int getFortuneLevel();
    
    @ZenGetter("drops")
    List<IItemStack> getDrops();
    
    @ZenSetter("drops")
    void setDrops(List<IItemStack> drops);
    
    @ZenMethod
    void addItem(IItemStack itemStack);
    
    @ZenGetter("silkTouch")
    boolean isSilkTouch();
    
    @ZenGetter("isPlayer")
    boolean isPlayer();
    
    @ZenGetter("player")
    IPlayer getPlayer();
    
}
