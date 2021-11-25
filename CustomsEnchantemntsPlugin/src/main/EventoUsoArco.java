package main;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityShootBowEvent;

import enchants.CustomEnchants;

public class EventoUsoArco implements Listener{

	@EventHandler
	public void onEntityShootBowEvent(EntityShootBowEvent evento) {
		if(evento.getEntity() instanceof Player && evento.getBow().containsEnchantment(CustomEnchants.DERROCHADOR)) {
			evento.getConsumable().setAmount(evento.getConsumable().getAmount() - 1);
		}
		
	}
}