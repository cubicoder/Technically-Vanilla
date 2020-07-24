package cubicoder.technicallyvanilla.data;

import cubicoder.technicallyvanilla.data.client.BlockStates;
import cubicoder.technicallyvanilla.data.client.ItemModels;
import cubicoder.technicallyvanilla.data.client.Lang;
import cubicoder.technicallyvanilla.data.common.BlockTagGens;
import cubicoder.technicallyvanilla.data.common.ItemTagGens;
import cubicoder.technicallyvanilla.data.common.LootTables;
import cubicoder.technicallyvanilla.data.common.Recipes;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class DataGenerators {

	@SubscribeEvent
	public static void gatherData(GatherDataEvent event) {
		DataGenerator gen = event.getGenerator();
		
		if (event.includeServer()) {
			BlockTagGens blockTagGens = new BlockTagGens(gen);
			gen.addProvider(new Recipes(gen));
			gen.addProvider(new LootTables(gen));
			gen.addProvider(new ItemTagGens(gen, blockTagGens));
			gen.addProvider(blockTagGens);
		}
		if (event.includeClient()) {
			gen.addProvider(new BlockStates(gen, event.getExistingFileHelper()));
			gen.addProvider(new ItemModels(gen, event.getExistingFileHelper()));
			gen.addProvider(new Lang(gen));
		}
	}
	
}
