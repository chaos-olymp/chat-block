package de.chaosolymp.chatblock;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class ChatBlock extends JavaPlugin {
    Logger logger = Logger.getLogger("ChatBlock");

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ChatListener(), this);
        logger.info("ChatBlock enabled");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
