package net.blahaj.createhungarianfoods.item;

import net.blahaj.createhungarianfoods.CreateHungarianFoods;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CreateHungarianFoods.MOD_ID);

    public static final RegistryObject<Item> YEAST = ITEMS.register("yeast",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LANGOS = ITEMS.register("langos",
            () -> new Item(new Item.Properties().food(ModFoods.LANGOS)));

    public static final RegistryObject<Item> SOUR_CREAM_LANGOS = ITEMS.register("sour_cream_langos",
            () -> new Item(new Item.Properties().food(ModFoods.SOUR_CREAM_LANGOS)));

    public static final RegistryObject<Item> SOUR_CREAM_AND_CHEESE_LANGOS = ITEMS.register("sour_cream_and_cheese_langos",
            () -> new Item(new Item.Properties().food(ModFoods.SOUR_CREAM_AND_CHEESE_LANGOS)));

    public static final RegistryObject<Item> GOD_LANGOS = ITEMS.register("god_langos",
            () -> new Item(new Item.Properties().food(ModFoods.GOD_LANGOS)));

    public static final RegistryObject<Item> SOUR_CREAM = ITEMS.register("sour_cream",
            () -> new Item(new Item.Properties().food(ModFoods.SOUR_CREAM)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
