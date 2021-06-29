package mod.robeyclay.modid;

import mod.robeyclay.itemmods.init.ModItems;
import net.minecraft.inventory.CraftResultInventory;
import net.minecraft.inventory.CraftingInventory;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.IItemProvider;
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


    public FirstMod() {
        //prints string into Log when Mod is loading
      //  LOGGER.debug("Hello From my First Mod!");
    }



}
