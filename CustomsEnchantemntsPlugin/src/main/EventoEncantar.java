package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.enchantment.EnchantItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import enchants.CustomEnchants;

public class EventoEncantar implements Listener{

	@SuppressWarnings({ "deprecation", "unused" })
	@EventHandler
	public void onPlayerEnchantEvent(EnchantItemEvent evento) {
		
		boolean newEnchant = new Random().nextInt(3) == 0;
		if(newEnchant) {
			ItemStack item = evento.getItem();
			String nombre = item.getType().name();
			if(item.getType().name().endsWith("_HELMET")) {
				Enchantment encantamiento = CustomEnchants.getEnchantsListHelmet().get(new Random().nextInt(CustomEnchants.getEnchantsListHelmet().size()));
				if(encantamiento.getMaxLevel() != 1) {item.addUnsafeEnchantment(encantamiento, new Random().nextInt(encantamiento.getMaxLevel()-1) + 1);}
				else {item.addUnsafeEnchantment(encantamiento, new Random().nextInt(encantamiento.getMaxLevel()) + 1);}
				ItemMeta meta = item.getItemMeta();
				List<String> lore = new ArrayList<String>();
				lore.add(ChatColor.GRAY + encantamiento.getName() + " " + item.getEnchantmentLevel(encantamiento));
				meta.setLore(lore);
				item.setItemMeta(meta);
				
			}

			else {
				if(item.getType().name().endsWith("_LEGGINGS")) {
					Enchantment encantamiento = CustomEnchants.getEnchantsListLeggings().get(new Random().nextInt(CustomEnchants.getEnchantsListLeggings().size()));
					if(encantamiento.getMaxLevel() != 1) {item.addUnsafeEnchantment(encantamiento, new Random().nextInt(encantamiento.getMaxLevel()-1) + 1);}
					else {item.addUnsafeEnchantment(encantamiento, new Random().nextInt(encantamiento.getMaxLevel()) + 1);}
					ItemMeta meta = item.getItemMeta();
					List<String> lore = new ArrayList<String>();
					lore.add(ChatColor.GRAY + encantamiento.getName() + " " + item.getEnchantmentLevel(encantamiento));
					meta.setLore(lore);
					item.setItemMeta(meta);
				}
				
				else {
					if(item.getType().name().endsWith("_BOOTS")) {
						Enchantment encantamiento = CustomEnchants.getEnchantsListBoots().get(new Random().nextInt(CustomEnchants.getEnchantsListBoots().size()));
						if(encantamiento.getMaxLevel() != 1) {item.addUnsafeEnchantment(encantamiento, new Random().nextInt(encantamiento.getMaxLevel()-1) + 1);}
						else {item.addUnsafeEnchantment(encantamiento, new Random().nextInt(encantamiento.getMaxLevel()) + 1);}
						ItemMeta meta = item.getItemMeta();
						List<String> lore = new ArrayList<String>();
						lore.add(ChatColor.GRAY + encantamiento.getName() + " " + item.getEnchantmentLevel(encantamiento));
						meta.setLore(lore);
						item.setItemMeta(meta);
					}
					
					else {
						if(item.getType().name().endsWith("_SWORD")) {
							Enchantment encantamiento = CustomEnchants.getEnchantsListSword().get(new Random().nextInt(CustomEnchants.getEnchantsListSword().size()));
							if(encantamiento.getMaxLevel() != 1) {item.addUnsafeEnchantment(encantamiento, new Random().nextInt(encantamiento.getMaxLevel()-1) + 1);}
							else {item.addUnsafeEnchantment(encantamiento, new Random().nextInt(encantamiento.getMaxLevel()) + 1);}
							ItemMeta meta = item.getItemMeta();
							List<String> lore = new ArrayList<String>();
							lore.add(ChatColor.GRAY + encantamiento.getName() + " " + item.getEnchantmentLevel(encantamiento));
							meta.setLore(lore);
							item.setItemMeta(meta);
						}
						
						else {
							if(item.getType().name().endsWith("_PICKAXE") || item.getType().name().endsWith("_AXE") || item.getType().name().endsWith("_SHOVEL") || item.getType().name().endsWith("_HOE")) {
								Enchantment encantamiento = CustomEnchants.getEnchantsListTools().get(new Random().nextInt(CustomEnchants.getEnchantsListTools().size()));
								if(encantamiento.getMaxLevel() != 1) {item.addUnsafeEnchantment(encantamiento, new Random().nextInt(encantamiento.getMaxLevel()-1) + 1);}
								else {item.addUnsafeEnchantment(encantamiento, new Random().nextInt(encantamiento.getMaxLevel()) + 1);}
								ItemMeta meta = item.getItemMeta();
								List<String> lore = new ArrayList<String>();
								lore.add(ChatColor.GRAY + encantamiento.getName() + " " + item.getEnchantmentLevel(encantamiento));
								meta.setLore(lore);
								item.setItemMeta(meta);
							}
							
							/*else {
								if(item.getType().name().equals("BOOK")) {
									Enchantment encantamiento = CustomEnchants.getEnchantsListBook().get(new Random().nextInt(CustomEnchants.getEnchantsListBook().size()));
									if(encantamiento.getMaxLevel() != 1) {item.addUnsafeEnchantment(encantamiento, new Random().nextInt(encantamiento.getMaxLevel()-1) + 1);}
									else {item.addUnsafeEnchantment(encantamiento, new Random().nextInt(encantamiento.getMaxLevel()) + 1);}
									ItemMeta meta = item.getItemMeta();
									List<String> lore = new ArrayList<String>();
									lore.add(ChatColor.GRAY + encantamiento.getName() + " " + item.getEnchantmentLevel(encantamiento));
									meta.setLore(lore);
									item.setItemMeta(meta);
								}*/
								
								else {
									if(item.getType().name().equals("BOW")) {
										Enchantment encantamiento = CustomEnchants.getEnchantsListBow().get(new Random().nextInt(CustomEnchants.getEnchantsListBow().size()));
										if(encantamiento.getMaxLevel() != 1) {item.addUnsafeEnchantment(encantamiento, new Random().nextInt(encantamiento.getMaxLevel()-1) + 1);}
										else {item.addUnsafeEnchantment(encantamiento, new Random().nextInt(encantamiento.getMaxLevel()) + 1);}
										ItemMeta meta = item.getItemMeta();
										List<String> lore = new ArrayList<String>();
										lore.add(ChatColor.GRAY + encantamiento.getName() + " " + item.getEnchantmentLevel(encantamiento));
										meta.setLore(lore);
										item.setItemMeta(meta);
									}
									
									else {
										if(item.getType().name().endsWith("_CHESTPLATE")) {
											Enchantment encantamiento = CustomEnchants.getEnchantsListChestplate().get(new Random().nextInt(CustomEnchants.getEnchantsListChestplate().size()));
											if(encantamiento.getMaxLevel() != 1) {item.addUnsafeEnchantment(encantamiento, new Random().nextInt(encantamiento.getMaxLevel()-1) + 1);}
											else {item.addUnsafeEnchantment(encantamiento, new Random().nextInt(encantamiento.getMaxLevel()) + 1);}
											ItemMeta meta = item.getItemMeta();
											List<String> lore = new ArrayList<String>();
											lore.add(ChatColor.GRAY + encantamiento.getName() + " " + item.getEnchantmentLevel(encantamiento));
											meta.setLore(lore);
											item.setItemMeta(meta);
										}
									}
								}	
							}
						}
					}
				}
			}
			
		}
	}
//}