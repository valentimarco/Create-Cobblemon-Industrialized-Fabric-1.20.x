package net.crumbs.createcobblemon.item;

import net.crumbs.createcobblemon.CreateCobblemonIndustrialized;
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
                    .icon(() -> new ItemStack(ModItems.RED_BALL_LID)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RED_BALL_LID);
                        entries.add(ModItems.BLUE_BALL_LID);

                    }).build());


    public static void registerItemGroups() {
        CreateCobblemonIndustrialized.LOGGER.info("Registering Item Groups for" + CreateCobblemonIndustrialized.MOD_ID);
    }
}
