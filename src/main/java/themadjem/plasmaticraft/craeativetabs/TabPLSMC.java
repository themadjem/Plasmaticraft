package themadjem.plasmaticraft.craeativetabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import themadjem.plasmaticraft.init.ModBlocks;

public class TabPLSMC extends CreativeTabs{

	public TabPLSMC() {
		super("plsmctab");
		
	}

	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock(ModBlocks.plasmatic_ore);
	}
}
