package org.geminicraft.geminideaths;

import org.mineacademy.fo.Common;
import org.mineacademy.fo.plugin.SimplePlugin;

public class MainPlugin extends SimplePlugin {

    /**
     *
     * Store player statistics in file and on player quit
     * store those statistics into the database.
     *
     *
     */


    @Override
    protected void onPluginStart() {
        Common.log("GeminiDeaths has activated");
    }


}
