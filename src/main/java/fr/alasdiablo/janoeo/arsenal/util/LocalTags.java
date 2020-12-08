package fr.alasdiablo.janoeo.arsenal.util;

import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class LocalTags {

    public static class Ingot {
        public static final ITag.INamedTag<Item> COPPER = createTag("ingots/copper");
        public static final ITag.INamedTag<Item> ALUMINIUM = createTag("ingots/aluminium");
        public static final ITag.INamedTag<Item> LEAD = createTag("ingots/lead");
        public static final ITag.INamedTag<Item> SILVER = createTag("ingots/silver");
        public static final ITag.INamedTag<Item> TIN = createTag("ingots/tin");
        public static final ITag.INamedTag<Item> URANIUM = createTag("ingots/uranium");
    }

    private static ITag.INamedTag<Item> createTag(String name) {
        return ItemTags.makeWrapperTag("forge:"+ name);
    }
}
