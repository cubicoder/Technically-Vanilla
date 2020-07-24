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
		this.func_240522_a_(Tags.Items.INGOTS).func_240534_a_(ModItems.STEEL_INGOT.get());
		this.func_240522_a_(ModTags.Items.INGOTS_STEEL).func_240534_a_(ModItems.STEEL_INGOT.get());
		
		this.func_240521_a_(ModTags.Blocks.STORAGE_BLOCKS_STEEL, ModTags.Items.STORAGE_BLOCKS_STEEL);
	}
	
}
