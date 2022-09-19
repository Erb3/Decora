package github.erb3.mod.decora.block;

import github.erb3.mod.decora.utils.BlockItemGenerator;
import github.erb3.mod.decora.utils.IdentifierGenerator;
import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlockManager {
    public static final Logger LOGGER = LoggerFactory.getLogger("Decora");

    public static String[] woodVariants = {"oak", "birch", "spruce", "dark_oak", "jungle", "acacia", "crimson", "warped", "mangrove"};

    public static void registerBlocks() {

        for (String wood : woodVariants) {
            Block toRegister = new TableBlock();
            Identifier ID = IdentifierGenerator.generateIdentifier(wood + "_table");

            LOGGER.info("Registering block: " + ID);
            Registry.register(Registry.BLOCK, ID, toRegister);
            Registry.register(Registry.ITEM, ID, BlockItemGenerator.generateBlockItem(toRegister));
        }

    }
}
