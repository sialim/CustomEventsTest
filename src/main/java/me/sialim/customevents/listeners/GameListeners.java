package me.sialim.customevents.listeners;

import me.sialim.customevents.events.GameEndEvent;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class GameListeners implements Listener {
    @EventHandler
    public void OnGameEnd(GameEndEvent e)
    {
        Bukkit.getServer().broadcastMessage("Game has ended!");
        Bukkit.getServer().broadcastMessage("Winner: " + e.getWinner().getName());
        Bukkit.getServer().broadcastMessage("Loser: " + e.getLoser().getName());
    }
}
