package crafttweaker.api.event;

import crafttweaker.annotations.ZenRegister;
import crafttweaker.api.entity.IEntityItem;
import crafttweaker.api.player.IPlayer;
import stanhebben.zenscript.annotations.*;

@ZenRegister
@ZenClass("crafttweaker.event.ItemExpireEvent")
public interface ItemExpireEvent extends IEntityEvent, IEventCancelable {
    
    @ZenGetter("item")
    IEntityItem getItem();
    
    @ZenGetter("extraLife")
    int getExtraLife();
    
    @ZenSetter("extraLife")
    void setExtraLife(int extraLife);
    
}
