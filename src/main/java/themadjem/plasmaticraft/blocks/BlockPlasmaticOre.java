package themadjem.plasmaticraft.blocks;


import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import themadjem.plasmaticraft.Reference;

public class BlockPlasmaticOre extends Block {

	public BlockPlasmaticOre(String unlocalizedName, String registryName) {
		super(Material.ROCK);
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(new ResourceLocation(Reference.MOD_ID, registryName));
		this.setHardness(9);
		this.setResistance(20);
		this.setHarvestLevel("pickaxe", 3);
		this.setLightLevel(0.01f);

	}

	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(this);
	}
}
