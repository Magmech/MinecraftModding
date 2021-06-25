package mod.robeyclay.modid;

import mod.robeyclay.itemmods.init.ModItemGroups;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
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
public final class ModEventSubscriber {

    //Tells Forge this method is listening for an event
    @SubscribeEvent
    //Item names must be registered (Mapped) to Item instances in order for the game to recognize it
    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                setup(new Item(new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "example_item")
        );
        event.getRegistry().registerAll(
                setup(new SwordItem(FirstMod.FirstSwordItemTier, 10, 100, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP)), "example_sword")
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
