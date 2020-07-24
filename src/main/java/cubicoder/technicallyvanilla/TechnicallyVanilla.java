package cubicoder.technicallyvanilla;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cubicoder.technicallyvanilla.block.ModBlocks;
import cubicoder.technicallyvanilla.item.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(TechnicallyVanilla.MODID)
public class TechnicallyVanilla {
	
	public static final String MODID = "technicallyvanilla";
	
	private static final Logger LOGGER = LogManager.getLogger(MODID);

	public static final ItemGroup TEST_TAB = new ItemGroup(MODID + ".tab") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(ModItems.STEEL_INGOT.get());
		}
	};
	
	public TechnicallyVanilla() {
		LOGGER.info("constructingtest " + MODID);
		
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ModBlocks.BLOCKS.register(modEventBus);
		ModItems.ITEMS.register(modEventBus);
		ModItems.BLOCK_ITEMS.register(modEventBus);
	}

}
