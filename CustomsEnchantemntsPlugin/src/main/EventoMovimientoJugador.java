package main;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import enchants.CustomEnchants;

public class EventoMovimientoJugador implements Listener{

	@EventHandler
	public void onPlayerMovementEvent(PlayerMoveEvent evento) {
		Player jugador = (Player) evento.getPlayer();
		
		
		if(jugador.getInventory().getBoots().hasItemMeta() && jugador.getInventory().getBoots().getItemMeta().hasEnchant(CustomEnchants.AGILIDAD_MAGMATICA) && jugador.getLocation().getBlock().getType() == Material.LAVA) {
			jugador.setVelocity(jugador.getVelocity().multiply( 1 + (0.5*jugador.getInventory().getBoots().getEnchantmentLevel(CustomEnchants.AGILIDAD_MAGMATICA))));
		}
		
		
		if(jugador.getInventory().getHelmet().hasItemMeta() && jugador.getInventory().getHelmet().getItemMeta().hasEnchant(CustomEnchants.ASMA) && jugador.isInWater()) {
			jugador.damage(2*jugador.getInventory().getHelmet().getItemMeta().getEnchantLevel(CustomEnchants.ASMA));
			}
	}
}