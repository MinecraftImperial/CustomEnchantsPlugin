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

public class ComandoBolsillosRotos implements CommandExecutor{
	
	public ComandoBolsillosRotos(MainPlugin plugin) {
	
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(label.equalsIgnoreCase("bolsillosrotos") && sender instanceof Player) {
			Player jugador = (Player) sender;
			
			ItemStack pantalon = new ItemStack(Material.NETHERITE_LEGGINGS);
			pantalon.addUnsafeEnchantment(CustomEnchants.BOLSILLOSROTOS, Integer.parseInt(args[0]));
			
			ItemMeta meta = pantalon.getItemMeta();
			List<String> lore = new ArrayList<String>();
			lore.add(ChatColor.RED + "Bolsillos Rotos " + args[0]);
			meta.setLore(lore);
			pantalon.setItemMeta(meta);
			
			jugador.getInventory().addItem(pantalon);
		}
		return false;
	}

}
