package crafttweaker.api.event;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.entity.IEntity;
import stanhebben.zenscript.annotations.*;

@ZenRegister
@ZenClass("crafttweaker.event.IEntityEvent")
public interface IEntityEvent {
    @ZenGetter("entity")
    IEntity getEntity();
}
