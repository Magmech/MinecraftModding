package mod.robeyclay.modid;

import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

//Tells forge that this class is a mod and should be loaded with other mods
@Mod(FirstMod.MODID)
public class FirstMod {
    //the MODID being used in the mods.toml file
    public static final String MODID = "firstmod";

    public static final Logger LOGGER = LogManager.getLogger();
    public static final ItemTier FirstSwordItemTier = new ItemTier(10, 100.0F, 100.0F, 4, 1, Ingredient.EMPTY);


    public FirstMod() {
        //prints string into Log when Mod is loading
      //  LOGGER.debug("Hello From my First Mod!");
    }


}
