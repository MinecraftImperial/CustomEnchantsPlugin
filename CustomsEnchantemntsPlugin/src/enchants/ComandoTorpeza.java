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

public class ComandoTorpeza implements CommandExecutor{
	
	public ComandoTorpeza(MainPlugin plugin) {
	
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(label.equalsIgnoreCase("torpeza") && sender instanceof Player) {
			Player jugador = (Player) sender;
			
			ItemStack espada = new ItemStack(Material.NETHERITE_SWORD);
			espada.addUnsafeEnchantment(CustomEnchants.TORPEZA, Integer.parseInt(args[0]));
			
			ItemMeta meta = espada.getItemMeta();
			List<String> lore = new ArrayList<String>();
			lore.add(ChatColor.RED + "Torpeza " + args[0]);
			meta.setLore(lore);
			espada.setItemMeta(meta);
			
			jugador.getInventory().addItem(espada);
		}
		return false;
	}

}
