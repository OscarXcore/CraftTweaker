package crafttweaker.api.event;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.entity.*;
import stanhebben.zenscript.annotations.*;

@ZenRegister
@ZenClass("crafttweaker.event.EntityStruckByLightningEvent")
public interface EntityStruckByLightningEvent extends IEventCancelable, IEntityEvent{
    
    @ZenGetter("lightning")
    IEntity getLightning();
}
