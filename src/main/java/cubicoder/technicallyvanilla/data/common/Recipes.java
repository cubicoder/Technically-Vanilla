package cubicoder.technicallyvanilla.data.common;

import java.util.function.Consumer;

import cubicoder.technicallyvanilla.TechnicallyVanilla;
import cubicoder.technicallyvanilla.block.ModBlocks;
import cubicoder.technicallyvanilla.data.ModTags;
import cubicoder.technicallyvanilla.item.ModItems;
import net.minecraft.data.CookingRecipeBuilder;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.IFinishedRecipe;
import net.minecraft.data.RecipeProvider;
import net.minecraft.data.ShapedRecipeBuilder;
import net.minecraft.data.ShapelessRecipeBuilder;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.Tags;

public class Recipes extends RecipeProvider {

	public Recipes(DataGenerator generatorIn) {
		super(generatorIn);
	}

	@Override
	protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
		//// CRAFTING RECIPES ////
		// item
		ShapelessRecipeBuilder.shapelessRecipe(ModItems.STEEL_INGOT.get(), 9)
				.addIngredient(ModBlocks.STEEL_BLOCK.get())
				.setGroup("steel_ingot")
				.addCriterion("has_steel_ingot", hasItem(ModBlocks.STEEL_BLOCK.get()))
				.build(consumer, new ResourceLocation(TechnicallyVanilla.MODID, "steel_ingot_from_steel_block"));
		
		ShapedRecipeBuilder.shapedRecipe(ModItems.STEEL_AXE.get())
				.patternLine("XX")
				.patternLine("#X")
				.patternLine("# ")
				.key('#', Tags.Items.RODS_WOODEN)
				.key('X', ModTags.Items.INGOTS_STEEL)
				.addCriterion("has_steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModItems.STEEL_PICKAXE.get())
				.patternLine("XXX")
				.patternLine(" # ")
				.patternLine(" # ")
				.key('#', Tags.Items.RODS_WOODEN)
				.key('X', ModTags.Items.INGOTS_STEEL)
				.addCriterion("has_steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModItems.STEEL_HOE.get())
				.patternLine("XX")
				.patternLine("# ")
				.patternLine("# ")
				.key('#', Tags.Items.RODS_WOODEN)
				.key('X', ModTags.Items.INGOTS_STEEL)
				.addCriterion("has_steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModItems.STEEL_SHOVEL.get())
				.patternLine("X")
				.patternLine("#")
				.patternLine("#")
				.key('#', Tags.Items.RODS_WOODEN)
				.key('X', ModTags.Items.INGOTS_STEEL)
				.addCriterion("has_steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModItems.STEEL_SWORD.get())
				.patternLine("X")
				.patternLine("X")
				.patternLine("#")
				.key('#', Tags.Items.RODS_WOODEN)
				.key('X', ModTags.Items.INGOTS_STEEL)
				.addCriterion("has_steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
				.build(consumer);
		
		ShapedRecipeBuilder.shapedRecipe(ModItems.STEEL_HELMET.get())
				.patternLine("XXX")
				.patternLine("X X")
				.key('X', ModTags.Items.INGOTS_STEEL)
				.addCriterion("has_steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModItems.STEEL_CHESTPLATE.get())
				.patternLine("X X")
				.patternLine("XXX")
				.patternLine("XXX")
				.key('X', ModTags.Items.INGOTS_STEEL)
				.addCriterion("has_steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModItems.STEEL_LEGGINGS.get())
				.patternLine("XXX")
				.patternLine("X X")
				.patternLine("X X")
				.key('X', ModTags.Items.INGOTS_STEEL)
				.addCriterion("has_steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
				.build(consumer);
		ShapedRecipeBuilder.shapedRecipe(ModItems.STEEL_BOOTS.get())
				.patternLine("X X")
				.patternLine("X X")
				.key('X', ModTags.Items.INGOTS_STEEL)
				.addCriterion("has_steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
				.build(consumer);
		
		// block
		ShapedRecipeBuilder.shapedRecipe(ModBlocks.STEEL_BLOCK.get())
				.patternLine("###")
				.patternLine("###")
				.patternLine("###")
				.key('#', ModTags.Items.INGOTS_STEEL)
				.addCriterion("has_steel_ingot", hasItem(ModTags.Items.INGOTS_STEEL))
				.build(consumer);
		
		//// SMELTING RECIPES ////
		
		
		//// BLASTING RECIPES ////
		CookingRecipeBuilder.blastingRecipe(Ingredient.fromTag(Tags.Items.INGOTS_IRON), ModItems.STEEL_INGOT.get(), 0.8F, 200)
				.addCriterion("has_iron_ingot", hasItem(Tags.Items.INGOTS_IRON))
				.build(consumer, new ResourceLocation(TechnicallyVanilla.MODID, "steel_ingot"));
	}
	
}
