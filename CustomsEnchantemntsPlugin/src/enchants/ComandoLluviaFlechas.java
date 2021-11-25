package enchants;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import main.MainPlugin;

public class ComandoLluviaFlechas implements CommandExecutor{
	
	public ComandoLluviaFlechas(MainPlugin plugin) {
	
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(label.equalsIgnoreCase("lluviaflechas") && sender instanceof Player) {
			Player jugador = (Player) sender;
			
			ItemStack casco = new ItemStack(Material.NETHERITE_HELMET);
			casco.addUnsafeEnchantment(CustomEnchants.LLUVIA_FLECHAS, Integer.parseInt(args[0]));
			
			ItemMeta meta = casco.getItemMeta();
			List<String> lore = new ArrayList<String>();
			lore.add(ChatColor.AQUA + "Lluvia de flechas " + args[0]);
			meta.setLore(lore);
			casco.setItemMeta(meta);
			
			jugador.getInventory().addItem(casco);
			
			ItemStack pechera = new ItemStack(Material.NETHERITE_CHESTPLATE);
			pechera.addUnsafeEnchantment(CustomEnchants.LLUVIA_FLECHAS, Integer.parseInt(args[0]));
			
			ItemMeta meta2 = pechera.getItemMeta();
			List<String> lore2 = new ArrayList<String>();
			lore2.add(ChatColor.AQUA + "Lluvia de flechas " + args[0]);
			meta2.setLore(lore2);
			pechera.setItemMeta(meta2);
			
			jugador.getInventory().addItem(pechera);
			
			ItemStack pantalon = new ItemStack(Material.NETHERITE_LEGGINGS);
			pantalon.addUnsafeEnchantment(CustomEnchants.LLUVIA_FLECHAS, Integer.parseInt(args[0]));
			
			ItemMeta meta3 = pantalon.getItemMeta();
			List<String> lore3 = new ArrayList<String>();
			lore3.add(ChatColor.AQUA + "Lluvia de flechas " + args[0]);
			meta3.setLore(lore3);
			pantalon.setItemMeta(meta3);
			
			jugador.getInventory().addItem(pantalon);
			
			ItemStack botas = new ItemStack(Material.NETHERITE_BOOTS);
			botas.addUnsafeEnchantment(CustomEnchants.LLUVIA_FLECHAS, Integer.parseInt(args[0]));
			
			ItemMeta meta4 = botas.getItemMeta();
			List<String> lore4 = new ArrayList<String>();
			lore4.add(ChatColor.AQUA + "Lluvia de flechas " + args[0]);
			meta4.setLore(lore4);
			botas.setItemMeta(meta4);
			
			jugador.getInventory().addItem(botas);
			
			
		}
		return false;
	}

}
