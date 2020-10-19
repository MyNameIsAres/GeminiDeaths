package org.geminicraft.geminideaths;

import org.mineacademy.fo.settings.YamlSectionConfig;

import java.util.UUID;

public class PlayerCache extends YamlSectionConfig {

    private final UUID uuid;

    protected PlayerCache(UUID uuid) {
        super(uuid.toString());
        this.uuid = uuid;
        loadConfiguration(null, "data.db");
    }

}
