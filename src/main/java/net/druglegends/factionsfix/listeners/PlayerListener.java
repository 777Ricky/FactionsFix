package net.druglegends.factionsfix.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class PlayerListener implements Listener {

    @EventHandler
    public void onPlayerCommand(PlayerCommandPreprocessEvent event) {
        String command = event.getMessage();

        if (event.getPlayer().hasPermission("factionsfix.bypass")) {
            return;
        }

        if (command.startsWith("/f home") || command.startsWith("/factions home")) {
            event.setMessage("/f home");
        }
    }
}
