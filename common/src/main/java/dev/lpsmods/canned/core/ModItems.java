package dev.lpsmods.canned.core;

import com.mrcrayfish.framework.api.registry.RegistryContainer;
import com.mrcrayfish.framework.api.registry.RegistryEntry;
import dev.lpsmods.canned.item.CanOpenerItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Tiers;

import java.util.function.Supplier;

@RegistryContainer
public class ModItems {
    public static final RegistryEntry<Item> CAN_OPENER;

    private static RegistryEntry<Item> item(String name, Supplier<Item> item) {
        return RegistryEntry.item(ModUtils.makeId(name), item);
    }

    static {
        CAN_OPENER = item("can_opener", () -> new CanOpenerItem(Tiers.IRON,  new Item.Properties().attributes(CanOpenerItem.createAttributes(Tiers.IRON, 1, -3.1f))));
    }
}
