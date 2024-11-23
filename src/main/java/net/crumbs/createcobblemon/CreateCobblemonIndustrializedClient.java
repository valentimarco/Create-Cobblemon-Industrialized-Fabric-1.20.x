package net.crumbs.createcobblemon;

import net.fabricmc.api.ClientModInitializer;
import net.crumbs.createcobblemon.fluids.ModFluids;

public class CreateCobblemonIndustrializedClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModFluids.onInitializeClient();
    }
}
