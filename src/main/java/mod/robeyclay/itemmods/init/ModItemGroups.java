package mod.robeyclay.itemmods.init;

import mod.robeyclay.modid.FirstMod;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;


import java.util.function.Supplier;

public class ModItemGroups {
    //A sub-class within ModItemGroups that builds a new ItemGroup for the mod items
    public static class ModItemGroup extends ItemGroup {

        private final Supplier<ItemStack> iconSupplier;

        public ModItemGroup(final String name, final Supplier<ItemStack> iconSupplier) {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        public ItemStack createIcon(){
            return iconSupplier.get();
        }
    }

    /*Sets up an ItemGroup with an icon
    The lambda is important since it creates a Supplier (object created without parameters) after the Items are loaded in
    ItemGroup are created before Items are registered causing a NullPointerException if the delay doesn't exist
     */
    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(FirstMod.MODID, () -> new ItemStack(ModItems.EXAMPLE_INGOT));
}
