package main;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

import enchants.CustomEnchants;

public class EventoElytrasjugador implements Listener{

	@EventHandler
	public void onPlayerInteractEvent(PlayerInteractEvent evento) {
		Player jugador = (Player) evento.getPlayer();
		
		@SuppressWarnings("deprecation")
		ItemStack item = jugador.getItemInHand();
		
		if(item.getType() == Material.FIREWORK_ROCKET) {
			if(evento.getAction() == Action.RIGHT_CLICK_AIR) {
				if(jugador.isGliding()) {
					if(jugador.getInventory().getChestplate().hasItemMeta()) {
						if(jugador.getInventory().getChestplate().getItemMeta().hasEnchant(CustomEnchants.AERODINAMICO)) {
							jugador.setVelocity(jugador.getLocation().getDirection().multiply(2.5));
							evento.setCancelled(true);
							item.setAmount(item.getAmount()-1);
						}
						else if(jugador.getInventory().getChestplate().getItemMeta().hasEnchant(CustomEnchants.ANTI_AERODINAMICO)) {
							jugador.setVelocity(jugador.getLocation().getDirection().multiply(0.95));
							evento.setCancelled(true);
							item.setAmount(item.getAmount()-1);
						}	
					}
				}
			}
	    }
	}
}