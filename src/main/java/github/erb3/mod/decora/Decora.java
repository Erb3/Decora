package github.erb3.mod.decora;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Decora implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("Decora");

    @Override
    public void onInitialize() {
        LOGGER.info("Decora initializing.");
    }
}
