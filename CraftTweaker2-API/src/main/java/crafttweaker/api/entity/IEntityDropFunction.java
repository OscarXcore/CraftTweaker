package crafttweaker.api.entity;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.damage.IDamageSource;
import crafttweaker.api.item.IItemStack;
import stanhebben.zenscript.annotations.ZenClass;

@ZenRegister
@ZenClass("crafttweaker.entity.IEntityDropFunction")
public interface IEntityDropFunction {
	IItemStack handle(IEntity entity, IDamageSource dmgSource);
}
