package crafttweaker.api.entity;

import crafttweaker.annotations.ZenRegister;
import stanhebben.zenscript.annotations.*;

/**
 * Represents an xp orb.
 *
 * @author Stan Hebben
 */
@ZenRegister
@ZenClass("crafttweaker.entity.IEntityXp")
public interface IEntityXp extends IEntity {
    
    /**
     * Gets the amount of xp in this orb.
     *
     * @return xp amount
     */
    @ZenGetter("xp")
    float getXp();
}
