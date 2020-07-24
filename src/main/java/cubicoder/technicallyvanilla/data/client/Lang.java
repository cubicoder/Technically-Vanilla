package cubicoder.technicallyvanilla.data.client;

import cubicoder.technicallyvanilla.TechnicallyVanilla;
import cubicoder.technicallyvanilla.block.ModBlocks;
import cubicoder.technicallyvanilla.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class Lang extends LanguageProvider {

	public Lang(DataGenerator gen) {
		super(gen, TechnicallyVanilla.MODID, "en_us");
	}

	@Override
	protected void addTranslations() {
		// items
		add(ModItems.STEEL_INGOT.get(), "Steel Ingot");
		
		add(ModItems.STEEL_AXE.get(), "Steel Axe");
		add(ModItems.STEEL_PICKAXE.get(), "Steel Pickaxe");
		add(ModItems.STEEL_HOE.get(), "Steel Hoe");
		add(ModItems.STEEL_SHOVEL.get(), "Steel Shovel");
		add(ModItems.STEEL_SWORD.get(), "Steel Sword");

		add(ModItems.STEEL_HELMET.get(), "Steel Helmet");
		add(ModItems.STEEL_CHESTPLATE.get(), "Steel Chestplate");
		add(ModItems.STEEL_LEGGINGS.get(), "Steel Leggings");
		add(ModItems.STEEL_BOOTS.get(), "Steel Boots");
		
		// blocks
		add(ModBlocks.STEEL_BLOCK.get(), "Block of Steel");
		
		// other
		add(TechnicallyVanilla.TEST_TAB.getTranslationKey(), "Technically Vanilla");
	}

}
