package crafttweaker.api.event;

import crafttweaker.annotations.ZenRegister;
import stanhebben.zenscript.annotations.ZenClass;

@ZenRegister
@ZenClass("crafttweaker.event.PlayerTickEvent")
public interface PlayerTickEvent extends IPlayerEvent {}
