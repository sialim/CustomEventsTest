package me.sialim.customevents.commands;

import me.sialim.customevents.events.GameEndEvent;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GameOverCommand implements CommandExecutor
{
    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] args) {
        if(sender instanceof Player p)
        {
            if(args.length == 1)
            {
                Player t = Bukkit.getPlayer(args[0]);
                Bukkit.getServer().getPluginManager().callEvent(new GameEndEvent(p, t, 1));

            }
        }
        return true;
    }
}
