package cubicoder.technicallyvanilla.data.common;

import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

import cubicoder.technicallyvanilla.TechnicallyVanilla;
import cubicoder.technicallyvanilla.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.LootTableProvider;
import net.minecraft.data.loot.BlockLootTables;
import net.minecraft.loot.LootParameterSet;
import net.minecraft.loot.LootParameterSets;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.LootTableManager;
import net.minecraft.loot.ValidationTracker;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.ForgeRegistries;

public class LootTables extends LootTableProvider {

	private final List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> tables = ImmutableList.of(
			Pair.of(BlockTables::new, LootParameterSets.BLOCK)
			//Pair.of(FishingLootTables::new, LootParameterSets.FISHING),
            //Pair.of(ChestLootTables::new, LootParameterSets.CHEST),
            //Pair.of(EntityLootTables::new, LootParameterSets.ENTITY),
            //Pair.of(GiftLootTables::new, LootParameterSets.GIFT)
	);
	
	public LootTables(DataGenerator dataGeneratorIn) {
		super(dataGeneratorIn);
	}

	@Override
	protected List<Pair<Supplier<Consumer<BiConsumer<ResourceLocation, LootTable.Builder>>>, LootParameterSet>> getTables() {
		return tables;
	}
	
	@Override
	protected void validate(Map<ResourceLocation, LootTable> map, ValidationTracker validationtracker) {
		map.forEach((location, table) -> LootTableManager.func_227508_a_(validationtracker, location, table));
	}
	
	public static class BlockTables extends BlockLootTables {
		@Override
		protected void addTables() {
			this.registerDropSelfLootTable(ModBlocks.STEEL_BLOCK.get());
		}
		
		@Override
		protected Iterable<Block> getKnownBlocks() {
			return ForgeRegistries.BLOCKS.getValues().stream()
					.filter(b -> b.getRegistryName().getNamespace().equals(TechnicallyVanilla.MODID))
					.collect(Collectors.toList());
		}
	}
	
}
