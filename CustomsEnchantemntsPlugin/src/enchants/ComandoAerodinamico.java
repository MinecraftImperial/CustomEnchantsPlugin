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

public class ComandoAerodinamico implements CommandExecutor{
	
	public ComandoAerodinamico(MainPlugin plugin) {
	
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(label.equalsIgnoreCase("aerodinamico") && sender instanceof Player) {
			Player jugador = (Player) sender;
			
			ItemStack elytras = new ItemStack(Material.ELYTRA);
			elytras.addUnsafeEnchantment(CustomEnchants.AERODINAMICO, 1);
			
			ItemMeta meta = elytras.getItemMeta();
			List<String> lore = new ArrayList<String>();
			lore.add(ChatColor.WHITE + "Aerodinamico");
			meta.setLore(lore);
			elytras.setItemMeta(meta);
			
			jugador.getInventory().addItem(elytras);
		}
		return false;
	}

}
