package net.crumbs.createcobblemon.fluids;

import net.crumbs.createcobblemon.CreateCobblemonIndustrialized;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.util.Identifier;

public class ModFluidsClient {


    public static void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
        CreateCobblemonIndustrialized.LOGGER.info("Registering Clientside Fluid rendering for " + CreateCobblemonIndustrialized.MOD_ID);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MEDICINAL_BREW,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x2ebca2
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.ETHER,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xd8a8e0
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.ELIXIR,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xf1b097
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.POTION,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xab90ce
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.HYPER_POTION,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xf59bdd
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.FULL_HEAL,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xf7ef3f
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.ANTIDOTE,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xfffa8d
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.AWAKENING,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x92faff
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.BURN_HEAL,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x97ffb8
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.ICE_HEAL,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xffd0cc
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.PARALYZE_HEAL,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xedff7a
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MAX_ETHER,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xb9f197
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MAX_ELIXIR,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x97f1e4
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.SUPER_POTION,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xe1978d
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MAX_POTION,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x869eee
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.FULL_RESTORE,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x9bd77f
        ));
    }

}
