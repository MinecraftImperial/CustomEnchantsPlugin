package main;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.IronGolem;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

public class EventoUsoVaraJugador implements Listener{

	@EventHandler
	public void onPlayerUseEvent(PlayerInteractEvent evento) {
		if(evento.getItem().hasItemMeta() && (evento.getItem().getItemMeta().getLore() != null) && (evento.getAction() == Action.RIGHT_CLICK_AIR || evento.getAction() == Action.RIGHT_CLICK_BLOCK)) {
			if(evento.getItem().getType() == Material.STICK && evento.getItem().getItemMeta().getLore().contains("Golems")) {
				Player jugador = evento.getPlayer();
				Random random = new Random();
				
				for(int n = 0; n <= 2; n++) {
					
					int x1 = (int) jugador.getLocation().getX() - 3;
					int x2 = (int) jugador.getLocation().getX() + 3;
					float rx = random.nextFloat() - 1;
					float x = (float) (random.nextInt(x2-x1) + x1) + rx;
					
					int z1 = (int) jugador.getLocation().getZ() - 3;
					int z2 = (int) jugador.getLocation().getZ() + 3;
					float rz = random.nextFloat() - 1;
					float z = (float) (random.nextInt(z2-z1) + z1) + rz ;
					
					Location pos = new Location(jugador.getWorld(), x, jugador.getLocation().getY(), z);
					IronGolem golem = (IronGolem) Bukkit.getWorld("world").spawnEntity(pos, EntityType.IRON_GOLEM);
					golem.setPlayerCreated(true);
					golem.setCustomName(ChatColor.BLUE + "Protector de " + ChatColor.YELLOW + jugador.getDisplayName());
					golem.setRemoveWhenFarAway(true);
					golem.setPersistent(false);
				
				}
			}
		}
	}		
}