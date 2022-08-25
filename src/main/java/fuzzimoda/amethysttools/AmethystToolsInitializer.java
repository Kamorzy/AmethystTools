package fuzzimoda.amethysttools;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ToolItem;
import fuzzimoda.amethysttools.publictoolitems.PublicAxeItem;
import fuzzimoda.amethysttools.publictoolitems.PublicHoeItem;
import fuzzimoda.amethysttools.publictoolitems.PublicPickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.Identifier;

public class AmethystToolsInitializer implements ModInitializer {

    public static final ToolItem AMETHYST_AXE = new PublicAxeItem(AmethystToolsMaterial.INSTANCE, 7.0f, -3.2F, new Item.Settings().group(ItemGroup.TOOLS));
    public static final ToolItem AMETHYST_HOE = new PublicHoeItem(AmethystToolsMaterial.INSTANCE, 1, -2.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static final ToolItem AMETHYST_PICKAXE = new PublicPickaxeItem(AmethystToolsMaterial.INSTANCE, 1, -2.8F, new Item.Settings().group(ItemGroup.TOOLS));
    public static final ToolItem AMETHYST_SHOVEL = new ShovelItem(AmethystToolsMaterial.INSTANCE, 1.5f, -3.0F, new Item.Settings().group(ItemGroup.TOOLS));
    public static final ToolItem AMETHYST_SWORD = new SwordItem(AmethystToolsMaterial.INSTANCE, 7, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("amethysttools", "amethyst_axe"), AMETHYST_AXE);
        Registry.register(Registry.ITEM, new Identifier("amethysttools", "amethyst_hoe"), AMETHYST_HOE);
        Registry.register(Registry.ITEM, new Identifier("amethysttools", "amethyst_pickaxe"), AMETHYST_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("amethysttools", "amethyst_shovel"), AMETHYST_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("amethysttools", "amethyst_sword"), AMETHYST_SWORD);
    }
}
