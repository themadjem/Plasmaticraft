package themadjem.plasmaticraft.items;

import net.minecraft.item.ItemSword;
import net.minecraft.util.ResourceLocation;
import themadjem.plasmaticraft.Reference;

public class ItemPlasmaSword extends ItemSword{

	public ItemPlasmaSword(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
		
	}

}
