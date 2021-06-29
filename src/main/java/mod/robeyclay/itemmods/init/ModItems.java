package mod.robeyclay.itemmods.init;

import mod.robeyclay.modid.FirstMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.registries.ObjectHolder;

//Forge will look at every field in the class and set the value of each field. The value of the field will be set to the object field type's registry that has a registry name made up of the parameter
@ObjectHolder(FirstMod.MODID)
//This class is for the creation of static references for mod items
public class ModItems {
    public static final Item example_ingot = null;
}
