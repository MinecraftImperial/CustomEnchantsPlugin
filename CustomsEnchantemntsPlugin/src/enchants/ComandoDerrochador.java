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

public class ComandoDerrochador implements CommandExecutor{
	
	public ComandoDerrochador(MainPlugin plugin) {
	
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(label.equalsIgnoreCase("derrochador") && sender instanceof Player) {
			Player jugador = (Player) sender;
			
			ItemStack arco = new ItemStack(Material.BOW);
			arco.addUnsafeEnchantment(CustomEnchants.DERROCHADOR, Integer.parseInt(args[0]));
			
			ItemMeta meta = arco.getItemMeta();
			List<String> lore = new ArrayList<String>();
			lore.add(ChatColor.DARK_RED + "Derrochador " + args[0]);
			meta.setLore(lore);
			arco.setItemMeta(meta);
			
			jugador.getInventory().addItem(arco);
		}
		return false;
	}

}
