package main;

import java.util.Random;

import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

import enchants.CustomEnchants;

public class EventoGolpeJugador implements Listener{

	@EventHandler
	public void onPlayerDamageEvent(EntityDamageByEntityEvent evento) {
		if(evento.getEntity() instanceof LivingEntity && evento.getDamager() instanceof Player) {
			Player jugador = (Player) evento.getDamager();
			
			if(jugador.getInventory().getItemInMainHand() == null) {
				return;
			}
			if(!jugador.getInventory().getItemInMainHand().hasItemMeta()) {
				return;
			}
			if(jugador.getInventory().getItemInMainHand().getItemMeta().hasEnchant(CustomEnchants.TORPEZA)) {
				int probabilidad = (int) 10 / jugador.getInventory().getItemInMainHand().getItemMeta().getEnchantLevel(CustomEnchants.TORPEZA);
				boolean golpe = new Random().nextInt(probabilidad) == 0;
				if (golpe) {
					double daño = evento.getDamage();
					jugador.damage(daño);
				}
			}
		}
	}
}