package com.github.coda1552.produce.registry;

import com.github.coda1552.produce.Produce;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ProduceItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Produce.MOD_ID);

    public static final RegistryObject<Item> COCONUT = ITEMS.register("coconut", () -> new Item(new Item.Properties().tab(Produce.GROUP).stacksTo(16).food(new FoodProperties.Builder().nutrition(3).saturationMod(0.4F).build())));
}
