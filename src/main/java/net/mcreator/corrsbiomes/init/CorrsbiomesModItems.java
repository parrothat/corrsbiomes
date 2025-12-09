/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.corrsbiomes.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.corrsbiomes.CorrsbiomesMod;

public class CorrsbiomesModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(CorrsbiomesMod.MODID);
	public static final DeferredItem<Item> GRAY_LEAVES;
	static {
		GRAY_LEAVES = block(CorrsbiomesModBlocks.GRAY_LEAVES);
	}

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block) {
		return block(block, new Item.Properties());
	}

	private static DeferredItem<Item> block(DeferredHolder<Block, Block> block, Item.Properties properties) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), properties));
	}
}