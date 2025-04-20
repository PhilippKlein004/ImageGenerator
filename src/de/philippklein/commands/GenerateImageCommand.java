package de.philippklein.commands;

import de.philippklein.ImageGenerator;
import de.philippklein.blocks.Blocks;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.block.Block;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Philipp Klein (PhilippKlein004 @ GitHub)
 * @since 04.17.2025
 * @version 1.0
 */

public class GenerateImageCommand implements CommandExecutor {

    private final Blocks[] blocks = Blocks.values();
    private final Location loc = new Location(Bukkit.getWorld("world"), 0, 4, 0);

    public GenerateImageCommand(ImageGenerator plugin) {
        plugin.getCommand("generateimage").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {

        Player player = (Player) sender;

        if ( !player.hasPermission("philippklein.generateimage") ) {
            player.sendMessage("§c[Error] You don't have permission to use this command.");
            return true;
        }

        try {

            String url = args[0];

            player.sendMessage("§e[ImageGenerator] Loading image...");

            BufferedImage image = getImageFromURL(url);

            ClearImageCommand.imageHeight = image.getHeight();
            ClearImageCommand.imageWidth = image.getWidth();

            player.sendMessage("§a[ImageGenerator] Image was loaded.");
            player.sendMessage("§a                               Width: " + image.getWidth() + "px, Height: " + image.getHeight() + "px");
            player.sendMessage("§e[ImageGenerator] Drawing image...");

            drawImage(image);

            player.sendMessage("§a[ImageGenerator] Image has been drawn successfully.");

        } catch( IOException e ) {
            player.sendMessage("§c[Error] The given URL is not valid.");
        } catch ( Exception e ) {
            player.sendMessage("§c[Error] Usage: /generateimage [URL]");
        }

        return false;
    }

    private BufferedImage getImageFromURL( String url ) throws IOException {

        // Loading image from URL
        // Source: https://proxiesapi.com/articles/downloading-images-from-urls-in-java

        URL imageUrl = new URL(url);
        BufferedImage image = ImageIO.read(imageUrl);
        ImageIO.write(image, "png", new File("image.jpg"));

        return image;

    }

    private void drawImage( BufferedImage image ) {

        // Reading pixels from given image
        // Source: https://www.tutorialspoint.com/how-to-get-pixels-rgb-values-of-an-image-using-java-opencv-library#:~:text=Get%20the%20pixel%20value%20at,and%20getBlue()%20methods%20respectively

        for ( int y = 0; y < image.getHeight(); y++ ) {
            for ( int x = 0; x < image.getWidth(); x++ ) {

                int pixel = image.getRGB(x, y);
                Color color = new Color(pixel, true);

                ArrayList<Double> distances = getEuclideanDistances(color.getRed(), color.getGreen(), color.getBlue());

                int minIndex = distances.indexOf(Collections.min(distances));
                Block pixelBlock = new Location( loc.getWorld(), loc.getX() + x, loc.getY(), loc.getZ() + y ).getBlock();

                pixelBlock.setType(blocks[minIndex].getBlock().getMaterial());
                pixelBlock.setData(blocks[minIndex].getBlock().getData());

            }

        }

    }

    private ArrayList<Double> getEuclideanDistances( int red, int green, int blue ) {

        ArrayList<Double> distances = new ArrayList<>();

        int blockRed, blockGreen, blockBlue;

        for ( Blocks block : blocks ) {

            blockRed = block.getBlock().getRed();
            blockGreen = block.getBlock().getGreen();
            blockBlue = block.getBlock().getBlue();

            // Euclidean Distance
            // Source: https://www.baeldung.com/cs/compute-similarity-of-colours

            distances.add(Math.sqrt(0.3 * ((red - blockRed) * (red - blockRed)) + 0.59 * ((green - blockGreen) * (green - blockGreen)) + 0.11 * ((blue - blockBlue) * (blue - blockBlue))));

        }

        return distances;

    }

}
