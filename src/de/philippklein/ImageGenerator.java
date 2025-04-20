package de.philippklein;

import de.philippklein.commands.*;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Philipp Klein (PhilippKlein004 @ GitHub)
 * @since 04.17.2025
 * @version 1.0
 *
 * GENERAL INFORMATION
 * This application is a Proof-Of-Concept for myself. It's not
 * designed for the max. amount of efficiency and compatability.
 *
 */

public class ImageGenerator extends JavaPlugin {

    @Override
    public void onEnable() {

        System.out.println("[ImageGenerator] Plugin was started!");

        new ImageGeneratorCommand(this);
        new GenerateImageCommand(this);
        new ClearImageCommand(this);

    }

    @Override
    public void onDisable() {
        System.out.println("[ImageGenerator] Plugin has been disabled!");
    }

}
