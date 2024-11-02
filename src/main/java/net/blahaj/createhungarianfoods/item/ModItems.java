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

    public static final RegistryObject<Item> ELESZTO = ITEMS.register("eleszto",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> LANGOS = ITEMS.register("langos",
            () -> new Item(new Item.Properties().food(ModFoods.LANGOS)));

    public static final RegistryObject<Item> TEJFOLOS_LANGOS = ITEMS.register("tejfolos_langos",
            () -> new Item(new Item.Properties().food(ModFoods.TEJFOLOS_LANGOS)));

    public static final RegistryObject<Item> SAJTOS_TEJFOLOS_LANGOS = ITEMS.register("sajtos_tejfolos_langos",
            () -> new Item(new Item.Properties().food(ModFoods.SAJTOS_TEJFOLOS_LANGOS)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
