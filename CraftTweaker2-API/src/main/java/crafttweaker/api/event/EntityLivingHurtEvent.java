package crafttweaker.api.event;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.damage.IDamageSource;
import stanhebben.zenscript.annotations.*;

@ZenRegister
@ZenClass("crafttweaker.event.EntityLivingHurtEvent")
public interface EntityLivingHurtEvent extends ILivingEvent, IEventCancelable {
    
    @ZenGetter("damageSource")
    IDamageSource getDamageSource();
    
    @ZenGetter("amount")
    float getAmount();
}
