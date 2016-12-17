package themadjem.plasmaticraft.proxy;

import themadjem.plasmaticraft.init.ModBlocks;
import themadjem.plasmaticraft.init.ModItems;
import themadjem.plasmaticraft.init.ModTools;

public class ClientProxy extends CommonProxy{

	@Override
	public void registerRenders(){
		
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		ModTools.registerRenders();
		
	}
}
