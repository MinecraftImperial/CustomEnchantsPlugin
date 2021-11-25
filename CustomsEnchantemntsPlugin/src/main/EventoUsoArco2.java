package main;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;

import enchants.CustomEnchants;

public class EventoUsoArco2 implements Listener{

	@EventHandler
	public void onEntityShootBowEvent(EntityShootBowEvent evento) {
		if(evento.getEntity() instanceof Player && evento.getBow().containsEnchantment(CustomEnchants.MALA_PUNTERIA)) {
		
			
		}
	}
}