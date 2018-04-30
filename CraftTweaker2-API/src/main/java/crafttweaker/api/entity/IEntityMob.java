package crafttweaker.api.entity;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.player.IPlayer;
import stanhebben.zenscript.annotations.*;

@ZenRegister
@ZenClass("crafttweaker.entity.IEntityMob")
public interface IEntityMob extends IEntityCreature {
    
    @ZenMethod
    boolean isPreventingPlayerRest(IPlayer player);
    
}
