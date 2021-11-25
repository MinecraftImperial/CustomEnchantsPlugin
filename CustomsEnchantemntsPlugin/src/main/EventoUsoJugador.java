package main;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemDamageEvent;
import org.bukkit.inventory.ItemStack;

import enchants.CustomEnchants;

public class EventoUsoJugador implements Listener{

	@SuppressWarnings("deprecation")
	@EventHandler
	public void onPlayerUseEvent(PlayerItemDamageEvent evento) {
		
		ItemStack item = evento.getItem();
		if(item.hasItemMeta() && item.getItemMeta().hasEnchant(CustomEnchants.MALA_CALIDAD)) {
			item.setDurability((short) (item.getDurability() + 1));
		}		
	}		
}