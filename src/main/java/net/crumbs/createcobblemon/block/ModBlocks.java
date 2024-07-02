package net.crumbs.createcobblemon.block;

import net.crumbs.createcobblemon.CreateCobblemonIndustrialized;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block EXPQUARTZBLOCK = registerBlock("expquartzblock", new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.GREEN)));
    public static final Block EXP_QUARTZ_TILES = registerBlock("exp_quartz_tiles", new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.GREEN)));
    public static final Block EXP_QUARTZ_SMALL_TILES = registerBlock("exp_quartz_small_tiles", new Block(FabricBlockSettings.copyOf(Blocks.STONE).sounds(BlockSoundGroup.AMETHYST_BLOCK).mapColor(MapColor.GREEN)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CreateCobblemonIndustrialized.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(CreateCobblemonIndustrialized.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        CreateCobblemonIndustrialized.LOGGER.info("Registering Mod Blocks for " + CreateCobblemonIndustrialized.MOD_ID);
    }
}
