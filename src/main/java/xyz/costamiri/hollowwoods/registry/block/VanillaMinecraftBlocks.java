package xyz.costamiri.hollowwoods.registry.block;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registries;
import xyz.costamiri.hollowwoods.blocks.HollowLog;

public class VanillaMinecraftBlocks extends HollowBlocks {
    public static final HollowLog STRIPPED_HOLLOW_OAK_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_SPRUCE_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_BIRCH_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_JUNGLE_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_ACACIA_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_DARK_OAK_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_MANGROVE_LOG = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_CRIMSON_STEM = new HollowLog();
    public static final HollowLog STRIPPED_HOLLOW_WARPED_STEM = new HollowLog();
    public static final HollowLog HOLLOW_OAK_LOG = new HollowLog();
    public static final HollowLog HOLLOW_SPRUCE_LOG = new HollowLog();
    public static final HollowLog HOLLOW_BIRCH_LOG = new HollowLog();
    public static final HollowLog HOLLOW_JUNGLE_LOG = new HollowLog();
    public static final HollowLog HOLLOW_ACACIA_LOG = new HollowLog();
    public static final HollowLog HOLLOW_DARK_OAK_LOG = new HollowLog();
    public static final HollowLog HOLLOW_MANGROVE_LOG = new HollowLog();
    public static final HollowLog HOLLOW_CRIMSON_STEM = new HollowLog();
    public static final HollowLog HOLLOW_WARPED_STEM = new HollowLog();

    public VanillaMinecraftBlocks() {
        this.namespace = "minecraft";
    }

    @Override
    public void registerBlocks() {
        _registerLog(HOLLOW_OAK_LOG, "hollow_oak_log");
        _registerLog(HOLLOW_SPRUCE_LOG, "hollow_spruce_log");
        _registerLog(HOLLOW_BIRCH_LOG, "hollow_birch_log");
        _registerLog(HOLLOW_JUNGLE_LOG, "hollow_jungle_log");
        _registerLog(HOLLOW_ACACIA_LOG, "hollow_acacia_log");
        _registerLog(HOLLOW_DARK_OAK_LOG, "hollow_dark_oak_log");
        _registerLog(HOLLOW_MANGROVE_LOG, "hollow_mangrove_log");
        _registerLog(HOLLOW_CRIMSON_STEM, "hollow_crimson_stem", false);
        _registerLog(HOLLOW_WARPED_STEM, "hollow_warped_stem", false);
        _registerLog(STRIPPED_HOLLOW_OAK_LOG, "stripped_hollow_oak_log");
        _registerLog(STRIPPED_HOLLOW_SPRUCE_LOG, "stripped_hollow_spruce_log");
        _registerLog(STRIPPED_HOLLOW_BIRCH_LOG, "stripped_hollow_birch_log");
        _registerLog(STRIPPED_HOLLOW_JUNGLE_LOG, "stripped_hollow_jungle_log");
        _registerLog(STRIPPED_HOLLOW_ACACIA_LOG, "stripped_hollow_acacia_log");
        _registerLog(STRIPPED_HOLLOW_DARK_OAK_LOG, "stripped_hollow_dark_oak_log");
        _registerLog(STRIPPED_HOLLOW_MANGROVE_LOG, "stripped_hollow_mangrove_log");
        _registerLog(STRIPPED_HOLLOW_CRIMSON_STEM, "stripped_hollow_crimson_stem", false);
        _registerLog(STRIPPED_HOLLOW_WARPED_STEM, "stripped_hollow_warped_stem", false);
    }

    @Override
    public void addBlocksStripping() {
        strippedBlocks.put(HOLLOW_OAK_LOG, STRIPPED_HOLLOW_OAK_LOG);
        strippedBlocks.put(HOLLOW_SPRUCE_LOG, STRIPPED_HOLLOW_SPRUCE_LOG);
        strippedBlocks.put(HOLLOW_BIRCH_LOG, STRIPPED_HOLLOW_BIRCH_LOG);
        strippedBlocks.put(HOLLOW_JUNGLE_LOG, STRIPPED_HOLLOW_JUNGLE_LOG);
        strippedBlocks.put(HOLLOW_ACACIA_LOG, STRIPPED_HOLLOW_ACACIA_LOG);
        strippedBlocks.put(HOLLOW_DARK_OAK_LOG, STRIPPED_HOLLOW_DARK_OAK_LOG);
        strippedBlocks.put(HOLLOW_MANGROVE_LOG, STRIPPED_HOLLOW_MANGROVE_LOG);
        strippedBlocks.put(HOLLOW_CRIMSON_STEM, STRIPPED_HOLLOW_CRIMSON_STEM);
        strippedBlocks.put(HOLLOW_WARPED_STEM, STRIPPED_HOLLOW_WARPED_STEM);
    }

