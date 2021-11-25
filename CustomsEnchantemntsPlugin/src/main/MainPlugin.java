package main;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import enchants.ComandoAerodinamico;
import enchants.ComandoAgilidadMagmatica;
import enchants.ComandoAntiAerodinamico;
import enchants.ComandoBolsillosRotos;
import enchants.ComandoDerrochador;
import enchants.ComandoLluviaFlechas;
import enchants.ComandoLluviaFuego;
import enchants.ComandoMalaCalidad;
import enchants.ComandoPiesPlomo;
import enchants.ComandoTorpeza;
import enchants.ComandoVaraGolems;
import enchants.CustomEnchants;


public class MainPlugin extends JavaPlugin implements CommandExecutor{

	PluginDescriptionFile pdffile = getDescription();
	public String version = pdffile.getVersion();
	public String nombre = pdffile.getName();
	
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "[ " + nombre + " ]" + ChatColor.BLUE + " The plugin vas enabled in version " + version);

		Bukkit.getPluginManager().registerEvents(new EventoMovimientoJugador(), this);
		Bukkit.getPluginManager().registerEvents(new EventoDañoJugador(), this);
		Bukkit.getPluginManager().registerEvents(new EventoGolpeJugador(), this);
		Bukkit.getPluginManager().registerEvents(new EventoElytrasjugador(), this);
		Bukkit.getPluginManager().registerEvents(new EventoUsoJugador(), this);
		Bukkit.getPluginManager().registerEvents(new EventoDañoCaidaJugador(), this);
		Bukkit.getPluginManager().registerEvents(new EventoUsoArco(), this);
		Bukkit.getPluginManager().registerEvents(new EventoUsoArco2(), this);
		Bukkit.getPluginManager().registerEvents(new EventoUsoVaraJugador(), this);
		getCommand("bolsillosrotos").setExecutor(new ComandoBolsillosRotos(this));
		getCommand("torpeza").setExecutor(new ComandoTorpeza(this));
		getCommand("aerodinamico").setExecutor(new ComandoAerodinamico(this));
		getCommand("anti_aerodinamico").setExecutor(new ComandoAntiAerodinamico(this));
		getCommand("mala_calidad").setExecutor(new ComandoMalaCalidad(this));
		getCommand("lluviaflechas").setExecutor(new ComandoLluviaFlechas(this));
		getCommand("lluviafuego").setExecutor(new ComandoLluviaFuego(this));
		getCommand("piesplomo").setExecutor(new ComandoPiesPlomo(this));
		getCommand("derrochador").setExecutor(new ComandoDerrochador(this));
		getCommand("agilidad_magmatica").setExecutor(new ComandoAgilidadMagmatica(this));
		getCommand("varagolems").setExecutor(new ComandoVaraGolems(this));
		
		CustomEnchants.register();
		
	}
	
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage("El plugin " + nombre + " ha sido desactivado");
	}

}

