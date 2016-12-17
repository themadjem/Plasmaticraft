package themadjem.plasmaticraft;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class Utils {

	private static Logger logger;	
	
	//Used for logging messages to the console //Used in conjunction with *.info("Message")
	public static Logger getLogger() {
		if(logger == null){
			logger=LogManager.getFormatterLogger(Reference.MOD_ID);
		}
		return logger;	
	}
	
	//Runs the ModelLoader for a based in Block called 'block'
	public static void blockModelLoader(Block block){
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID, block.getUnlocalizedName().substring(5)), "inventory"));
	}
	
	//Runs the ModelLoader for a passed in Item called 'item'
	public static void itemModelLoader(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(Reference.MOD_ID,item.getUnlocalizedName().substring(5)), "inventory"));
	}
	
}
