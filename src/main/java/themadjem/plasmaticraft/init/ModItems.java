package themadjem.plasmaticraft.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import themadjem.plasmaticraft.Plasmaticraft;
import themadjem.plasmaticraft.Reference;
import themadjem.plasmaticraft.Utils;
import themadjem.plasmaticraft.items.ItemModFoods;
import themadjem.plasmaticraft.items.ItemPlasmaNugget;
import themadjem.plasmaticraft.items.ItemPlasmaticIngot;

/**
 * Handles the item registration and render
 * @author themadjem
 *
 */
public class ModItems {
	/**
	 * State the items
	 */
	public static Item plasmaticIngot;
	public static Item plasmaNugget;
	public static Item highlandDewdrop;
	
	/**
	 * Initialize the items
	*/
	public static void init() {

		plasmaticIngot = new ItemPlasmaticIngot("plasmatic_ingot", "plasmatic_ingot");
		plasmaNugget = new ItemPlasmaNugget("plasma_nugget","plasma_nugget");
		highlandDewdrop = new ItemModFoods("highland_dewdrop",10, 5f, false, new PotionEffect(Potion.getPotionById(8), 300, 255));
		
	}
	
	/**
	 * Register the items
	*/
	public static void register() {

		registerItem(plasmaticIngot);
		registerItem(plasmaNugget);
		registerItem(highlandDewdrop); 
	}
	
	/**
	 * Register the item renders
	*/
	public static void registerRenders() {

		registerRender(plasmaticIngot);
		registerRender(plasmaNugget);
		registerRender(highlandDewdrop);

	}
	
	/**
	 * Register a single item
	 * @param item The item to register
	*/
	public static void registerItem(Item item) {
		item.setCreativeTab(Plasmaticraft.tab);
		GameRegistry.register(item);
		Utils.getLogger().info("Registered Item: " + item.getUnlocalizedName().substring(5));

	}
	
	/**
	 * Registers the item render MUST BE CALLED IN THE PRE INIT METHOD IN YOUR MAIN CLASS
	 * @param item The item
	 */
	public static void registerRender(Item item) {
		Utils.itemModelLoader(item);
		Utils.getLogger().info("Register Render for " + item.getUnlocalizedName().substring(5));
		
	}
}
