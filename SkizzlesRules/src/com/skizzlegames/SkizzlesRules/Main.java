package com.skizzlegames.SkizzlesRules;

import net.md_5.bungee.api.ChatColor;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args) {
		this.saveDefaultConfig();
        if (cmd.getName().equalsIgnoreCase("rules")) {
                sender.sendMessage(ChatColor.GREEN + "Rules: " + getConfig().getString("message"));
                return true;
}
		return false;}}