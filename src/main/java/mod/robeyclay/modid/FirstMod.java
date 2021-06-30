package mod.robeyclay.modid;

import mod.robeyclay.itemmods.init.ModItemGroups;
import mod.robeyclay.itemmods.init.ModItems;
import net.minecraft.inventory.CraftResultInventory;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

//Tells forge that this class is a mod and should be loaded with other mods
@Mod(FirstMod.MODID)
public class FirstMod {
    //the MODID being used in the mods.toml file
    public static final String MODID = "firstmod";

    public static final Logger LOGGER = LogManager.getLogger();
    public static final ItemTier WOOD = new ItemTier(59, 2.0F, 0.0F, 0, 15, Ingredient.EMPTY);
    public static final ItemTier STONE = new ItemTier(131, 4.0F, 1.0F, 1, 1, Ingredient.EMPTY);
    public static final ItemTier IRON = new ItemTier(250, 6.0F, 2.0F, 2, 14, Ingredient.fromItems(Items.IRON_INGOT));
    public static final ItemTier GOLD = new ItemTier(32, 12.0F, 0.0F, 0, 22, Ingredient.fromItems(Items.GOLD_INGOT));
    public static final ItemTier DIAMOND = new ItemTier(1561,8.0F, 3.0F, 3, 10, Ingredient.fromItems(Items.DIAMOND));
    public static final ItemTier NETHERITE = new ItemTier(2031, 9.0F, 4.0F, 4, 15, Ingredient.fromItems(Items.DIAMOND));
    public static final ItemTier GOD = new ItemTier(50000, 1000.0F, 1000.0F, 4, 50, Ingredient.fromItems(ModItems.EXAMPLE_INGOT.getItem()));

    public static final ArmorTier LEATHER_HELMET = new ArmorTier(55,1, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, Ingredient.fromItems(Items.LEATHER), "leather_helmet", 0F);
    public static final ArmorTier LEATHER_CHESTPLATE = new ArmorTier(80,3, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, Ingredient.fromItems(Items.LEATHER), "leather_chest", 0F);
    public static final ArmorTier LEATHER_LEGS = new ArmorTier(75,2, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, Ingredient.fromItems(Items.LEATHER), "leather_legs", 0F);
    public static final ArmorTier LEATHER_BOOTS = new ArmorTier(65,1, 15, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, Ingredient.fromItems(Items.LEATHER), "leather_boots", 0F);

    public static final ArmorTier CHAIN_HELMET = new ArmorTier(165, 2, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, Ingredient.EMPTY, "chain_helmet", 0F);
    public static final ArmorTier CHAIN_CHESTPLATE = new ArmorTier(240, 5, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, Ingredient.EMPTY, "chain_chest", 0F);
    public static final ArmorTier CHAIN_LEGS = new ArmorTier(225, 4, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, Ingredient.EMPTY, "chain_legs", 0F);
    public static final ArmorTier CHAIN_BOOTS = new ArmorTier(195, 1, 12, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, Ingredient.EMPTY, "chain_boots", 0F);

    public static final ArmorTier IRON_HELMET = new ArmorTier(165, 2, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromItems(Items.IRON_INGOT), "iron_helmet", 0F);
    public static final ArmorTier IRON_CHESTPLATE = new ArmorTier(240, 6, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromItems(Items.IRON_INGOT), "iron_chest", 0F);
    public static final ArmorTier IRON_LEGS = new ArmorTier(225, 5, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromItems(Items.IRON_INGOT), "iron_legs", 0F);
    public static final ArmorTier IRON_BOOTS = new ArmorTier(195, 2, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, Ingredient.fromItems(Items.IRON_INGOT), "iron_boots", 0F);

    public static final ArmorTier GOLD_HELMET = new ArmorTier(77, 2, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, Ingredient.fromItems(Items.GOLD_INGOT), "gold_helmet", 0F);
    public static final ArmorTier GOLD_CHESTPLATE = new ArmorTier(112, 5, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, Ingredient.fromItems(Items.GOLD_INGOT), "gold_chest", 0F);
    public static final ArmorTier GOLD_LEGS = new ArmorTier(105, 3, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, Ingredient.fromItems(Items.GOLD_INGOT), "gold_legs", 0F);
    public static final ArmorTier GOLD_BOOTS = new ArmorTier(91, 1, 25, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, Ingredient.fromItems(Items.GOLD_INGOT), "gold_boots", 0F);

    public static final ArmorTier DIAMOND_HELMET = new ArmorTier(363, 3, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, Ingredient.fromItems(Items.DIAMOND), "diamond_helmet", 2F);
    public static final ArmorTier DIAMOND_CHESTPLATE = new ArmorTier(528, 8, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, Ingredient.fromItems(Items.DIAMOND), "diamond_chest", 2F);
    public static final ArmorTier DIAMOND_LEGS = new ArmorTier(495, 6, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, Ingredient.fromItems(Items.DIAMOND), "diamond_legs", 2F);
    public static final ArmorTier DIAMOND_BOOTS = new ArmorTier(429, 3, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, Ingredient.fromItems(Items.DIAMOND), "diamond_boots", 2F);

    public static final ArmorTier NETHERITE_HELMET = new ArmorTier(407, 3, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, Ingredient.fromItems(Items.DIAMOND), "netherite_helmet", 3F);
    public static final ArmorTier NETHERITE_CHESTPLATE = new ArmorTier(592, 8, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, Ingredient.fromItems(Items.DIAMOND), "netherite_chest", 3F);
    public static final ArmorTier NETHERITE_LEGS = new ArmorTier(555, 6, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, Ingredient.fromItems(Items.DIAMOND), "netherite_legs", 3F);
    public static final ArmorTier NETHERITE_BOOTS = new ArmorTier(481, 3, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, Ingredient.fromItems(Items.DIAMOND), "netherite_boots", 3F);

    public static final ArmorTier GOD_HELMET = new ArmorTier(50000, 20, 50, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, Ingredient.fromItems(ModItems.EXAMPLE_INGOT.getItem()), "god_helmet", 20F);
    public static final ArmorTier GOD_CHESTPLATE = new ArmorTier(50000, 20, 50, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, Ingredient.fromItems(ModItems.EXAMPLE_INGOT.getItem()), "god_chest", 20F);
    public static final ArmorTier GOD_LEGS = new ArmorTier(50000, 20, 50, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, Ingredient.fromItems(ModItems.EXAMPLE_INGOT.getItem()), "god_legs", 20F);
    public static final ArmorTier GOD_BOOTS = new ArmorTier(50000, 20, 50, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, Ingredient.fromItems(ModItems.EXAMPLE_INGOT.getItem()), "god_boots", 20F);


    public FirstMod() {
        //prints string into Log when Mod is loading
      //  LOGGER.debug("Hello From my First Mod!");
    }



}
