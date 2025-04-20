package de.philippklein.blocks;

import org.bukkit.Material;

/**
 * @author Philipp Klein (PhilippKlein004 @ GitHub)
 * @since 04.17.2025
 * @version 1.0
 */

public enum Blocks {
    DIRT(new ImageBlock(Material.DIRT, (byte) 0, 80, 56, 41)),
    STONE(new ImageBlock(Material.STONE, (byte) 0, 87, 87, 87)),
    POLISHED_GRANITE(new ImageBlock(Material.STONE, (byte) 2, 107, 75, 65)),
    POLISHED_DIORITE(new ImageBlock(Material.STONE, (byte) 4, 141, 141, 143)),
    POLISHED_ANDESITE(new ImageBlock(Material.STONE, (byte) 6, 92, 92, 92)),
    OAK_PLANKS(new ImageBlock(Material.WOOD, (byte) 0, 108, 87, 57)),
    SPRUCE_PLANKS(new ImageBlock(Material.WOOD, (byte) 1, 79, 59, 38)),
    BIRCH_PLANKS(new ImageBlock(Material.WOOD, (byte) 2, 137, 124, 86)),
    JUNGLE_PLANKS(new ImageBlock(Material.WOOD, (byte) 3, 123, 88, 64)),
    ACACIA_PLANKS(new ImageBlock(Material.WOOD, (byte) 4, 128, 68, 42)),
    DARK_OAK_PLANKS(new ImageBlock(Material.WOOD, (byte) 5, 46, 31, 19)),
    SAND(new ImageBlock(Material.SAND, (byte) 0, 162, 155, 116)),
    RED_SAND(new ImageBlock(Material.SAND, (byte) 1, 108, 58, 30)),
    GRAVEL(new ImageBlock(Material.GRAVEL, (byte) 0, 81, 79, 77)),
    OAK_LOG(new ImageBlock(Material.LOG, (byte) 0, 60, 48, 32)),
    SPRUCE_LOG(new ImageBlock(Material.LOG, (byte) 1, 23, 15, 6)),
    BIRCH_LOG(new ImageBlock(Material.LOG, (byte) 2, 169, 168, 163)),
    JUNGLE_LOG(new ImageBlock(Material.LOG, (byte) 3, 53, 44, 21)),
    SPONGE(new ImageBlock(Material.SPONGE, (byte) 0, 142, 142, 72)),
    LAPIS_BLOCK(new ImageBlock(Material.LAPIS_BLOCK, (byte) 0, 19, 42, 100)),
    SANDSTONE(new ImageBlock(Material.SANDSTONE, (byte) 2, 165, 158, 124)),
    WHITE_WOOL(new ImageBlock(Material.WOOL, (byte) 0, 161, 161, 161)),
    ORANGE_WOOL(new ImageBlock(Material.WOOL, (byte) 1, 159, 88, 48)),
    MAGENTA_WOOL(new ImageBlock(Material.WOOL, (byte) 2, 127, 53, 132)),
    LIGHT_BLUE_WOOL(new ImageBlock(Material.WOOL, (byte) 3, 71, 94, 142)),
    YELLOW_WOOL(new ImageBlock(Material.WOOL, (byte) 4, 125, 116, 41)),
    LIGHT_GREEN_WOOL(new ImageBlock(Material.WOOL, (byte) 5, 49, 122, 48)),
    PINK_WOOL(new ImageBlock(Material.WOOL, (byte) 6, 150, 89, 104)),
    GREY_WOOL(new ImageBlock(Material.WOOL, (byte) 7, 43, 43, 43)),
    LIGHT_GREY_WOOL(new ImageBlock(Material.WOOL, (byte) 8, 108, 113, 113)),
    TURQUOISE_WOOL(new ImageBlock(Material.WOOL, (byte) 9, 35, 77, 95)),
    VIOLETT_WOOL(new ImageBlock(Material.WOOL, (byte) 10, 85, 42, 125)),
    BLUE_WOOL(new ImageBlock(Material.WOOL, (byte) 11, 32, 38, 95)),
    BROWN_WOOL(new ImageBlock(Material.WOOL, (byte) 12, 53, 34, 24)),
    GREEN_WOOL(new ImageBlock(Material.WOOL, (byte) 13, 38, 48, 24)),
    RED_WOOL(new ImageBlock(Material.WOOL, (byte) 14, 102, 36, 34)),
    BLACK_WOOL(new ImageBlock(Material.WOOL, (byte) 15, 20, 17, 17)),
    GOLDBLOCK(new ImageBlock(Material.GOLD_BLOCK, (byte) 0, 191, 187, 73)),
    IRONBLOCK(new ImageBlock(Material.IRON_BLOCK, (byte) 0, 166, 166, 166)),
    BRICK_BLOCK(new ImageBlock(Material.BRICK, (byte) 0, 90, 50, 41)),
    OBSIDIAN(new ImageBlock(Material.OBSIDIAN, (byte) 0, 16, 15, 21)),
    DIAMOND_BLOCK(new ImageBlock(Material.DIAMOND_BLOCK, (byte) 0, 97, 170, 166)),
    SNOW(new ImageBlock(Material.SNOW_BLOCK, (byte) 0, 181, 190, 190)),
    CLAY(new ImageBlock(Material.CLAY, (byte) 0, 109, 114, 122)),
    NETHERRACK(new ImageBlock(Material.NETHERRACK, (byte) 0, 124, 71, 71)),
    SOULSAND(new ImageBlock(Material.SOUL_SAND, (byte) 0, 52, 40, 33)),
    ENDSTONE(new ImageBlock(Material.ENDER_STONE, (byte) 0, 164, 164, 121)),
    EMERALD_BLOCK(new ImageBlock(Material.EMERALD_BLOCK, (byte) 0, 72, 172, 100)),
    QUARZ_BLOCK(new ImageBlock(Material.QUARTZ_BLOCK, (byte) 0, 176, 173, 168)),
    DARK_PRISMARINE(new ImageBlock(Material.PRISMARINE, (byte) 2, 57, 77, 70)),
    PRISMARINE(new ImageBlock(Material.PRISMARINE, (byte) 1, 71, 115, 104)),
    HAYBLOCK(new ImageBlock(Material.HAY_BLOCK, (byte) 0, 140, 118, 36)),
    COAL_BLOCK(new ImageBlock(Material.COAL_BLOCK, (byte) 0, 15, 15, 15)),
    PACKED_ICE(new ImageBlock(Material.PACKED_ICE, (byte) 0, 118, 138, 172)),
    HARDENED_CLAY(new ImageBlock(Material.HARD_CLAY, (byte) 0, 105, 64, 48)),
    WHITE_CLAY(new ImageBlock(Material.STAINED_CLAY, (byte) 0, 153, 128, 116)),
    ORANGE_CLAY(new ImageBlock(Material.STAINED_CLAY, (byte) 1, 113, 58, 32)),
    MAGENTA_CLAY(new ImageBlock(Material.STAINED_CLAY, (byte) 2, 104, 60, 75)),
    LIGHT_BLUE_CLAY(new ImageBlock(Material.STAINED_CLAY, (byte) 3, 78, 75, 95)),
    YELLOW_CLAY(new ImageBlock(Material.STAINED_CLAY, (byte) 4, 133, 93, 36)),
    LIGHT_GREEN_CLAY(new ImageBlock(Material.STAINED_CLAY, (byte) 5, 71, 81, 41)),
    PINK_CLAY(new ImageBlock(Material.STAINED_CLAY, (byte) 6, 114, 55, 54)),
    GREY_CLAY(new ImageBlock(Material.STAINED_CLAY, (byte) 7, 39, 30, 26)),
    LIGHT_GREY_CLAY(new ImageBlock(Material.STAINED_CLAY, (byte) 8, 93, 73, 68)),
    TURQUOISE_CLAY(new ImageBlock(Material.STAINED_CLAY, (byte) 9, 59, 62, 62)),
    VIOLETT_CLAY(new ImageBlock(Material.STAINED_CLAY, (byte) 10, 81, 49, 58)),
    BLUE_CLAY(new ImageBlock(Material.STAINED_CLAY, (byte) 11, 50, 41, 61)),
    BROWN_CLAY(new ImageBlock(Material.STAINED_CLAY, (byte) 12, 52, 36, 27)),
    GREEN_CLAY(new ImageBlock(Material.STAINED_CLAY, (byte) 13, 52, 56, 33)),
    RED_CLAY(new ImageBlock(Material.STAINED_CLAY, (byte) 14, 98, 43, 34)),
    BLACK_CLAY(new ImageBlock(Material.STAINED_CLAY, (byte) 15, 27, 18, 15)),
    RED_SANDSTONE(new ImageBlock(Material.RED_SANDSTONE, (byte) 2, 122, 62, 30)),
    ACACIA_LOG(new ImageBlock(Material.LOG_2, (byte) 0, 65, 61, 56)),
    DARK_OAK_LOG(new ImageBlock(Material.LOG_2, (byte) 1, 32, 26, 18)),
    REDSTONE_BLOCK(new ImageBlock(Material.REDSTONE_BLOCK, (byte) 0, 92, 20, 13));

    private final ImageBlock block;

    Blocks( ImageBlock block ) {
        this.block = block;
    }

    public ImageBlock getBlock() {
        return this.block;
    }

}
