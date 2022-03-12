package com.github.coda1552.produce;

import com.github.coda1552.produce.registry.ProduceBlocks;
import com.github.coda1552.produce.registry.ProduceItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Produce.MOD_ID)
public class Produce {
    public static final String MOD_ID = "produce";
    public final static CreativeModeTab GROUP = new CreativeModeTab(MOD_ID) {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ProduceBlocks.COCONUT_HUSK.get().asItem());
        }
    };

    public Produce() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        ProduceItems.ITEMS.register(bus);
        ProduceBlocks.BLOCKS.register(bus);
    }


}
