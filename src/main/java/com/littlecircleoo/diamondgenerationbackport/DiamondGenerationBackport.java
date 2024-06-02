package com.littlecircleoo.diamondgenerationbackport;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;

public class DiamondGenerationBackport implements ModInitializer {

    public static final RegistryKey<PlacedFeature> ORE_DIAMOND_MEDIUM = RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier("minecraft","ore_diamond_medium"));

    @Override
    public void onInitialize() {

        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ORE_DIAMOND_MEDIUM);

    }
}