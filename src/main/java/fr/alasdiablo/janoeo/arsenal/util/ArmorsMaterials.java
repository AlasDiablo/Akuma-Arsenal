package fr.alasdiablo.janoeo.arsenal.util;

import fr.alasdiablo.janoeo.init.IngotsItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;

/**
 * List of all armor materials
 */
public enum ArmorsMaterials implements IArmorMaterial {

    BLACK_WOOL_ARMOR(Registries.BLACK_WOOL_ARMOR, 5, new int[] {1, 2, 3, 1} ,25, Ingredient.fromItems(Registries.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.2f, 0F),
    BLUE_WOOL_ARMOR(Registries.BLUE_WOOL_ARMOR, 5, new int[] {1, 2, 3, 1} ,25, Ingredient.fromItems(Registries.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.2f, 0F),
    BROWN_WOOL_ARMOR(Registries.BROWN_WOOL_ARMOR, 5, new int[] {1, 2, 3, 1} ,25, Ingredient.fromItems(Registries.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.2f, 0F),
    CYAN_WOOL_ARMOR(Registries.CYAN_WOOL_ARMOR, 5, new int[] {1, 2, 3, 1} ,25, Ingredient.fromItems(Registries.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.2f, 0F),
    GRAY_WOOL_ARMOR(Registries.GRAY_WOOL_ARMOR, 5, new int[] {1, 2, 3, 1} ,25, Ingredient.fromItems(Registries.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.2f, 0F),
    GREEN_WOOL_ARMOR(Registries.GREEN_WOOL_ARMOR, 5, new int[] {1, 2, 3, 1} ,25, Ingredient.fromItems(Registries.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.2f, 0F),
    LIGHT_BLUE_WOOL_ARMOR(Registries.LIGHT_BLUE_WOOL_ARMOR, 5, new int[] {1, 2, 3, 1} ,25, Ingredient.fromItems(Registries.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.2f, 0F),
    LIGHT_GRAY_WOOL_ARMOR(Registries.LIGHT_GRAY_WOOL_ARMOR, 5, new int[] {1, 2, 3, 1} ,25, Ingredient.fromItems(Registries.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.2f, 0F),
    LIME_WOOL_ARMOR(Registries.LIME_WOOL_ARMOR, 5, new int[] {1, 2, 3, 1} ,25, Ingredient.fromItems(Registries.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.2f, 0F),
    MAGENTA_WOOL_ARMOR(Registries.MAGENTA_WOOL_ARMOR, 5, new int[] {1, 2, 3, 1} ,25, Ingredient.fromItems(Registries.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.2f, 0F),
    ORANGE_WOOL_ARMOR(Registries.ORANGE_WOOL_ARMOR, 5, new int[] {1, 2, 3, 1} ,25, Ingredient.fromItems(Registries.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.2f, 0F),
    PINK_WOOL_ARMOR(Registries.PINK_WOOL_ARMOR, 5, new int[] {1, 2, 3, 1} ,25, Ingredient.fromItems(Registries.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.2f, 0F),
    PURPLE_WOOL_ARMOR(Registries.PURPLE_WOOL_ARMOR, 5, new int[] {1, 2, 3, 1} ,25, Ingredient.fromItems(Registries.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.2f, 0F),
    RED_WOOL_ARMOR(Registries.RED_WOOL_ARMOR, 5, new int[] {1, 2, 3, 1} ,25, Ingredient.fromItems(Registries.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.2f, 0F),
    WHITE_WOOL_ARMOR(Registries.WHITE_WOOL_ARMOR, 5, new int[] {1, 2, 3, 1} ,25, Ingredient.fromItems(Registries.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.2f, 0F),
    YELLOW_WOOL_ARMOR(Registries.YELLOW_WOOL_ARMOR, 5, new int[] {1, 2, 3, 1} ,25, Ingredient.fromItems(Registries.WOOLS_LIST), SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0.2f, 0F),
    COPPER_ARMOR(Registries.COPPER_ARMOR,  7, new int[]{1, 3, 5, 2}, 9, Ingredient.fromStacks(new ItemStack(IngotsItems.COPPER_INGOT)), SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0F),
    ALUMINIUM_ARMOR(Registries.ALUMINIUM_ARMOR,  6, new int[]{1, 2, 4, 1}, 6, Ingredient.fromStacks(new ItemStack(IngotsItems.ALUMINIUM_INGOT)), SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0F),
    LEAD_ARMOR(Registries.LEAD_ARMOR,  5, new int[]{1, 2, 4, 1}, 5, Ingredient.fromStacks(new ItemStack(IngotsItems.LEAD_INGOT)), SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0F),
    SILVER_ARMOR(Registries.SILVER_ARMOR,  15, new int[]{2, 5, 6, 2}, 25, Ingredient.fromStacks(new ItemStack(IngotsItems.SILVER_INGOT)), SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F, 0F),
    TIN_ARMOR(Registries.TIN_ARMOR, 6, new int[]{1, 2, 4, 1}, 7, Ingredient.fromStacks(new ItemStack(IngotsItems.TIN_INGOT)), SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0F),
    URANIUM_ARMOR(Registries.URANIUM_ARMOR,  12, new int[]{2, 5, 6, 2}, 9, Ingredient.fromStacks(new ItemStack(IngotsItems.URANIUM_INGOT)), SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F, 0F);

    /**
     * name of the material
     */
    private String name;

    /**
     * durability of the material
     */
    private int[] durability;

    /**
     * damage reduction of the material
     */
    private int[] damageReductionAmount;

    /**
     * enchantability of the material
     */
    private int enchantability;

    /**
     * repair material(item use for repair the armor) of the material
     */
    private Ingredient repairMaterial;

    /**
     * sound(sound use on equipe) of the material
     */
    private SoundEvent soundEvent;

    /**
     * toughness of the material
     */
    private float toughness;

    private float knockBackResistance;

    /**
     * default constructor
     * @param name name of the material
     * @param durability durability of the material
     * @param damageReductionAmount damage reduction of the material
     * @param enchantability enchantability of the material
     * @param repairItem repair material(item use for repair the armor) of the material
     * @param soundEvent sound(sound use on equipe) of the material
     * @param toughness toughness of the material
     */
    ArmorsMaterials(String name, int durability, int[] damageReductionAmount, int enchantability, Ingredient repairItem, SoundEvent soundEvent, float toughness, float knockBackResistance) {
        final int[] max_damge_arry = new int[] {13, 15, 16, 11};
        this.damageReductionAmount = damageReductionAmount;
        this.toughness = toughness;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.durability = new int[4];
        for (int i = 0; i < 4; i++) {
            this.durability[i] = max_damge_arry[i] * durability;
        }
        this.repairMaterial = repairItem;
        this.name = Registries.MOD_ID + ":" + name;
        this.knockBackResistance = knockBackResistance;
    }

    /**
     * use for get the durability
     * @param equipmentSlot select the armor piece (head, body, ...)
     * @return the value of the durability
     */
    @Override
    public int getDurability(EquipmentSlotType equipmentSlot) {
        return this.durability[equipmentSlot.getIndex()];
    }

    /**
     * use for get the damage reduction
     * @param equipmentSlot select the armor piece (head, body, ...)
     * @return returne the damage reduction
     */
    @Override
    public int getDamageReductionAmount(EquipmentSlotType equipmentSlot) {
        return this.damageReductionAmount[equipmentSlot.getIndex()];
    }

    /**
     * use for get the enchatability
     * @return the value of the enchatability
     */
    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    /**
     * use for get the equipe sound
     * @return the sound of the armor
     */
    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    /**
     * use for get the item use for repair the armor
     * @return an ingredient corresponding to the item
     */
    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial;
    }

    /**
     * use for get the name of the materials
     * @return the name of the materials
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * use for get the toughness
     * @return the toughness
     */
    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float func_230304_f_() {
        return this.knockBackResistance;
    }
}