package mod.robeyclay.modid;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public class ItemTier implements IItemTier {
    public int maxUses;
    public float efficiency;
    public float attackDamage;
    public int harvestLevel;
    public int enchantability;
    public Ingredient repairMat;

    public ItemTier(int maxUses, float efficiency, float attackDamage, int harvestLevel, int enchantability, Ingredient repairMat) {
        this.maxUses = maxUses;
        this.efficiency = efficiency;
        this.attackDamage = attackDamage;
        this.harvestLevel = harvestLevel;
        this.enchantability = enchantability;
        this.repairMat = repairMat;
    }

    @Override
    public int getEnchantability() {
        return enchantability;
    }

    @Override
    public int getMaxUses() {
        return maxUses;
    }

    @Override
    public int getHarvestLevel() {
        return harvestLevel;
    }

    @Override
    public float getEfficiency() {
        return efficiency;
    }

    @Override
    public float getAttackDamage() {
        return attackDamage;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return repairMat;
    }
}
