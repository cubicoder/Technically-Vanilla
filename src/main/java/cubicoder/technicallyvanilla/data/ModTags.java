package cubicoder.technicallyvanilla.data;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class ModTags {

	public static class Blocks {
		public static final ITag.INamedTag<Block> STORAGE_BLOCKS_STEEL = BlockTags.makeWrapperTag(new ResourceLocation("forge", "storage_blocks/steel").toString());
	}
	
	public static class Items {
		public static final ITag.INamedTag<Item> INGOTS_STEEL = ItemTags.makeWrapperTag(new ResourceLocation("forge", "ingots/steel").toString());
		
		public static final ITag.INamedTag<Item> STORAGE_BLOCKS_STEEL = ItemTags.makeWrapperTag(new ResourceLocation("forge", "storage_blocks/steel").toString());
	}
		
}
