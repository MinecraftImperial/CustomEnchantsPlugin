package enchants;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import main.MainPlugin;

public class ComandoVaraGolems implements CommandExecutor{
	
	public ComandoVaraGolems(MainPlugin plugin) {
	
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(label.equalsIgnoreCase("varagolems") && sender instanceof Player) {
			Player jugador = (Player) sender;
			
			ItemStack vara = new ItemStack(Material.STICK);
			
			ItemMeta meta = vara.getItemMeta();
			List<String> lore = new ArrayList<String>();
			lore.add("Golems");
			meta.setLore(lore);
			vara.setItemMeta(meta);
			
			jugador.getInventory().addItem(vara);
			
			
		}
		return false;
	}

}
