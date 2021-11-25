package enchants;

import java.util.Arrays;
import java.util.stream.Collectors;

import org.bukkit.Bukkit;
import org.bukkit.enchantments.Enchantment;

import java.lang.reflect.Field;

public class CustomEnchants {
	public static final Enchantment ASMA = new EnchantmentWrapper("asma", "Asma", 5);
	public static final Enchantment BOLSILLOSROTOS = new EnchantmentWrapper("bolsillosrotos", "Bolsillos Rotos", 3);
	public static final Enchantment TORPEZA = new EnchantmentWrapper("torpeza", "Torpeza", 5);
	public static final Enchantment AERODINAMICO = new EnchantmentWrapper("aerodinamico", "Aerodinamico", 1);
	public static final Enchantment ANTI_AERODINAMICO = new EnchantmentWrapper("anti_aerodinamico", "Anti-Aerodinamico", 1);
	public static final Enchantment MALA_CALIDAD = new EnchantmentWrapper("mala_calidad", "Mala Calidad", 1);
	public static final Enchantment LLUVIA_FLECHAS = new EnchantmentWrapper("lluvia_flechas", "Lluvia de flechas", 1);
	public static final Enchantment LLUVIA_FUEGO = new EnchantmentWrapper("lluvia_fuego", "Lluvia de flechas ardientes", 1);
	public static final Enchantment PIES_PLOMO = new EnchantmentWrapper("pies_plomo", "Pies de plomo", 3);
	public static final Enchantment DERROCHADOR = new EnchantmentWrapper("derrochador", "Derrochador", 1);
	public static final Enchantment AGILIDAD_MAGMATICA = new EnchantmentWrapper("agilidad_magmatica", "Agilidad magmática", 3);
	public static final Enchantment MALA_PUNTERIA = new EnchantmentWrapper("mala_punteria", "Mala puntería", 1);
	
	public static void register() {
		boolean ASMAregistered = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(ASMA);
		boolean BOLSILLOSROTOSregistered = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(BOLSILLOSROTOS);
		boolean TORPEZAregistered = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(TORPEZA);
		boolean AERODINAMICOregistered = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(AERODINAMICO);
		boolean ANTI_AERODINAMICOregistered = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(ANTI_AERODINAMICO);
		boolean MALA_CALIDADregistered = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(MALA_CALIDAD);
		boolean LLUVIA_FLECHASregistered = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(LLUVIA_FLECHAS);
		boolean LLUVIA_FUEGOregistered = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(LLUVIA_FUEGO);
		boolean PIES_PLOMOregistered = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(PIES_PLOMO);
		boolean DERROCHADORregistered = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(DERROCHADOR);
		boolean AGILIDAD_MAGMATICAregistered = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(AGILIDAD_MAGMATICA);
		boolean MALA_PUNTERIAregistered = Arrays.stream(Enchantment.values()).collect(Collectors.toList()).contains(MALA_PUNTERIA);
		
		if(!ASMAregistered) {
			registerEnchantment(ASMA);
		}
		
		if(!BOLSILLOSROTOSregistered) {
			registerEnchantment(BOLSILLOSROTOS);
		}
		
		if(!TORPEZAregistered) {
			registerEnchantment(TORPEZA);
		}
		
		if(!AERODINAMICOregistered) {
			registerEnchantment(AERODINAMICO);
		}
		
		if(!ANTI_AERODINAMICOregistered) {
			registerEnchantment(ANTI_AERODINAMICO);
		}
		
		if(!MALA_CALIDADregistered) {
			registerEnchantment(MALA_CALIDAD);
		}
		
		if(!LLUVIA_FLECHASregistered) {
			registerEnchantment(LLUVIA_FLECHAS);
		}
		
		if(!LLUVIA_FUEGOregistered) {
			registerEnchantment(LLUVIA_FUEGO);
			
		}
		
		if(!PIES_PLOMOregistered) {
			registerEnchantment(PIES_PLOMO);
		}
		
		if(!DERROCHADORregistered) {
			registerEnchantment(DERROCHADOR);
		}
		
		if(!AGILIDAD_MAGMATICAregistered) {
			registerEnchantment(AGILIDAD_MAGMATICA);
		}
		
		if(!MALA_PUNTERIAregistered) {
			registerEnchantment(MALA_PUNTERIA);
		}
		
	}
	
	@SuppressWarnings("deprecation")
	public static void registerEnchantment(Enchantment enchantment) {
		boolean registered = true;
		try {
			Field f = Enchantment.class.getDeclaredField("acceptingNew");
			f.setAccessible(true);
			f.set(null, true);
			Enchantment.registerEnchantment(enchantment);
			
		}catch(Exception e){
			registered = false;
			e.printStackTrace();
		}
		
		if(registered) {
			Bukkit.getConsoleSender().sendMessage("El encantamiento " + enchantment.getName() + " ha sido registrado");
		}
		
	}
	
}
