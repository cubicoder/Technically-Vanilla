package cubicoder.technicallyvanilla.item;

import cubicoder.technicallyvanilla.TechnicallyVanilla;
import cubicoder.technicallyvanilla.block.ModBlocks;
import cubicoder.technicallyvanilla.data.ModTags;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TechnicallyVanilla.MODID);
	public static final DeferredRegister<Item> BLOCK_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TechnicallyVanilla.MODID);
	
	// ITEMS
	public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot", () -> new Item(group(TechnicallyVanilla.TEST_TAB)));
	
	public static final RegistryObject<AxeItem> STEEL_AXE          = ITEMS.register("steel_axe", () -> new AxeItem(ModItems.STEEL_TOOL_MATERIAL, 6.0F, -3.1F, group(TechnicallyVanilla.TEST_TAB)));
	public static final RegistryObject<PickaxeItem> STEEL_PICKAXE  = ITEMS.register("steel_pickaxe", () -> new PickaxeItem(ModItems.STEEL_TOOL_MATERIAL, 1, -2.8F, group(TechnicallyVanilla.TEST_TAB)));
	public static final RegistryObject<HoeItem> STEEL_HOE          = ITEMS.register("steel_hoe", () -> new HoeItem(ModItems.STEEL_TOOL_MATERIAL, -2, -1.0F, group(TechnicallyVanilla.TEST_TAB)));
	public static final RegistryObject<ShovelItem> STEEL_SHOVEL    = ITEMS.register("steel_shovel", () -> new ShovelItem(ModItems.STEEL_TOOL_MATERIAL, 1.5F, -3.0F, group(TechnicallyVanilla.TEST_TAB)));
	public static final RegistryObject<SwordItem> STEEL_SWORD      = ITEMS.register("steel_sword", () -> new SwordItem(ModItems.STEEL_TOOL_MATERIAL, 3, -2.4F, group(TechnicallyVanilla.TEST_TAB)));
	
	public static final RegistryObject<ArmorItem> STEEL_HELMET      = ITEMS.register("steel_helmet", () -> new ArmorItem(ModItems.STEEL_ARMOR_MATERIAL, EquipmentSlotType.HEAD, group(TechnicallyVanilla.TEST_TAB)));
	public static final RegistryObject<ArmorItem> STEEL_CHESTPLATE  = ITEMS.register("steel_chestplate", () -> new ArmorItem(ModItems.STEEL_ARMOR_MATERIAL, EquipmentSlotType.CHEST, group(TechnicallyVanilla.TEST_TAB)));
	public static final RegistryObject<ArmorItem> STEEL_LEGGINGS    = ITEMS.register("steel_leggings", () -> new ArmorItem(ModItems.STEEL_ARMOR_MATERIAL, EquipmentSlotType.LEGS, group(TechnicallyVanilla.TEST_TAB)));
	public static final RegistryObject<ArmorItem> STEEL_BOOTS       = ITEMS.register("steel_boots", () -> new ArmorItem(ModItems.STEEL_ARMOR_MATERIAL, EquipmentSlotType.FEET, group(TechnicallyVanilla.TEST_TAB)));

	// BLOCK ITEMS
	public static final RegistryObject<Item> STEEL_BLOCK   = ITEMS.register("steel_block", () -> new BlockItem(ModBlocks.STEEL_BLOCK.get(), group(TechnicallyVanilla.TEST_TAB)));
	
	private static Item.Properties group(ItemGroup group) {
		return new Item.Properties().group(group);
	}
	
	public static final IArmorMaterial STEEL_ARMOR_MATERIAL = new IArmorMaterial() {

		private final int[] durabilities = new int[]{13, 15, 16, 11};
		private final int[] damageArray = new int[] {2, 5, 6, 2};
		
		@Override
		public int getDurability(EquipmentSlotType slotIn) {
			return durabilities[slotIn.getIndex()] * 25;
		}

		@Override
		public int getDamageReductionAmount(EquipmentSlotType slotIn) {
			return damageArray[slotIn.getIndex()];
		}

		@Override
		public int getEnchantability() {
			return 9;
		}

		@Override
		public SoundEvent getSoundEvent() {
			return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return Ingredient.fromTag(ModTags.Items.INGOTS_STEEL);
		}

		@Override
		public String getName() {
			return TechnicallyVanilla.MODID + ":steel";
		}

		@Override
		public float getToughness() {
			return 1.0F;
		}

		@Override
		public float getKnockbackResistance() {
			return 0;
		}
		
	};
	
	public static final IItemTier STEEL_TOOL_MATERIAL = new IItemTier() {

		@Override
		public int getMaxUses() {
			return 750;
		}

		@Override
		public float getEfficiency() {
			return 6.0F;
		}

		@Override
		public float getAttackDamage() {
			return 2.0F;
		}

		@Override
		public int getHarvestLevel() {
			return 2;
		}

		@Override
		public int getEnchantability() {
			return 14;
		}

		@Override
		public Ingredient getRepairMaterial() {
			return Ingredient.fromTag(ModTags.Items.INGOTS_STEEL);
		}
		
	};
	
}
