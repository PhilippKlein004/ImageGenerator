package de.philippklein.commands;

import de.philippklein.ImageGenerator;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * @author Philipp Klein (PhilippKlein004 @ GitHub)
 * @since 04.17.2025
 * @version 1.0
 */

public class ImageGeneratorCommand implements CommandExecutor {

    public ImageGeneratorCommand(ImageGenerator plugin) {
        plugin.getCommand("imagegenerator").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player player = (Player) sender;

        if ( !player.hasPermission("philippklein.imagegenerator") ) {
            player.sendMessage("§c[Error] You don't have permission to use this command.");
            return true;
        }

        player.sendMessage("§a----------[ImageGenerator]----------");
        player.sendMessage("§aCoded by: Philipp Klein - PhilippKlein004 @ GitHub");
        player.sendMessage("§aVersion: 1.0");

        return false;
    }

}
