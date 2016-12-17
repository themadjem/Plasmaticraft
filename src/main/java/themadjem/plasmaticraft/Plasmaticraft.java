package themadjem.plasmaticraft;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import themadjem.plasmaticraft.craeativetabs.TabPLSMC;
import themadjem.plasmaticraft.handlers.RecipeHandler;
import themadjem.plasmaticraft.init.ModBlocks;
import themadjem.plasmaticraft.init.ModItems;
import themadjem.plasmaticraft.init.ModTools;
import themadjem.plasmaticraft.proxy.CommonProxy;

/**
 * The main class. This class registers the blocks and items and makes sure
 * everything our mod does works
 * @author themadjem
 *
 */
@Mod(modid=Reference.MOD_ID, name=Reference.NAME, version=Reference.VERSION, acceptedMinecraftVersions=Reference.ACCEPTED_VERSIONS)

public class Plasmaticraft {
	
	/**
	 * Our creative tabs
	 */
	public static final CreativeTabs tab = new TabPLSMC();

	/**
	 * Used for GUI stuff
	 */
	@Mod.Instance(Reference.MOD_ID)
	public static Plasmaticraft instance;
	
	/**
	 * Proxy so that we register the correct things on server and client side.
	 * Client side handles the model bakery
	 * Server side handles tileentities and world generation
	 */
	@SidedProxy(serverSide = Reference.SERVER_PROXY_CLASS, clientSide = Reference.CLIENT_PROXY_CLASS)
	public static CommonProxy proxy;
	
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		ModItems.init();
		ModBlocks.init();
		ModTools.init();
		
		ModItems.register();
		ModBlocks.register();
		ModTools.register();
		
		
		proxy.registerRenders();
	}
		
	@EventHandler
	public void init(FMLInitializationEvent event) {
		Utils.getLogger().info("Init");
		RecipeHandler.registerCraftingRecipes();
		RecipeHandler.registerSmeltingRecipes();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		Utils.getLogger().info("Post Init");
	}
	
}
