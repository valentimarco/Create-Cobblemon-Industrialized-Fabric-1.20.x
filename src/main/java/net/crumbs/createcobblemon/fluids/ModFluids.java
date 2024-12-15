package net.crumbs.createcobblemon.fluids;

import net.crumbs.createcobblemon.CreateCobblemonIndustrialized;
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

    public static Identifier asResource(String id){
        return new Identifier(CreateCobblemonIndustrialized.MOD_ID, id);
    }


}
