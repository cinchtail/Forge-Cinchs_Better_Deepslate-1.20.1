package net.cinchtail.cinchsbetterdeepslate.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier BLACKSTONE = new ForgeTier(1,131,4,1f,5,
            BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(Items.BLACKSTONE));
    public static final ForgeTier DEEPSLATE = new ForgeTier(1,251,4,1f,5,
            BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(Items.DEEPSLATE));
}
