package enchants;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import main.MainPlugin;

public class ComandoMalaCalidad implements CommandExecutor{
	
	public ComandoMalaCalidad(MainPlugin plugin) {}

	@SuppressWarnings("deprecation")
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(label.equalsIgnoreCase("mala_calidad") && sender instanceof Player) {
			Player jugador = (Player) sender;
			
			ItemStack item = jugador.getItemInHand();
			item.addUnsafeEnchantment(CustomEnchants.MALA_CALIDAD, Integer.parseInt(args[0]));
			
			ItemMeta meta = item.getItemMeta();
			List<String> lore = new ArrayList<String>();
			lore.add(ChatColor.DARK_RED + "Mala Calidad " + args[0]);
			meta.setLore(lore);
			item.setItemMeta(meta);
		}
		return false;
	}

}
