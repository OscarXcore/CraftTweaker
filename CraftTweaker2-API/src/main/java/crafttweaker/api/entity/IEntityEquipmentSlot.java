package crafttweaker.api.entity;

import crafttweaker.annotations.ZenRegister;
import stanhebben.zenscript.annotations.*;

@ZenRegister
@ZenClass("crafttweaker.entity.IEntityEquipmentSlot")
public interface IEntityEquipmentSlot {
    
    @ZenGetter("index")
    int getIndex();
    
    @ZenGetter("slotIndex")
    int getSlotIndex();
    
    @ZenGetter("name")
    String getName();
    
    @ZenOperator(OperatorType.COMPARE)
    int compareTo(IEntityEquipmentSlot other);
    
    Object getInternal();
    
}
