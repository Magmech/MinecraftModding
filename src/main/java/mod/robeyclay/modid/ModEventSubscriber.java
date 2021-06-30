package mod.robeyclay.modid;

import mod.robeyclay.itemmods.init.ModItemGroups;
import mod.robeyclay.itemmods.init.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.IForgeRegistryEntry;

/*Indicates to Forge that this class contains methods that should be subscribed to handle events
    Contains Parameters:
        modid: tells Forge that this class is a part of your mod
        bus: tells Forge that @SubscribeEvent methods in this class should receive events from the MOD event bus
        value:
 */
@EventBusSubscriber(modid = FirstMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public final class ModEventSubscriber extends Items {

    //Tells Forge this method is listening for an event
    @SubscribeEvent
    //Item names must be registered (Mapped) to Item instances in order for the game to recognize it
    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                setup(ModItems.EXAMPLE_INGOT, "example_ingot")
        );
        event.getRegistry().registerAll(
            setup(new SwordItem(FirstMod.GOD, 10, 10, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "example_sword")
        );
        event.getRegistry().registerAll(
                setup(new ShovelItem(FirstMod.GOD, 10, 10, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "example_shovel")
        );
        event.getRegistry().registerAll(
                setup(new PickaxeItem(FirstMod.GOD, 10, 10, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "example_pickaxe")
        );
        event.getRegistry().registerAll(
                setup(new AxeItem(FirstMod.GOD, 10, 10, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "example_axe")
        );
        event.getRegistry().registerAll(
                setup(new HoeItem(FirstMod.GOD, 10, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "example_hoe")
        );
        event.getRegistry().registerAll(
                setup(new ArmorItem(FirstMod.LEATHER_HELMET, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "example_head")
        );

    }

    //Next 2 methods allow for the registers to be properly called and created as they are fragile and can easily break other mods
    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name) {
        return setup(entry, new ResourceLocation(FirstMod.MODID, name));
    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName) {
        entry.setRegistryName(registryName);
        return entry;
    }
}
