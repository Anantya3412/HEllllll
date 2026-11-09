package com.rivalsmp;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class RivalSMP extends JavaPlugin {
    @Override public void onEnable() {
        saveDefaultConfig();
        getLogger().info("RivalSMP enabled.");
        long interval = Math.max(1L, getConfig().getLong("announcements.interval-seconds", 300L)) * 20L;
        if (getConfig().getBoolean("announcements.enabled", true)) {
            getServer().getScheduler().runTaskTimer(this, this::broadcastAnnouncement, interval, interval);
        }
    }

    private void broadcastAnnouncement() {
        String message = getConfig().getString("announcements.message", "&aWelcome to the server!");
        getServer().broadcastMessage(color(getConfig().getString("settings.prefix", "&8[&cRivalSMP&8] ") + message));
    }

    @Override public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length == 0 || args[0].equalsIgnoreCase("help")) {
            sender.sendMessage(color("&cRivalSMP &7- &fSafe server utilities"));
            sender.sendMessage(color("&7/rivalsmp reload &fReload configuration"));
            sender.sendMessage(color("&7/rivalsmp info &fShow plugin information"));
            return true;
        }
        if (args[0].equalsIgnoreCase("info")) {
            sender.sendMessage(color("&cRivalSMP &7version &f" + getPluginMeta().getVersion()));
            return true;
        }
        if (args[0].equalsIgnoreCase("reload")) {
            if (!sender.hasPermission("rivalsmp.admin")) {
                sender.sendMessage(color("&cYou do not have permission."));
                return true;
            }
            reloadConfig();
            sender.sendMessage(color("&aRivalSMP configuration reloaded."));
            return true;
        }
        sender.sendMessage(color("&cUnknown subcommand. Use /rivalsmp help."));
        return true;
    }

    private String color(String input) { return ChatColor.translateAlternateColorCodes('&', input); }
}
