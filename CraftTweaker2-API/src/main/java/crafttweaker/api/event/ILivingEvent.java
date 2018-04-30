package crafttweaker.api.event;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.entity.*;
import stanhebben.zenscript.annotations.*;

@ZenRegister
@ZenClass("crafttweaker.event.ILivingEvent")
public interface ILivingEvent extends IEntityEvent {
    
    @ZenGetter("entityLivingBase")
    IEntityLivingBase getEntityLivingBase();
    
    @Override
    default IEntity getEntity() {return getEntityLivingBase();}
}
