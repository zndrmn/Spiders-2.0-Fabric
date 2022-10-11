package com.nyfaria.spiderstpo.common;

import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
	public static final TagKey<Block> NON_CLIMBABLE = TagKey.create(Registry.BLOCK_REGISTRY,new ResourceLocation("spiderstpo:non_climbable"));
}
