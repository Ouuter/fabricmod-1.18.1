package net.space.testmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.space.testmod.TestMod;


public class Moditems {

    public static final Item BLUE_BERRIES = registerItem("blue_berries",
           new Item(new FabricItemSettings().group(ItemGroup.FOOD)));

   // public static final Item BLUE_BERRIES = registerItem("blue_berries",
            //new Item(new FabricItemSettings().group(ItemGroup.FOOD)));

    public static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TestMod.LOGGER.info("Registering mods for " + TestMod.MOD_ID);
    }

}
