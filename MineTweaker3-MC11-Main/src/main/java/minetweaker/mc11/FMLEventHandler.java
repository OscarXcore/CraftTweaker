package minetweaker.mc11;

import minetweaker.*;
import minetweaker.api.event.*;
import minetweaker.api.minecraft.MineTweakerMC;
import minetweaker.api.player.IPlayer;
import minetweaker.mc11.network.MineTweakerLoadScriptsPacket;
import minetweaker.mc11.recipes.MCCraftingInventory;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

/**
 * @author Stan
 */
public class FMLEventHandler {
	
	@SubscribeEvent
	public void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent ev) {
		if(ev.player instanceof EntityPlayerMP) {
			EntityPlayerMP player = (EntityPlayerMP) ev.player;
			MineTweakerMod.NETWORK.sendTo(new MineTweakerLoadScriptsPacket(MineTweakerAPI.tweaker.getScriptData()), player);
		}
		
		MineTweakerImplementationAPI.events.publishPlayerLoggedIn(new PlayerLoggedInEvent(MineTweakerMC.getIPlayer(ev.player)));
	}
	
	@SubscribeEvent
	public void onPlayerItemCrafted(PlayerEvent.ItemCraftedEvent ev) {
		IPlayer iPlayer = MineTweakerMC.getIPlayer(ev.player);
		
		if(MineTweakerImplementationAPI.events.hasPlayerCrafted()) {
			MineTweakerImplementationAPI.events.publishPlayerCrafted(new PlayerCraftedEvent(iPlayer, MineTweakerMC.getIItemStack(ev.crafting), MCCraftingInventory.get(ev.craftMatrix, ev.player)));
		}
	}
	
	@SubscribeEvent
	public void onPlayerItemSmelted(PlayerEvent.ItemSmeltedEvent ev) {
		if(MineTweakerImplementationAPI.events.hasPlayerSmelted()) {
			MineTweakerImplementationAPI.events.publishPlayerSmelted(new PlayerSmeltedEvent(MineTweakerMC.getIPlayer(ev.player), MineTweakerMC.getIItemStack(ev.smelting)));
		}
	}
	
	@SubscribeEvent
	public void onPlayerLoggedOut(PlayerEvent.PlayerLoggedOutEvent ev) {
		MineTweakerImplementationAPI.events.publishPlayerLoggedOut(new PlayerLoggedOutEvent(MineTweakerMC.getIPlayer(ev.player)));
	}
	
}