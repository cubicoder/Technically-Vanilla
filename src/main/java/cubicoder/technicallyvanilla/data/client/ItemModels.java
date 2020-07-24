package cubicoder.technicallyvanilla.data.client;

import cubicoder.technicallyvanilla.TechnicallyVanilla;
import cubicoder.technicallyvanilla.block.ModBlocks;
import cubicoder.technicallyvanilla.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ExistingFileHelper;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;

public class ItemModels extends ItemModelProvider {

	public ItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
		super(generator, TechnicallyVanilla.MODID, existingFileHelper);
	}

	@Override
	protected void registerModels() {
		// items
		generated(ModItems.STEEL_INGOT.get());
		
		handheld(ModItems.STEEL_AXE.get());
		handheld(ModItems.STEEL_PICKAXE.get());
		handheld(ModItems.STEEL_HOE.get());
		handheld(ModItems.STEEL_SHOVEL.get());
		handheld(ModItems.STEEL_SWORD.get());

		handheld(ModItems.STEEL_HELMET.get());
		handheld(ModItems.STEEL_CHESTPLATE.get());
		handheld(ModItems.STEEL_LEGGINGS.get());
		handheld(ModItems.STEEL_BOOTS.get());
		
		// block items
		blockItem(ModBlocks.STEEL_BLOCK.get());
	}

	private ItemModelBuilder generated(Item item) {
		ResourceLocation name = item.getRegistryName();
		return super.withExistingParent(name.toString(), new ResourceLocation("minecraft:item/generated")).texture("layer0", ITEM_FOLDER + "/" + name.getPath());
	}
	
	private ItemModelBuilder handheld(Item item) {
		ResourceLocation name = item.getRegistryName();
		return super.withExistingParent(name.toString(), new ResourceLocation("minecraft:item/handheld")).texture("layer0", ITEM_FOLDER + "/" + name.getPath());
	}
	
	private ItemModelBuilder withExistingParent(Item item, Item parent) {
		return super.withExistingParent(item.getRegistryName().toString(), parent.getRegistryName());
	}
	
	private ItemModelBuilder blockItem(Block block) {
		ResourceLocation name = block.getRegistryName();
		return super.withExistingParent(name.getPath(), new ResourceLocation(name.getNamespace(), BLOCK_FOLDER + "/" + name.getPath()));
	}
	
}
