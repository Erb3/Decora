package github.erb3.mod.decora.utils;

import net.minecraft.util.Identifier;

public class IdentifierGenerator {
    public static Identifier generateIdentifier(String id) {
        return new Identifier("decora", id);
    }
}
