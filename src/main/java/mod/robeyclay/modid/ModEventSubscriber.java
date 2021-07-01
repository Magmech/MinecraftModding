package mod.robeyclay.modid;

import mod.robeyclay.itemmods.init.ModItemGroups;
import mod.robeyclay.itemmods.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.material.Material;
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

    public final static SwordItem EXAMPLE_SWORD = new SwordItem(FirstMod.GOD, 10, 10, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));
    public final static ShovelItem EXAMPLE_SHOVEL = new ShovelItem(FirstMod.GOD, 10, 10, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));
    public final static PickaxeItem EXAMPLE_PICKAXE = new PickaxeItem(FirstMod.GOD, 10, 10, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));
    public final static AxeItem EXAMPLE_AXE = new AxeItem(FirstMod.GOD, 10, 10, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));
    public static final HoeItem EXAMPLE_HOE = new HoeItem(FirstMod.GOD, 10, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));
    public static final ArmorItem EXAMPLE_HEAD = new ArmorItem(FirstMod.GOD_HELMET, EquipmentSlotType.HEAD, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));
    public static final ArmorItem EXAMPLE_CHEST = new ArmorItem(FirstMod.GOD_CHESTPLATE, EquipmentSlotType.CHEST, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));
    public static final ArmorItem EXAMPLE_LEGS = new ArmorItem(FirstMod.GOD_LEGS, EquipmentSlotType.LEGS, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));
    public static final ArmorItem EXAMPLE_BOOTS = new ArmorItem(FirstMod.GOD_BOOTS, EquipmentSlotType.FEET, new Item.Properties().group(ModItemGroups.MOD_ITEM_GROUP));
    public static final Block EXAMPLE_BLOCK = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F, 3.0F));

    //Tells Forge this method is listening for an event
    @SubscribeEvent
    //Item names must be registered (Mapped) to Item instances in order for the game to recognize it

    public static void onRegisterItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                setup(ModItems.EXAMPLE_INGOT, "example_ingot")
        );

        event.getRegistry().registerAll(
                setup(EXAMPLE_SWORD, "example_sword")
        );
        event.getRegistry().registerAll(
                setup(EXAMPLE_SHOVEL, "example_shovel")
        );
        event.getRegistry().registerAll(
                setup(EXAMPLE_PICKAXE, "example_pickaxe")
        );
        event.getRegistry().registerAll(
                setup(EXAMPLE_AXE, "example_axe")
        );
        event.getRegistry().registerAll(
                setup(EXAMPLE_HOE, "example_hoe")
        );
        event.getRegistry().registerAll(
                setup(EXAMPLE_HEAD, "example_head")
        );
        event.getRegistry().registerAll(
                setup(EXAMPLE_CHEST, "example_chest")
        );
        event.getRegistry().registerAll(
                setup(EXAMPLE_LEGS, "example_legs")
        );
        event.getRegistry().registerAll(
                setup(EXAMPLE_BOOTS, "example_boots")
        );

    }

    //public final Block EXAMPLE_BLOCK;
    @SubscribeEvent
    public static void onRegisterBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(
             //setup(EXAMPLE_BLOCK, "example_block")
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
