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

public class ComandoPiesPlomo implements CommandExecutor{
	
	public ComandoPiesPlomo(MainPlugin plugin) {
	
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(label.equalsIgnoreCase("piesplomo") && sender instanceof Player) {
			Player jugador = (Player) sender;
			
			ItemStack botas = new ItemStack(Material.NETHERITE_BOOTS);
			botas.addUnsafeEnchantment(CustomEnchants.PIES_PLOMO, Integer.parseInt(args[0]));
			
			ItemMeta meta = botas.getItemMeta();
			List<String> lore = new ArrayList<String>();
			lore.add(ChatColor.DARK_GRAY + "Pies de plomo " + args[0]);
			meta.setLore(lore);
			botas.setItemMeta(meta);
			
			jugador.getInventory().addItem(botas);
		}
		return false;
	}

}
