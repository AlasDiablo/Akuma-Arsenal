package fr.alasdiablo.janoeo.arsenal.data;

import fr.alasdiablo.janoeo.arsenal.item.Armors;
import fr.alasdiablo.janoeo.arsenal.item.Tools;
import fr.alasdiablo.janoeo.arsenal.item.WoolsArmors;
import fr.alasdiablo.janoeo.arsenal.util.LocalTags;
import javafx.util.Pair;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.*;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraftforge.common.Tags;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Janoeo recipes data generator
 */
public class Recipes extends RecipeProvider {

    /**
     * constructor
     * @param generatorIn data generator instance
     */
    public Recipes(DataGenerator generatorIn) {
        super(generatorIn);
    }

    /**
     * load all recipes
     */
    @Override
    protected void registerRecipes(Consumer<IFinishedRecipe> consumer) {
        this.woolArmors(consumer);
        this.armors(consumer);
        this.tools(consumer);
    }

    private void tools(Consumer<IFinishedRecipe> consumer) {
        ShapedRecipeBuilder.shapedRecipe(Tools.COPPER_AXE)
                .key('C', LocalTags.Ingot.COPPER)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("CC")
                .patternLine("CS")
                .patternLine(" S")
                .addCriterion("has_copper", hasItem(LocalTags.Ingot.COPPER))
                .addCriterion("has_stick", hasItem(Tags.Items.RODS_WOODEN))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(Tools.COPPER_HOE)
                .key('C', LocalTags.Ingot.COPPER)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("CC")
                .patternLine(" S")
                .patternLine(" S")
                .addCriterion("has_copper", hasItem(LocalTags.Ingot.COPPER))
                .addCriterion("has_stick", hasItem(Tags.Items.RODS_WOODEN))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(Tools.COPPER_PICKAXE)
                .key('C', LocalTags.Ingot.COPPER)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("CCC")
                .patternLine(" S ")
                .patternLine(" S ")
                .addCriterion("has_copper", hasItem(LocalTags.Ingot.COPPER))
                .addCriterion("has_stick", hasItem(Tags.Items.RODS_WOODEN))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(Tools.COPPER_SHOVEL)
                .key('C', LocalTags.Ingot.COPPER)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("C")
                .patternLine("S")
                .patternLine("S")
                .addCriterion("has_copper", hasItem(LocalTags.Ingot.COPPER))
                .addCriterion("has_stick", hasItem(Tags.Items.RODS_WOODEN))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(Tools.COPPER_SWORD)
                .key('C', LocalTags.Ingot.COPPER)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("C")
                .patternLine("C")
                .patternLine("S")
                .addCriterion("has_copper", hasItem(LocalTags.Ingot.COPPER))
                .addCriterion("has_stick", hasItem(Tags.Items.RODS_WOODEN))
                .build(consumer);



        ShapedRecipeBuilder.shapedRecipe(Tools.ALUMINIUM_AXE)
                .key('A', LocalTags.Ingot.ALUMINIUM)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("AA")
                .patternLine("AS")
                .patternLine(" S")
                .addCriterion("has_aluminium", hasItem(LocalTags.Ingot.ALUMINIUM))
                .addCriterion("has_stick", hasItem(Tags.Items.RODS_WOODEN))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(Tools.ALUMINIUM_HOE)
                .key('A', LocalTags.Ingot.ALUMINIUM)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("AA")
                .patternLine(" S")
                .patternLine(" S")
                .addCriterion("has_aluminium", hasItem(LocalTags.Ingot.ALUMINIUM))
                .addCriterion("has_stick", hasItem(Tags.Items.RODS_WOODEN))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(Tools.ALUMINIUM_PICKAXE)
                .key('A', LocalTags.Ingot.ALUMINIUM)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("AAA")
                .patternLine(" S ")
                .patternLine(" S ")
                .addCriterion("has_aluminium", hasItem(LocalTags.Ingot.ALUMINIUM))
                .addCriterion("has_stick", hasItem(Tags.Items.RODS_WOODEN))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(Tools.ALUMINIUM_SHOVEL)
                .key('A', LocalTags.Ingot.ALUMINIUM)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("A")
                .patternLine("S")
                .patternLine("S")
                .addCriterion("has_aluminium", hasItem(LocalTags.Ingot.ALUMINIUM))
                .addCriterion("has_stick", hasItem(Tags.Items.RODS_WOODEN))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(Tools.ALUMINIUM_SWORD)
                .key('C', LocalTags.Ingot.ALUMINIUM)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("C")
                .patternLine("C")
                .patternLine("S")
                .addCriterion("has_aluminium", hasItem(LocalTags.Ingot.ALUMINIUM))
                .addCriterion("has_stick", hasItem(Tags.Items.RODS_WOODEN))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(Tools.TIN_AXE)
                .key('A', LocalTags.Ingot.TIN)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("AA")
                .patternLine("AS")
                .patternLine(" S")
                .addCriterion("has_tin", hasItem(LocalTags.Ingot.TIN))
                .addCriterion("has_stick", hasItem(Tags.Items.RODS_WOODEN))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(Tools.TIN_HOE)
                .key('A', LocalTags.Ingot.TIN)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("AA")
                .patternLine(" S")
                .patternLine(" S")
                .addCriterion("has_tin", hasItem(LocalTags.Ingot.TIN))
                .addCriterion("has_stick", hasItem(Tags.Items.RODS_WOODEN))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(Tools.TIN_PICKAXE)
                .key('A', LocalTags.Ingot.TIN)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("AAA")
                .patternLine(" S ")
                .patternLine(" S ")
                .addCriterion("has_tin", hasItem(LocalTags.Ingot.TIN))
                .addCriterion("has_stick", hasItem(Tags.Items.RODS_WOODEN))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(Tools.TIN_SHOVEL)
                .key('A', LocalTags.Ingot.TIN)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("A")
                .patternLine("S")
                .patternLine("S")
                .addCriterion("has_tin", hasItem(LocalTags.Ingot.TIN))
                .addCriterion("has_stick", hasItem(Tags.Items.RODS_WOODEN))
                .build(consumer);

        ShapedRecipeBuilder.shapedRecipe(Tools.TIN_SWORD)
                .key('C', LocalTags.Ingot.TIN)
                .key('S', Tags.Items.RODS_WOODEN)
                .patternLine("C")
                .patternLine("C")
                .patternLine("S")
                .addCriterion("has_tin", hasItem(LocalTags.Ingot.TIN))
                .addCriterion("has_stick", hasItem(Tags.Items.RODS_WOODEN))
                .build(consumer);
    }


