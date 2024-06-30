package net.crumbs.createcobblemon.item;

import net.crumbs.createcobblemon.CreateCobblemonIndustrialized;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RED_BALL_LID = registerItem("red_ball_lid", new Item(new FabricItemSettings()));
    public static final Item BLUE_BALL_LID = registerItem("blue_ball_lid", new Item(new FabricItemSettings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CreateCobblemonIndustrialized.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CreateCobblemonIndustrialized.LOGGER.info("Registering Mod Items for" + CreateCobblemonIndustrialized.MOD_ID);

    }
}
