package net.crumbs.createcobblemon;

import net.fabricmc.api.ClientModInitializer;
import net.crumbs.createcobblemon.fluids.ModFluidsClient;

public class CreateCobblemonIndustrializedClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ModFluidsClient.onInitializeClient();
    }
}
