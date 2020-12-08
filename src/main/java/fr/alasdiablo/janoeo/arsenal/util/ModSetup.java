package fr.alasdiablo.janoeo.arsenal.util;

import fr.alasdiablo.janoeo.arsenal.event.IInitEvent;
import fr.alasdiablo.janoeo.arsenal.event.WoolArmorEvent;
import fr.alasdiablo.janoeo.arsenal.item.Tools;
import fr.alasdiablo.janoeo.arsenal.item.WoolsArmors;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ModSetup {

    public ItemGroup janoeoArmorGroup = new ItemGroup("janoeo.armor.group") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(WoolsArmors.BLACK_WOOL_CHESTPLATE);
        }
    };

    public ItemGroup janoeoToolGroup = new ItemGroup("janoeo.tool.group") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(Tools.COPPER_AXE);
        }
    };

    public void init () {
        List<IInitEvent> events = Collections.singletonList(
                new WoolArmorEvent()
        );
        events.forEach(IInitEvent::init);
    }
}
