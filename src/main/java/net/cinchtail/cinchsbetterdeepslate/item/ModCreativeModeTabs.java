package net.cinchtail.cinchsbetterdeepslate.item;

import net.cinchtail.cinchsbetterdeepslate.CinchsBetterDeepslate;
import net.cinchtail.cinchsbetterdeepslate.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB,
            CinchsBetterDeepslate.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CINCHSBETTERDEEPSLATE_TAB = CREATIVE_MODE_TABS.register("cinchsbetterdeepslate_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get()))
                    .title(Component.literal("Cinch's Better Deepslate Tab"))
                    .displayItems((displayParameters, output) -> {
                        output.accept(ModBlocks.MOSSY_COBBLED_DEEPSLATE.get());
                        output.accept(ModBlocks.MOSSY_COBBLED_DEEPSLATE_STAIRS.get());
                        output.accept(ModBlocks.MOSSY_COBBLED_DEEPSLATE_SLAB.get());
                        output.accept(ModBlocks.MOSSY_COBBLED_DEEPSLATE_WALL.get());
                        output.accept(ModBlocks.MOSSY_DEEPSLATE_BRICKS.get());
                        output.accept(ModBlocks.MOSSY_DEEPSLATE_BRICK_STAIRS.get());
                        output.accept(ModBlocks.MOSSY_DEEPSLATE_BRICK_SLAB.get());
                        output.accept(ModBlocks.MOSSY_DEEPSLATE_BRICK_WALL.get());
                        output.accept(ModBlocks.MOSSY_DEEPSLATE_TILES.get());
                        output.accept(ModBlocks.MOSSY_DEEPSLATE_TILE_STAIRS.get());
                        output.accept(ModBlocks.MOSSY_DEEPSLATE_TILE_SLAB.get());
                        output.accept(ModBlocks.MOSSY_DEEPSLATE_TILE_WALL.get());
                        output.accept(ModBlocks.DEEPSLATE_STAIRS.get());
                        output.accept(ModBlocks.DEEPSLATE_SLAB.get());
                        output.accept(ModBlocks.DEEPSLATE_WALL.get());
                        output.accept(ModBlocks.POLISHED_DEEPSLATE_PRESSURE_PLATE.get());
                        output.accept(ModBlocks.POLISHED_DEEPSLATE_BUTTON.get());
                        output.accept(ModItems.DEEPSLATE_SWORD.get());
                        output.accept(ModItems.DEEPSLATE_PICKAXE.get());
                        output.accept(ModItems.DEEPSLATE_AXE.get());
                        output.accept(ModItems.DEEPSLATE_SHOVEL.get());
                        output.accept(ModItems.DEEPSLATE_HOE.get());
                        output.accept(ModItems.BLACKSTONE_SWORD.get());
                        output.accept(ModItems.BLACKSTONE_PICKAXE.get());
                        output.accept(ModItems.BLACKSTONE_AXE.get());
                        output.accept(ModItems.BLACKSTONE_SHOVEL.get());
                        output.accept(ModItems.BLACKSTONE_HOE.get());
                    }).build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
