package main;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.util.Vector;

import enchants.CustomEnchants;

public class EventoDañoJugador implements Listener{
	Random random = new Random();

	@EventHandler
	public void onPlayerDamageEvent(EntityDamageByEntityEvent evento) {
		if(evento.getEntity() instanceof Player && evento.getDamager() instanceof Player) {
			if (evento.getEntity() instanceof Player && evento.getDamager() instanceof Player) {
				Player victima = (Player) evento.getEntity();
				Player agresor = (Player) evento.getDamager();
				
				if((victima.getInventory().getChestplate().hasItemMeta() && victima.getInventory().getChestplate().getItemMeta().hasEnchant(CustomEnchants.LLUVIA_FLECHAS)) ||
				   (victima.getInventory().getLeggings().hasItemMeta() && victima.getInventory().getLeggings().getItemMeta().hasEnchant(CustomEnchants.LLUVIA_FLECHAS)) ||
				   (victima.getInventory().getHelmet().hasItemMeta() && victima.getInventory().getHelmet().getItemMeta().hasEnchant(CustomEnchants.LLUVIA_FLECHAS)) ||
				   (victima.getInventory().getBoots().hasItemMeta() && victima.getInventory().getBoots().getItemMeta().hasEnchant(CustomEnchants.LLUVIA_FLECHAS))) {
				
					for(int n = 0; n <= 10; n++) {
					int x1 = (int) agresor.getLocation().getX() - 3;
					int x2 = (int) agresor.getLocation().getX() + 3;
					float rx = random.nextFloat() - 1;
					float x = (float) (random.nextInt(x2-x1) + x1) + rx;
					
					int z1 = (int) agresor.getLocation().getZ() - 3;
					int z2 = (int) agresor.getLocation().getZ() + 3;
					float rz = random.nextFloat() - 1;
					float z = (float) (random.nextInt(z2-z1) + z1) + rz ;
					
					Location pos = new Location(agresor.getWorld(), x, agresor.getLocation().getY() + 3, z);
					Bukkit.getWorld("world").spawnArrow(pos, new Vector(0,0,0), (float) 1.0,0);
				
					}
				}
				
				if((victima.getInventory().getChestplate().hasItemMeta() && victima.getInventory().getChestplate().getItemMeta().hasEnchant(CustomEnchants.LLUVIA_FUEGO)) ||
				   (victima.getInventory().getLeggings().hasItemMeta() && victima.getInventory().getLeggings().getItemMeta().hasEnchant(CustomEnchants.LLUVIA_FUEGO)) ||
				   (victima.getInventory().getHelmet().hasItemMeta() && victima.getInventory().getHelmet().getItemMeta().hasEnchant(CustomEnchants.LLUVIA_FUEGO)) ||
				   (victima.getInventory().getBoots().hasItemMeta() && victima.getInventory().getBoots().getItemMeta().hasEnchant(CustomEnchants.LLUVIA_FUEGO))) {
						
							for(int n = 0; n <= 10; n++) {
							int x1 = (int) agresor.getLocation().getX() - 3;
							int x2 = (int) agresor.getLocation().getX() + 3;
							float rx = random.nextFloat() - 1;
							float x = (float) (random.nextInt(x2-x1) + x1) + rx;
							
							int z1 = (int) agresor.getLocation().getZ() - 3;
							int z2 = (int) agresor.getLocation().getZ() + 3;
							float rz = random.nextFloat() - 1;
							float z = (float) (random.nextInt(z2-z1) + z1) + rz ;
							
							Location pos = new Location(agresor.getWorld(), x, agresor.getLocation().getY() + 3, z);
							Arrow flecha = Bukkit.getWorld("world").spawnArrow(pos, new Vector(0,0,0), (float) 1.0,0);
							flecha.setFireTicks(40);
							flecha.setVisualFire(true);
						
					}
				}
			}
		}
	}
}