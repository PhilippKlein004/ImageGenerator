package de.philippklein.blocks;

import org.bukkit.Material;

/**
 * @author Philipp Klein (PhilippKlein004 @ GitHub)
 * @since 04.17.2025
 * @version 1.0
 */

public class ImageBlock {

    private Material material;
    private byte data;
    int red, green, blue;

    public ImageBlock( Material material, byte data, int red, int green, int blue ) {
        this.material = material;
        this.data = data;
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public Material getMaterial() {
        return material;
    }

    public byte getData() {
        return data;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

}
