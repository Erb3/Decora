package github.erb3.mod.decora.utils;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;

public class BlockItemGenerator {
    public static BlockItem generateBlockItem(Block block) {
        return new BlockItem(block, new FabricItemSettings().group(ItemGroup.MATERIALS));
    }
}
