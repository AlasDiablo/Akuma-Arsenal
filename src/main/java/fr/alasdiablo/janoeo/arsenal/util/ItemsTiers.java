package fr.alasdiablo.janoeo.arsenal.util;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum ItemsTiers implements IItemTier {
    COPPER(2, 32, 6.0f, 1.5f, 9, () -> { try { return Ingredient.fromTag(LocalTags.Ingot.COPPER); } catch (IllegalStateException e) {return null;} }),
    ALUMINIUM(2, 28, 5.0f, 1.0f, 6, () -> { try { return Ingredient.fromTag(LocalTags.Ingot.ALUMINIUM); } catch (IllegalStateException e) {return null;} }),
    TIN(2, 30, 5.5f, 1.25f, 7, () -> { try { return Ingredient.fromTag(LocalTags.Ingot.TIN); } catch (IllegalStateException e) {return null;} });

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> repairMaterialSupplierIn;

    ItemsTiers(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialSupplierIn) {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterialSupplierIn = repairMaterialSupplierIn;
    }

    @Override
    public int getMaxUses() {
        return this.maxUses;
    }

    @Override
    public float getEfficiency() {
        return this.efficiency;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterialSupplierIn.get();
    }
}
