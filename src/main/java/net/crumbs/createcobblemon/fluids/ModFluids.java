package net.crumbs.createcobblemon.fluids;

import net.crumbs.createcobblemon.CreateCobblemonIndustrialized;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModFluids {

    public static final VirtualFluid MEDICINAL_BREW = Registry.register(Registries.FLUID, asResource("medicinal_brew"), new VirtualFluid());
    public static final VirtualFluid ETHER = Registry.register(Registries.FLUID, asResource("ether"), new VirtualFluid());
    public static final VirtualFluid ELIXIR = Registry.register(Registries.FLUID, asResource("elixir"), new VirtualFluid());
    public static final VirtualFluid POTION = Registry.register(Registries.FLUID, asResource("potion"), new VirtualFluid());
    public static final VirtualFluid HYPER_POTION = Registry.register(Registries.FLUID, asResource("hyper_potion"), new VirtualFluid());
    public static final VirtualFluid FULL_HEAL = Registry.register(Registries.FLUID, asResource("full_heal"), new VirtualFluid());
    public static final VirtualFluid ANTIDOTE = Registry.register(Registries.FLUID, asResource("antidote"), new VirtualFluid());
    public static final VirtualFluid AWAKENING = Registry.register(Registries.FLUID, asResource("awakening"), new VirtualFluid());
    public static final VirtualFluid BURN_HEAL = Registry.register(Registries.FLUID, asResource("burn_heal"), new VirtualFluid());
    public static final VirtualFluid ICE_HEAL = Registry.register(Registries.FLUID, asResource("ice_heal"), new VirtualFluid());
    public static final VirtualFluid PARALYZE_HEAL = Registry.register(Registries.FLUID, asResource("paralyze_heal"), new VirtualFluid());
    public static final VirtualFluid MAX_ETHER = Registry.register(Registries.FLUID, asResource("max_ether"), new VirtualFluid());
    public static final VirtualFluid MAX_ELIXIR = Registry.register(Registries.FLUID, asResource("max_elixir"), new VirtualFluid());
    public static final VirtualFluid SUPER_POTION = Registry.register(Registries.FLUID, asResource("super_potion"), new VirtualFluid());
    public static final VirtualFluid MAX_POTION = Registry.register(Registries.FLUID, asResource("max_potion"), new VirtualFluid());
    public static final VirtualFluid FULL_RESTORE = Registry.register(Registries.FLUID, asResource("full_restore"), new VirtualFluid());

    public static void registerModFluids() {
        CreateCobblemonIndustrialized.LOGGER.info("Registering Mod Fluids for " + CreateCobblemonIndustrialized.MOD_ID);
    }


    public static void onInitializeClient() {
        // This entrypoint is suitable for setting up client-specific logic, such as rendering.
        CreateCobblemonIndustrialized.LOGGER.info("Registering Clientside Fluid rendering for " + CreateCobblemonIndustrialized.MOD_ID);

        FluidRenderHandlerRegistry.INSTANCE.register(MEDICINAL_BREW,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x2ebca2
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ETHER,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xd8a8e0
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ELIXIR,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xf1b097
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(POTION,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xab90ce
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(HYPER_POTION,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xf59bdd
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(FULL_HEAL,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xf7ef3f
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ANTIDOTE,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xfffa8d
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(AWAKENING,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x92faff
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(BURN_HEAL,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x97ffb8
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(ICE_HEAL,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xffd0cc
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(PARALYZE_HEAL,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xedff7a
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(MAX_ETHER,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xb9f197
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(MAX_ELIXIR,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x97f1e4
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(SUPER_POTION,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0xe1978d
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(MAX_POTION,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x869eee
        ));
        FluidRenderHandlerRegistry.INSTANCE.register(FULL_RESTORE,new SimpleFluidRenderHandler(
                new Identifier("minecraft:block/water_still"),
                new Identifier("minecraft:block/water_flow"),
                0x9bd77f
        ));
    }

    public static Identifier asResource(String id){
        return new Identifier(CreateCobblemonIndustrialized.MOD_ID, id);
    }


}
