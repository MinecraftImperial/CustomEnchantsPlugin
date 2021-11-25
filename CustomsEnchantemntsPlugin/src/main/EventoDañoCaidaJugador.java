package main;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

import enchants.CustomEnchants;

public class EventoDañoCaidaJugador implements Listener{

	@EventHandler
	public void onPlayerFallDamageEvent(EntityDamageEvent evento) {
		if(evento.getEntity() instanceof Player && evento.getCause() == EntityDamageEvent.DamageCause.FALL) {
			Player jugador = (Player) evento.getEntity();
			if(jugador.getInventory().getBoots().hasItemMeta() && jugador.getInventory().getBoots().getItemMeta().hasEnchant(CustomEnchants.PIES_PLOMO)) {
				evento.setDamage(evento.getDamage() * (jugador.getInventory().getBoots().getItemMeta().getEnchantLevel(CustomEnchants.PIES_PLOMO) + 1));
			}
		}
	}
}