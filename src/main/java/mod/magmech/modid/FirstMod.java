package mod.magmech.modid;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

//Tells forge that this class is a mod and should be loaded with other mods
@Mod(FirstMod.MODID)
public class FirstMod {
    //the MODID being used in the mods.toml file
    public static final String MODID = "firstmod";

    public static final Logger LOGGER = LogManager.getLogger();

    public FirstMod() {
        //prints string into Log when Mod is loading
      //  LOGGER.debug("Hello From my First Mod!");
    }
}
