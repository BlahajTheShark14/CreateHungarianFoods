package net.blahaj.createhungarianfoods.item;

import net.blahaj.createhungarianfoods.CreateHungarianFoods;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateHungarianFoods.MOD_ID);

    public static final RegistryObject<CreativeModeTab> CREATE_HUNGARIAN_FOODS = CREATIVE_MODE_TABS.register("create_hungarian_foods",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.YEAST.get()))
                    .title(Component.translatable("creativetab.create_hungarian_foods"))
                    .displayItems((pParameters, p0utput) -> {
                        p0utput.accept(ModItems.YEAST.get());
                        p0utput.accept(ModItems.LANGOS.get());
                        p0utput.accept(ModItems.SOUR_CREAM_LANGOS.get());
                        p0utput.accept(ModItems.SOUR_CREAM_AND_CHEESE_LANGOS.get());
                        p0utput.accept(ModItems.GOD_LANGOS.get());
                        p0utput.accept(ModItems.SOUR_CREAM.get());




                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
