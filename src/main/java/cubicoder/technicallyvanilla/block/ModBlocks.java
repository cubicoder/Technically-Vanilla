package cubicoder.technicallyvanilla.block;

import cubicoder.technicallyvanilla.TechnicallyVanilla;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModBlocks {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TechnicallyVanilla.MODID);
	
	public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", () -> new Block(Block.Properties.create(Material.IRON, MaterialColor.GRAY).setRequiresTool().hardnessAndResistance(5.0F, 16.0F).sound(SoundType.METAL)));

}
