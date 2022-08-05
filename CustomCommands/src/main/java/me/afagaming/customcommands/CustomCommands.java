package me.afagaming.customcommands;

import me.afagaming.customcommands.Commands.ClearCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomCommands extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("The plugin has started up!");

        getServer().getPluginCommand("clear").setExecutor(new ClearCommand());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
