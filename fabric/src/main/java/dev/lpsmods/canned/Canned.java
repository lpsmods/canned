package dev.lpsmods.canned;

import com.mrcrayfish.framework.FrameworkSetup;
import net.fabricmc.api.ModInitializer;

public class Canned implements ModInitializer {
    
    @Override
    public void onInitialize() {
        FrameworkSetup.run();
        Bootstrap.init();
    }
}
