package me.sialim.customevents;

import me.sialim.customevents.commands.GameOverCommand;
import me.sialim.customevents.listeners.GameListeners;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class CustomEvents extends JavaPlugin
{
    @Override
    public void onEnable()
    {
        Bukkit.getServer().getPluginManager().registerEvents(new GameListeners(), this);
        getCommand("gameover").setExecutor(new GameOverCommand());
    }
}
