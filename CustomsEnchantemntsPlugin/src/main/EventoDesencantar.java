package main;

import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class EventoDesencantar implements Listener{

	@EventHandler
	public void onInventoryClickEvent(InventoryClickEvent evento) {
		if (evento.getClickedInventory().getType() == InventoryType.GRINDSTONE && evento.getSlotType() == InventoryType.SlotType.RESULT) {
            ItemStack item = evento.getCurrentItem();
            ItemMeta meta = item.getItemMeta();
            List<String> lore = meta.getLore();
            
            lore.remove(ChatColor.GRAY + "Lluvia de flechas 1");
            lore.remove(ChatColor.GRAY + "Lluvia de flechas ardientes 1");
            lore.remove(ChatColor.GRAY + "Pies de Plomo 1");
            lore.remove(ChatColor.GRAY + "Pies de Plomo 2");
            lore.remove(ChatColor.GRAY + "Pies de Plomo 3");
            lore.remove(ChatColor.GRAY + "Bolsillos Rotos 1");
            lore.remove(ChatColor.GRAY + "Bolsillos Rotos 2");
            lore.remove(ChatColor.GRAY + "Bolsillos Rotos 3");
            lore.remove(ChatColor.GRAY + "Tropeza 1");
            lore.remove(ChatColor.GRAY + "Tropeza 2");
            lore.remove(ChatColor.GRAY + "Tropeza 3");
            lore.remove(ChatColor.GRAY + "Tropeza 4");
            lore.remove(ChatColor.GRAY + "Tropeza 5");
            lore.remove(ChatColor.GRAY + "Aerodinamico 1");
            lore.remove(ChatColor.GRAY + "Anti-Aerodinamico 1");
            lore.remove(ChatColor.GRAY + "Mala Calidad 1");
            lore.remove(ChatColor.GRAY + "Derrochador 1");
            
            meta.setLore(lore);
            item.setItemMeta(meta);
            		
         }
	}
}