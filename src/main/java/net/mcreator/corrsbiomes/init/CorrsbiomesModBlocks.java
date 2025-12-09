/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.corrsbiomes.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.corrsbiomes.block.GrayLeavesBlock;
import net.mcreator.corrsbiomes.CorrsbiomesMod;

public class CorrsbiomesModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(CorrsbiomesMod.MODID);
	public static final DeferredBlock<Block> GRAY_LEAVES;
	static {
		GRAY_LEAVES = REGISTRY.register("gray_leaves", GrayLeavesBlock::new);
	}

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@EventBusSubscriber(Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			GrayLeavesBlock.blockColorLoad(event);
		}
	}
}