package mod.robeyclay.modid;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;

public class ArmorTier implements IArmorMaterial {

    public int durability;
    public int dmgReduction;
    public int enchantability;
    public SoundEvent soundEvent;
    public Ingredient repMaterial;
    public String name;
    public float toughness;

    public ArmorTier(int durability, int dmgReduction, int enchantability, SoundEvent soundEvent, Ingredient repMaterial, String name, float toughness) {
        this.durability = durability;
        this.dmgReduction = dmgReduction;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.repMaterial = repMaterial;
        this.name = name;
        this.toughness = toughness;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return durability;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return dmgReduction;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial(){
        return repMaterial;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public float getToughness() {
        return toughness;
    }
}
