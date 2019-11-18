package net.druglegends.factionsfix;

import net.druglegends.factionsfix.listeners.PlayerListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class FactionsFix extends JavaPlugin {

    public void onEnable() {
        registerEvents();
    }

    private void registerEvents() {
        PluginManager pluginManager = Bukkit.getServer().getPluginManager();

        pluginManager.registerEvents(new PlayerListener(), this);
    }

}

