package github.erb3.mod.decora.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;

public class TableBlock extends Block {

    public TableBlock() {
        super(
                FabricBlockSettings.of(Material.WOOD).hardness(2.0f)
        );
    }
}
