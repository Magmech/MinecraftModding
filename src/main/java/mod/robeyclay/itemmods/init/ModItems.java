package mod.robeyclay.itemmods.init;

import mod.robeyclay.modid.FirstMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.registries.ObjectHolder;

//Forge will look at every field in the class and set the value of each field. The value of the field will be set to the object field type's registry that has a registry name made up of the parameter
@ObjectHolder(FirstMod.MODID)
//This class is for the creation of static references for mod items
public class ModItems {
    public static final Item EXAMPLE_INGOT = new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));
    public static final SwordItem EXAMPLE_SWORD = new SwordItem(FirstMod.GOD, 10, 10, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));
  //  public static final ShovelItem EXAMPLE_SHOVEL = new ShovelItem(FirstMod.GOD, 10, 10, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));
 //   public static final PickaxeItem EXAMPLE_PICKAXE = new PickaxeItem(FirstMod.GOD, 10, 10, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));
 //   public static final AxeItem EXAMPLE_AXE = new AxeItem(FirstMod.GOD, 10, 10, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));
 //   public static final HoeItem EXAMPLE_HOE = new HoeItem(FirstMod.GOD, 10, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));
   // public static final ArmorItem EXAMPLE_HEAD = new ArmorItem(FirstMod.LEATHER_HELMET, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));

}
