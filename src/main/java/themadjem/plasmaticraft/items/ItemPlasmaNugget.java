package themadjem.plasmaticraft.items;

import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import themadjem.plasmaticraft.Reference;

public class ItemPlasmaNugget extends Item{

	public ItemPlasmaNugget(String unlocalizedName, String registryName){
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
	}
}	
