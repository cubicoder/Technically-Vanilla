package cubicoder.technicallyvanilla.data.client;

import cubicoder.technicallyvanilla.TechnicallyVanilla;
import cubicoder.technicallyvanilla.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ExistingFileHelper;

public class BlockStates extends BlockStateProvider {

	public BlockStates(DataGenerator gen, ExistingFileHelper exFileHelper) {
		super(gen, TechnicallyVanilla.MODID, exFileHelper);
	}

	@Override
	protected void registerStatesAndModels() {
		this.simpleBlock(ModBlocks.STEEL_BLOCK.get());
	}
	
}
