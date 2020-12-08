package fr.alasdiablo.janoeo.arsenal.item;

import fr.alasdiablo.diolib.util.RegistryHelper;
import fr.alasdiablo.janoeo.arsenal.Arsenal;
import fr.alasdiablo.janoeo.arsenal.util.ArmorsMaterials;
import fr.alasdiablo.janoeo.arsenal.util.Registries;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@SuppressWarnings("unused")
public class Armors {

    private static final Item.Properties PROPERTIES = new Item.Properties().group(Arsenal.setup.janoeoArmorGroup);

    public static Item ALUMINIUM_HELMET = new ArmorItem(ArmorsMaterials.ALUMINIUM_ARMOR, EquipmentSlotType.HEAD, PROPERTIES).setRegistryName(Registries.ALUMINIUM_HELMET);
    public static Item ALUMINIUM_CHESTPLATE = new ArmorItem(ArmorsMaterials.ALUMINIUM_ARMOR, EquipmentSlotType.CHEST, PROPERTIES).setRegistryName(Registries.ALUMINIUM_CHESTPLATE);
    public static Item ALUMINIUM_LEGGINGS = new ArmorItem(ArmorsMaterials.ALUMINIUM_ARMOR, EquipmentSlotType.LEGS, PROPERTIES).setRegistryName( Registries.ALUMINIUM_LEGGINGS);
    public static Item ALUMINIUM_BOOTS = new ArmorItem(ArmorsMaterials.ALUMINIUM_ARMOR, EquipmentSlotType.FEET, PROPERTIES).setRegistryName(Registries.ALUMINIUM_BOOTS);

    public static Item COPPER_HELMET = new ArmorItem(ArmorsMaterials.COPPER_ARMOR, EquipmentSlotType.HEAD, PROPERTIES).setRegistryName(Registries.COPPER_HELMET);
    public static Item COPPER_CHESTPLATE = new ArmorItem(ArmorsMaterials.COPPER_ARMOR, EquipmentSlotType.CHEST, PROPERTIES).setRegistryName(Registries.COPPER_CHESTPLATE);
    public static Item COPPER_LEGGINGS = new ArmorItem(ArmorsMaterials.COPPER_ARMOR, EquipmentSlotType.LEGS, PROPERTIES).setRegistryName( Registries.COPPER_LEGGINGS);
    public static Item COPPER_BOOTS = new ArmorItem(ArmorsMaterials.COPPER_ARMOR, EquipmentSlotType.FEET, PROPERTIES).setRegistryName(Registries.COPPER_BOOTS);

    public static Item LEAD_HELMET = new ArmorItem(ArmorsMaterials.LEAD_ARMOR, EquipmentSlotType.HEAD, PROPERTIES).setRegistryName(Registries.LEAD_HELMET);
    public static Item LEAD_CHESTPLATE = new ArmorItem(ArmorsMaterials.LEAD_ARMOR, EquipmentSlotType.CHEST, PROPERTIES).setRegistryName(Registries.LEAD_CHESTPLATE);
    public static Item LEAD_LEGGINGS = new ArmorItem(ArmorsMaterials.LEAD_ARMOR, EquipmentSlotType.LEGS, PROPERTIES).setRegistryName( Registries.LEAD_LEGGINGS);
    public static Item LEAD_BOOTS = new ArmorItem(ArmorsMaterials.LEAD_ARMOR, EquipmentSlotType.FEET, PROPERTIES).setRegistryName(Registries.LEAD_BOOTS);

    public static Item SILVER_HELMET = new ArmorItem(ArmorsMaterials.SILVER_ARMOR, EquipmentSlotType.HEAD, PROPERTIES).setRegistryName(Registries.SILVER_HELMET);
    public static Item SILVER_CHESTPLATE = new ArmorItem(ArmorsMaterials.SILVER_ARMOR, EquipmentSlotType.CHEST, PROPERTIES).setRegistryName(Registries.SILVER_CHESTPLATE);
    public static Item SILVER_LEGGINGS = new ArmorItem(ArmorsMaterials.SILVER_ARMOR, EquipmentSlotType.LEGS, PROPERTIES).setRegistryName( Registries.SILVER_LEGGINGS);
    public static Item SILVER_BOOTS = new ArmorItem(ArmorsMaterials.SILVER_ARMOR, EquipmentSlotType.FEET, PROPERTIES).setRegistryName(Registries.SILVER_BOOTS);

    public static Item TIN_HELMET = new ArmorItem(ArmorsMaterials.TIN_ARMOR, EquipmentSlotType.HEAD, PROPERTIES).setRegistryName(Registries.TIN_HELMET);
    public static Item TIN_CHESTPLATE = new ArmorItem(ArmorsMaterials.TIN_ARMOR, EquipmentSlotType.CHEST, PROPERTIES).setRegistryName(Registries.TIN_CHESTPLATE);
    public static Item TIN_LEGGINGS = new ArmorItem(ArmorsMaterials.TIN_ARMOR, EquipmentSlotType.LEGS, PROPERTIES).setRegistryName( Registries.TIN_LEGGINGS);
    public static Item TIN_BOOTS = new ArmorItem(ArmorsMaterials.TIN_ARMOR, EquipmentSlotType.FEET, PROPERTIES).setRegistryName(Registries.TIN_BOOTS);

    public static Item URANIUM_HELMET = new ArmorItem(ArmorsMaterials.URANIUM_ARMOR, EquipmentSlotType.HEAD, PROPERTIES).setRegistryName(Registries.URANIUM_HELMET);
    public static Item URANIUM_CHESTPLATE = new ArmorItem(ArmorsMaterials.URANIUM_ARMOR, EquipmentSlotType.CHEST, PROPERTIES).setRegistryName(Registries.URANIUM_CHESTPLATE);
    public static Item URANIUM_LEGGINGS = new ArmorItem(ArmorsMaterials.URANIUM_ARMOR, EquipmentSlotType.LEGS, PROPERTIES).setRegistryName( Registries.URANIUM_LEGGINGS);
    public static Item URANIUM_BOOTS = new ArmorItem(ArmorsMaterials.URANIUM_ARMOR, EquipmentSlotType.FEET, PROPERTIES).setRegistryName(Registries.URANIUM_BOOTS);

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            try {
                RegistryHelper.registerItem(event.getRegistry(),
                        ALUMINIUM_HELMET, ALUMINIUM_CHESTPLATE, ALUMINIUM_LEGGINGS, ALUMINIUM_BOOTS,
                        COPPER_HELMET, COPPER_CHESTPLATE, COPPER_LEGGINGS, COPPER_BOOTS,
                        LEAD_HELMET, LEAD_CHESTPLATE, LEAD_LEGGINGS, LEAD_BOOTS,
                        SILVER_HELMET, SILVER_CHESTPLATE, SILVER_LEGGINGS, SILVER_BOOTS,
                        TIN_HELMET, TIN_CHESTPLATE, TIN_LEGGINGS, TIN_BOOTS,
                        URANIUM_HELMET, URANIUM_CHESTPLATE, URANIUM_LEGGINGS, URANIUM_BOOTS
                );
            } catch (IllegalStateException ignored) {}

        }
    }
}
