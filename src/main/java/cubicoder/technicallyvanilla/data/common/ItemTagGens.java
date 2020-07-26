package cubicoder.technicallyvanilla.data.common;

import cubicoder.technicallyvanilla.data.ModTags;
import cubicoder.technicallyvanilla.item.ModItems;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;

public class ItemTagGens extends ItemTagsProvider {

	public ItemTagGens(DataGenerator generator, BlockTagsProvider blockTags) {
		super(generator, blockTags);
	}

	@Override
	protected void registerTags() {
		this.copy(ModTags.Blocks.STORAGE_BLOCKS_STEEL, ModTags.Items.STORAGE_BLOCKS_STEEL);

		this.getOrCreateBuilder(Tags.Items.INGOTS).add(ModItems.STEEL_INGOT.get());
		this.getOrCreateBuilder(ModTags.Items.INGOTS_STEEL).add(ModItems.STEEL_INGOT.get());
	}
	
}
