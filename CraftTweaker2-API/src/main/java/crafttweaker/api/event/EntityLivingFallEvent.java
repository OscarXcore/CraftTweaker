package crafttweaker.api.event;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.damage.IDamageSource;
import stanhebben.zenscript.annotations.*;

@ZenRegister
@ZenClass("crafttweaker.event.EntityLivingFallEvent")
public interface EntityLivingFallEvent extends ILivingEvent, IEventCancelable {
    
    @ZenGetter("distance")
    float getDistance();
    
    @ZenSetter("distance")
    void setDistance(float distance);
    
    @ZenGetter("damageMultiplier")
    float getDamageMultiplier();
    
    @ZenSetter("damageMultiplier")
    void setDamageMultiplier(float damageMultiplier);
}
