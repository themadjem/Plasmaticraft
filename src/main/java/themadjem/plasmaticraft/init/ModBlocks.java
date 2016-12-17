package themadjem.plasmaticraft.init;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import themadjem.plasmaticraft.Plasmaticraft;
import themadjem.plasmaticraft.Reference;
import themadjem.plasmaticraft.Utils;
import themadjem.plasmaticraft.blocks.BlockPlasmaticBlock;
import themadjem.plasmaticraft.blocks.BlockPlasmaticOre;

public class ModBlocks {
	
	public static Block plasmatic_ore;
	public static Block plasmatic_block;
	
	public static void init() {

		plasmatic_ore = new BlockPlasmaticOre("plasmatic_ore", "plasmatic_ore");
		plasmatic_block = new BlockPlasmaticBlock("plasmatic_block", "plasmatic_block");

	}
	
	public static void register() {

		registerBlock(plasmatic_ore);
		registerBlock(plasmatic_block);

	}
	
	public static void registerRenders() {

		registerRender(plasmatic_ore);
		registerRender(plasmatic_block);

	}
	
	public static void registerBlock(Block block) {
		block.setCreativeTab(Plasmaticraft.tab);
		GameRegistry.register(block);
		GameRegistry.register(new ItemBlock(block).setRegistryName(block.getRegistryName())); //Item not textured correctly
		Utils.getLogger().info("Registered Block: " + block.getUnlocalizedName().substring(5));

	}
	
	public static void registerRender(Block block) {
		Utils.blockModelLoader(block);
		Utils.getLogger().info("Registered Render for" + block.getUnlocalizedName().substring(5));

	}

}
