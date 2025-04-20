package de.philippklein.commands;

import de.philippklein.ImageGenerator;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * @author Philipp Klein (PhilippKlein004 @ GitHub)
 * @since 04.17.2025
 * @version 1.0
 */

public class ClearImageCommand implements CommandExecutor {

    public static int imageHeight, imageWidth;
    private static final Location loc = new Location(Bukkit.getWorld("world"), 0, 4, 0);

    public ClearImageCommand( ImageGenerator plugin ) {
        plugin.getCommand("clearimage").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player player = (Player) sender;

        if ( !player.hasPermission("philippklein.clearimage") ) {
            player.sendMessage("§c[Error] You don't have permission to use this command.");
            return true;
        }

        player.sendMessage("§e[ImageGenerator] Clearing image...");

        for ( int x = 0; x < imageWidth; x++ ) for ( int y = 0; y < imageHeight; y++ ) new Location( loc.getWorld(), loc.getBlockX() + x, loc.getBlockY(), loc.getBlockZ() + y ).getBlock().setType(Material.AIR);

        player.sendMessage("§a[ImageGenerator] Image was cleared.");

        return false;
    }

}
