package crafttweaker.api.event;

import crafttweaker.annotations.ZenRegister;
import stanhebben.zenscript.annotations.*;

@ZenRegister
@ZenClass("crafttweaker.event.IEventCancelable")
public interface IEventCancelable {
    
    @ZenMethod
    @ZenGetter("canceled")
    boolean isCanceled();
    
    @ZenMethod
    default void cancel(){
        setCanceled(true);
    }
    
    @ZenSetter("canceled")
    void setCanceled(boolean canceled);
}