    public void addBlocksHollowing() {
        hollowedBlocks.put(Registries.BLOCK.getId(Blocks.OAK_LOG), HOLLOW_OAK_LOG);
        hollowedBlocks.put(Registries.BLOCK.getId(Blocks.SPRUCE_LOG), HOLLOW_SPRUCE_LOG);
        hollowedBlocks.put(Registries.BLOCK.getId(Blocks.BIRCH_LOG), HOLLOW_BIRCH_LOG);
        hollowedBlocks.put(Registries.BLOCK.getId(Blocks.JUNGLE_LOG), HOLLOW_JUNGLE_LOG);
        hollowedBlocks.put(Registries.BLOCK.getId(Blocks.ACACIA_LOG), HOLLOW_ACACIA_LOG);
        hollowedBlocks.put(Registries.BLOCK.getId(Blocks.DARK_OAK_LOG), HOLLOW_DARK_OAK_LOG);
        hollowedBlocks.put(Registries.BLOCK.getId(Blocks.MANGROVE_LOG), HOLLOW_MANGROVE_LOG);
        hollowedBlocks.put(Registries.BLOCK.getId(Blocks.CRIMSON_STEM), HOLLOW_CRIMSON_STEM);
        hollowedBlocks.put(Registries.BLOCK.getId(Blocks.WARPED_STEM), HOLLOW_WARPED_STEM);
        hollowedBlocks.put(Registries.BLOCK.getId(Blocks.STRIPPED_OAK_LOG), STRIPPED_HOLLOW_OAK_LOG);
        hollowedBlocks.put(Registries.BLOCK.getId(Blocks.STRIPPED_SPRUCE_LOG), STRIPPED_HOLLOW_SPRUCE_LOG);
        hollowedBlocks.put(Registries.BLOCK.getId(Blocks.STRIPPED_BIRCH_LOG), STRIPPED_HOLLOW_BIRCH_LOG);
        hollowedBlocks.put(Registries.BLOCK.getId(Blocks.STRIPPED_JUNGLE_LOG), STRIPPED_HOLLOW_JUNGLE_LOG);
        hollowedBlocks.put(Registries.BLOCK.getId(Blocks.STRIPPED_ACACIA_LOG), STRIPPED_HOLLOW_ACACIA_LOG);
        hollowedBlocks.put(Registries.BLOCK.getId(Blocks.STRIPPED_DARK_OAK_LOG), STRIPPED_HOLLOW_DARK_OAK_LOG);
        hollowedBlocks.put(Registries.BLOCK.getId(Blocks.STRIPPED_MANGROVE_LOG), STRIPPED_HOLLOW_MANGROVE_LOG);
        hollowedBlocks.put(Registries.BLOCK.getId(Blocks.STRIPPED_CRIMSON_STEM), STRIPPED_HOLLOW_CRIMSON_STEM);
        hollowedBlocks.put(Registries.BLOCK.getId(Blocks.STRIPPED_WARPED_STEM), STRIPPED_HOLLOW_WARPED_STEM);
    }

    @Override
    public void addPlanksConversion() {
        planksConversion.put(HOLLOW_OAK_LOG, Registries.BLOCK.getId(Blocks.OAK_PLANKS));
        planksConversion.put(HOLLOW_SPRUCE_LOG, Registries.BLOCK.getId(Blocks.SPRUCE_PLANKS));
        planksConversion.put(HOLLOW_BIRCH_LOG, Registries.BLOCK.getId(Blocks.BIRCH_PLANKS));
        planksConversion.put(HOLLOW_JUNGLE_LOG, Registries.BLOCK.getId(Blocks.JUNGLE_PLANKS));
        planksConversion.put(HOLLOW_ACACIA_LOG, Registries.BLOCK.getId(Blocks.ACACIA_PLANKS));
        planksConversion.put(HOLLOW_DARK_OAK_LOG, Registries.BLOCK.getId(Blocks.DARK_OAK_PLANKS));
        planksConversion.put(HOLLOW_MANGROVE_LOG, Registries.BLOCK.getId(Blocks.MANGROVE_PLANKS));
        planksConversion.put(HOLLOW_CRIMSON_STEM, Registries.BLOCK.getId(Blocks.CRIMSON_PLANKS));
        planksConversion.put(HOLLOW_WARPED_STEM, Registries.BLOCK.getId(Blocks.WARPED_PLANKS));
        planksConversion.put(STRIPPED_HOLLOW_OAK_LOG, Registries.BLOCK.getId(Blocks.OAK_PLANKS));
        planksConversion.put(STRIPPED_HOLLOW_SPRUCE_LOG, Registries.BLOCK.getId(Blocks.SPRUCE_PLANKS));
        planksConversion.put(STRIPPED_HOLLOW_BIRCH_LOG, Registries.BLOCK.getId(Blocks.BIRCH_PLANKS));
        planksConversion.put(STRIPPED_HOLLOW_JUNGLE_LOG, Registries.BLOCK.getId(Blocks.JUNGLE_PLANKS));
        planksConversion.put(STRIPPED_HOLLOW_ACACIA_LOG, Registries.BLOCK.getId(Blocks.ACACIA_PLANKS));
        planksConversion.put(STRIPPED_HOLLOW_DARK_OAK_LOG, Registries.BLOCK.getId(Blocks.DARK_OAK_PLANKS));
        planksConversion.put(STRIPPED_HOLLOW_MANGROVE_LOG, Registries.BLOCK.getId(Blocks.MANGROVE_PLANKS));
        planksConversion.put(STRIPPED_HOLLOW_CRIMSON_STEM, Registries.BLOCK.getId(Blocks.CRIMSON_PLANKS));
        planksConversion.put(STRIPPED_HOLLOW_WARPED_STEM, Registries.BLOCK.getId(Blocks.WARPED_PLANKS));
    }
}
