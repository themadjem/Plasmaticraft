package themadjem.plasmaticraft.init;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import themadjem.plasmaticraft.Plasmaticraft;
import themadjem.plasmaticraft.Reference;
import themadjem.plasmaticraft.Utils;
import themadjem.plasmaticraft.items.ItemPlasmaNugget;
import themadjem.plasmaticraft.items.ItemPlasmaPickaxe;
import themadjem.plasmaticraft.items.ItemPlasmaSword;
import themadjem.plasmaticraft.items.ItemPlasmaticIngot;

public class ModTools {
	
	public static final ToolMaterial plasmaMaterial = EnumHelper.addToolMaterial(Reference.MOD_ID + "plasma", 3, 3000, 45f, 9.0f, 12);
	public static ItemSword plasmaSword;
	public static ItemPickaxe plasmaPick;

	public static void init() {

		plasmaSword = new ItemPlasmaSword(plasmaMaterial, "plasma_sword");
		plasmaPick = new ItemPlasmaPickaxe(plasmaMaterial, "plasma_pick");
		
	}
	
	public static void register() {

		registerItem(plasmaSword);
		registerItem(plasmaPick);
	}
	
	public static void registerRenders() {

		registerRender(plasmaSword);
		registerRender(plasmaPick);

	}
	
	public static void registerItem(Item item) {
		item.setCreativeTab(Plasmaticraft.tab);
		GameRegistry.register(item);
		Utils.getLogger().info("Registered Item: " + item.getUnlocalizedName().substring(5));

	}
	
	public static void registerRender(Item item) {
		Utils.itemModelLoader(item);
		Utils.getLogger().info("Register Render for " + item.getUnlocalizedName().substring(5));
		
		
	}
}
