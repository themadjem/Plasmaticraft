package themadjem.plasmaticraft.items;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.util.ResourceLocation;
import themadjem.plasmaticraft.Reference;

public class ItemPlasmaPickaxe extends ItemPickaxe{

	public ItemPlasmaPickaxe(ToolMaterial material, String unlocalizedName) {
		super(material);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, unlocalizedName));
	}

}
