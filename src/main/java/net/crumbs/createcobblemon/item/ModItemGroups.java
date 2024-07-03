package net.crumbs.createcobblemon.item;

import net.crumbs.createcobblemon.CreateCobblemonIndustrialized;
import net.crumbs.createcobblemon.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup CREATE_COBBLEMON = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CreateCobblemonIndustrialized.MOD_ID, "create_cobblemon"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.create_cobblemon"))
                    .icon(() -> new ItemStack(ModItems.INCOMPLETE_POKE_BALL)).entries((displayContext, entries) -> {
                        entries.add(ModItems.EXP_QUARTZ);
                        entries.add(ModItems.CRUSHED_EXP_QUARTZ);
                        entries.add(ModBlocks.EXPQUARTZBLOCK);
                        entries.add(ModBlocks.EXP_QUARTZ_TILES);
                        entries.add(ModBlocks.EXP_QUARTZ_SMALL_TILES);

                        entries.add(ModItems.IRON_BALL_BASE);
                        entries.add(ModItems.RED_BALL_LID);
                        entries.add(ModItems.YELLOW_BALL_LID);
                        entries.add(ModItems.GREEN_BALL_LID);
                        entries.add(ModItems.BLUE_BALL_LID);
                        entries.add(ModItems.PINK_BALL_LID);
                        entries.add(ModItems.BLACK_BALL_LID);
                        entries.add(ModItems.WHITE_BALL_LID);
                        entries.add(ModItems.GREAT_BALL_LID);
                        entries.add(ModItems.ULTRA_BALL_LID);
                        entries.add(ModItems.SAFARI_BALL_LID);
                        entries.add(ModItems.FAST_BALL_LID);
                        entries.add(ModItems.LEVEL_BALL_LID);
                        entries.add(ModItems.LURE_BALL_LID);
                        entries.add(ModItems.HEAVY_BALL_LID);
                        entries.add(ModItems.LOVE_BALL_LID);
                        entries.add(ModItems.FRIEND_BALL_LID);
                        entries.add(ModItems.MOON_BALL_LID);
                        entries.add(ModItems.SPORT_BALL_LID);
                        entries.add(ModItems.PARK_BALL_LID);
                        entries.add(ModItems.NET_BALL_LID);
                        entries.add(ModItems.DIVE_BALL_LID);
                        entries.add(ModItems.NEST_BALL_LID);
                        entries.add(ModItems.REPEAT_BALL_LID);
                        entries.add(ModItems.TIMER_BALL_LID);
                        entries.add(ModItems.LUXURY_BALL_LID);
                        entries.add(ModItems.DUSK_BALL_LID);
                        entries.add(ModItems.HEAL_BALL_LID);
                        entries.add(ModItems.QUICK_BALL_LID);
                        entries.add(ModItems.DREAM_BALL_LID);
                        entries.add(ModItems.BEAST_BALL_LID);
                        entries.add(ModItems.MASTER_BALL_LID);

                        entries.add(ModItems.TUMBLESTONE_LID);
                        entries.add(ModItems.SKY_TUMBLESTONE_LID);
                        entries.add(ModItems.BLACK_TUMBLESTONE_LID);
                        entries.add(ModItems.ANCIENT_RED_BALL_LID);
                        entries.add(ModItems.ANCIENT_YELLOW_BALL_LID);
                        entries.add(ModItems.ANCIENT_GREEN_BALL_LID);
                        entries.add(ModItems.ANCIENT_BLUE_BALL_LID);
                        entries.add(ModItems.ANCIENT_PINK_BALL_LID);
                        entries.add(ModItems.ANCIENT_BLACK_BALL_LID);
                        entries.add(ModItems.ANCIENT_WHITE_BALL_LID);
                        entries.add(ModItems.ANCIENT_GREAT_BALL_LID);
                        entries.add(ModItems.ANCIENT_ULTRA_BALL_LID);
                        entries.add(ModItems.ANCIENT_FEATHER_BALL_LID);
                        entries.add(ModItems.ANCIENT_WING_BALL_LID);
                        entries.add(ModItems.ANCIENT_JET_BALL_LID);
                        entries.add(ModItems.ANCIENT_HEAVY_BALL_LID);
                        entries.add(ModItems.ANCIENT_LEADEN_BALL_LID);
                        entries.add(ModItems.ANCIENT_GIGATON_BALL_LID);

                    }).build());


    public static void registerItemGroups() {
        CreateCobblemonIndustrialized.LOGGER.info("Registering Item Groups for " + CreateCobblemonIndustrialized.MOD_ID);
    }
}