    private void armors(Consumer<IFinishedRecipe> consumer) {
        Map<Pair<String, ITag.INamedTag<Item>>, List<Pair<Item, List<String>>>> listOfArmor = new HashMap<>();
        listOfArmor.put(new Pair<>("has_copper_ingot", LocalTags.Ingot.COPPER), Arrays.asList(
                new Pair<>(Armors.COPPER_HELMET, Arrays.asList("III", "I I")),
                new Pair<>(Armors.COPPER_CHESTPLATE, Arrays.asList("I I", "III", "III")),
                new Pair<>(Armors.COPPER_LEGGINGS, Arrays.asList("III", "I I", "I I")),
                new Pair<>(Armors.COPPER_BOOTS, Arrays.asList("I I", "I I"))
        ));
        listOfArmor.put(new Pair<>("has_aluminium_ingot", LocalTags.Ingot.ALUMINIUM), Arrays.asList(
                new Pair<>(Armors.ALUMINIUM_HELMET, Arrays.asList("III", "I I")),
                new Pair<>(Armors.ALUMINIUM_CHESTPLATE, Arrays.asList("I I", "III", "III")),
                new Pair<>(Armors.ALUMINIUM_LEGGINGS, Arrays.asList("III", "I I", "I I")),
                new Pair<>(Armors.ALUMINIUM_BOOTS, Arrays.asList("I I", "I I"))
        ));
        listOfArmor.put(new Pair<>("has_lead_ingot", LocalTags.Ingot.LEAD), Arrays.asList(
                new Pair<>(Armors.LEAD_HELMET, Arrays.asList("III", "I I")),
                new Pair<>(Armors.LEAD_CHESTPLATE, Arrays.asList("I I", "III", "III")),
                new Pair<>(Armors.LEAD_LEGGINGS, Arrays.asList("III", "I I", "I I")),
                new Pair<>(Armors.LEAD_BOOTS, Arrays.asList("I I", "I I"))
        ));
        listOfArmor.put(new Pair<>("has_silver_ingot", LocalTags.Ingot.SILVER), Arrays.asList(
                new Pair<>(Armors.SILVER_HELMET, Arrays.asList("III", "I I")),
                new Pair<>(Armors.SILVER_CHESTPLATE, Arrays.asList("I I", "III", "III")),
                new Pair<>(Armors.SILVER_LEGGINGS, Arrays.asList("III", "I I", "I I")),
                new Pair<>(Armors.SILVER_BOOTS, Arrays.asList("I I", "I I"))
        ));
        listOfArmor.put(new Pair<>("has_tin_ingot", LocalTags.Ingot.TIN), Arrays.asList(
                new Pair<>(Armors.TIN_HELMET, Arrays.asList("III", "I I")),
                new Pair<>(Armors.TIN_CHESTPLATE, Arrays.asList("I I", "III", "III")),
                new Pair<>(Armors.TIN_LEGGINGS, Arrays.asList("III", "I I", "I I")),
                new Pair<>(Armors.TIN_BOOTS, Arrays.asList("I I", "I I"))
        ));
        listOfArmor.put(new Pair<>("has_uranium_ingot", LocalTags.Ingot.URANIUM), Arrays.asList(
                new Pair<>(Armors.URANIUM_HELMET, Arrays.asList("III", "I I")),
                new Pair<>(Armors.URANIUM_CHESTPLATE, Arrays.asList("I I", "III", "III")),
                new Pair<>(Armors.URANIUM_LEGGINGS, Arrays.asList("III", "I I", "I I")),
                new Pair<>(Armors.URANIUM_BOOTS, Arrays.asList("I I", "I I"))
        ));
        listOfArmor.forEach((key, values) -> values.forEach(element -> {
            ShapedRecipeBuilder recipe = ShapedRecipeBuilder.shapedRecipe(element.getKey()).key('I', key.getValue());
            element.getValue().forEach(recipe::patternLine);
            recipe.addCriterion(key.getKey(), hasItem(key.getValue())).build(consumer);
        }));
    }

