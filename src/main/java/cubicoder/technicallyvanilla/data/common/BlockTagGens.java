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
		this.getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_STEEL).add(ModBlocks.STEEL_BLOCK.get());
	}
	
}
