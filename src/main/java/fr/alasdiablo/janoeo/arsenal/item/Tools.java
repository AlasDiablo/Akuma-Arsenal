package fr.alasdiablo.janoeo.arsenal.item;

import fr.alasdiablo.diolib.util.RegistryHelper;
import fr.alasdiablo.janoeo.arsenal.Arsenal;
import fr.alasdiablo.janoeo.arsenal.util.ItemsTiers;
import fr.alasdiablo.janoeo.arsenal.util.Registries;
import net.minecraft.item.*;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@SuppressWarnings("unused")
public class Tools {

    private static final Item.Properties PROPERTIES = new Item.Properties().group(Arsenal.setup.janoeoToolGroup);

    public static Item COPPER_AXE = new AxeItem(ItemsTiers.COPPER, 6.5f, -3.15f, PROPERTIES).setRegistryName(Registries.COPPER_AXE);
    public static Item COPPER_HOE = new HoeItem(ItemsTiers.COPPER, -1, -1.5f, PROPERTIES).setRegistryName(Registries.COPPER_HOE);
    public static Item COPPER_PICKAXE = new PickaxeItem(ItemsTiers.COPPER, 1, -2.8f, PROPERTIES).setRegistryName(Registries.COPPER_PICKAXE);
    public static Item COPPER_SHOVEL = new ShovelItem(ItemsTiers.COPPER, 1.5f, -3.0f, PROPERTIES).setRegistryName(Registries.COPPER_SHOVEL);
    public static Item COPPER_SWORD = new SwordItem(ItemsTiers.COPPER, 3, -2.4f, PROPERTIES).setRegistryName(Registries.COPPER_SWORD);

    public static Item ALUMINIUM_AXE = new AxeItem(ItemsTiers.ALUMINIUM, 6.5f, -3.15f, PROPERTIES).setRegistryName(Registries.ALUMINIUM_AXE);
    public static Item ALUMINIUM_HOE = new HoeItem(ItemsTiers.ALUMINIUM, -1, -1.5f, PROPERTIES).setRegistryName(Registries.ALUMINIUM_HOE);
    public static Item ALUMINIUM_PICKAXE = new PickaxeItem(ItemsTiers.ALUMINIUM, 1, -2.8f, PROPERTIES).setRegistryName(Registries.ALUMINIUM_PICKAXE);
    public static Item ALUMINIUM_SHOVEL = new ShovelItem(ItemsTiers.ALUMINIUM, 1.5f, -3.0f, PROPERTIES).setRegistryName(Registries.ALUMINIUM_SHOVEL);
    public static Item ALUMINIUM_SWORD = new SwordItem(ItemsTiers.ALUMINIUM, 3, -2.4f, PROPERTIES).setRegistryName(Registries.ALUMINIUM_SWORD);

    public static Item TIN_AXE = new AxeItem(ItemsTiers.TIN, 6.5f, -3.15f, PROPERTIES).setRegistryName(Registries.TIN_AXE);
    public static Item TIN_HOE = new HoeItem(ItemsTiers.TIN, -1, -1.5f, PROPERTIES).setRegistryName(Registries.TIN_HOE);
    public static Item TIN_PICKAXE = new PickaxeItem(ItemsTiers.TIN, 1, -2.8f, PROPERTIES).setRegistryName(Registries.TIN_PICKAXE);
    public static Item TIN_SHOVEL = new ShovelItem(ItemsTiers.TIN, 1.5f, -3.0f, PROPERTIES).setRegistryName(Registries.TIN_SHOVEL);
    public static Item TIN_SWORD = new SwordItem(ItemsTiers.TIN, 3, -2.4f, PROPERTIES).setRegistryName(Registries.TIN_SWORD);

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onItemsRegistry(final RegistryEvent.Register<Item> event) {
            try {
                RegistryHelper.registerItem(event.getRegistry(),
                        COPPER_AXE, COPPER_HOE, COPPER_PICKAXE, COPPER_SHOVEL, COPPER_SWORD,
                        ALUMINIUM_AXE, ALUMINIUM_HOE, ALUMINIUM_PICKAXE, ALUMINIUM_SHOVEL, ALUMINIUM_SWORD,
                        TIN_AXE, TIN_HOE, TIN_PICKAXE, TIN_SHOVEL, TIN_SWORD
                );
            } catch (IllegalStateException ignored) {}
        }
    }
}
