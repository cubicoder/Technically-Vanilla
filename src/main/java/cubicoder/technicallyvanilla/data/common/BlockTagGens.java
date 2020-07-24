package cubicoder.technicallyvanilla.data.common;

import cubicoder.technicallyvanilla.block.ModBlocks;
import cubicoder.technicallyvanilla.data.ModTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;

public class BlockTagGens extends BlockTagsProvider {

	public BlockTagGens(DataGenerator generatorIn) {
		super(generatorIn);
	}

	@Override
	protected void registerTags() {
		this.func_240522_a_(ModTags.Blocks.STORAGE_BLOCKS_STEEL).func_240532_a_(ModBlocks.STEEL_BLOCK.get());
	}
	
}