    private void woolArmors(Consumer<IFinishedRecipe> consumer) {
        Map<Pair<String, Block>, List<Pair<Item, List<String>>>> listOfArmor = new HashMap<>();
        listOfArmor.put(new Pair<>("has_black_wool", Blocks.BLACK_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.BLACK_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.BLACK_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.BLACK_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.BLACK_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_blue_wool", Blocks.BLUE_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.BLUE_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.BLUE_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.BLUE_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.BLUE_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_brown_wool", Blocks.BROWN_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.BROWN_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.BROWN_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.BROWN_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.BROWN_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_cyan_wool", Blocks.CYAN_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.CYAN_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.CYAN_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.CYAN_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.CYAN_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_gray_wool", Blocks.GRAY_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.GRAY_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.GRAY_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.GRAY_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.GRAY_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_green_wool", Blocks.GREEN_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.GREEN_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.GREEN_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.GREEN_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.GREEN_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_light_blue_wool", Blocks.LIGHT_BLUE_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.LIGHT_BLUE_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.LIGHT_BLUE_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.LIGHT_BLUE_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.LIGHT_BLUE_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_light_gray_wool", Blocks.LIGHT_GRAY_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.LIGHT_GRAY_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.LIGHT_GRAY_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.LIGHT_GRAY_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.LIGHT_GRAY_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_lime_wool", Blocks.LIME_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.LIME_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.LIME_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.LIME_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.LIME_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_magenta_wool", Blocks.MAGENTA_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.MAGENTA_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.MAGENTA_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.MAGENTA_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.MAGENTA_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_orange_wool", Blocks.ORANGE_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.ORANGE_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.ORANGE_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.ORANGE_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.ORANGE_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_pink_wool", Blocks.PINK_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.PINK_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.PINK_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.PINK_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.PINK_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_purple_wool", Blocks.PURPLE_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.PURPLE_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.PURPLE_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.PURPLE_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.PURPLE_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_red_wool", Blocks.RED_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.RED_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.RED_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.RED_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.RED_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_white_wool", Blocks.WHITE_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.WHITE_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.WHITE_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.WHITE_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.WHITE_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.put(new Pair<>("has_yellow_wool", Blocks.YELLOW_WOOL), Arrays.asList(
                new Pair<>(WoolsArmors.YELLOW_WOOL_HELMET, Arrays.asList("WWW", "W W")),
                new Pair<>(WoolsArmors.YELLOW_WOOL_CHESTPLATE, Arrays.asList("W W", "WWW", "WWW")),
                new Pair<>(WoolsArmors.YELLOW_WOOL_LEGGINGS, Arrays.asList("WWW", "W W", "W W")),
                new Pair<>(WoolsArmors.YELLOW_WOOL_BOOTS, Arrays.asList("W W", "W W"))
        ));
        listOfArmor.forEach((key, values) -> values.forEach(element -> {
            ShapedRecipeBuilder recipe = ShapedRecipeBuilder.shapedRecipe(element.getKey()).key('W', key.getValue());
            element.getValue().forEach(recipe::patternLine);
            recipe.addCriterion(key.getKey(), hasItem(key.getValue())).build(consumer);
        }));
    }
}
