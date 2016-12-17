package themadjem.plasmaticraft.handlers;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import themadjem.plasmaticraft.Utils;
import themadjem.plasmaticraft.init.ModBlocks;
import themadjem.plasmaticraft.init.ModItems;
import themadjem.plasmaticraft.init.ModTools;

public class RecipeHandler {

	public static void registerCraftingRecipes() {
		Utils.getLogger().info("Registered Crafting Recipes");
		GameRegistry.addRecipe(new ItemStack(ModTools.plasmaPick), new Object[]{"ppp"," i "," i ", 'p', ModItems.plasmaticIngot, 'i', Items.IRON_INGOT});
		GameRegistry.addRecipe(new ItemStack(ModTools.plasmaSword), new Object[]{"p","p","i", 'p', ModItems.plasmaticIngot, 'i', Items.IRON_INGOT});
		GameRegistry.addRecipe(new ItemStack(ModItems.plasmaNugget,9), new Object[]{"i",'i',ModItems.plasmaticIngot});
		GameRegistry.addRecipe(new ItemStack(ModItems.plasmaticIngot), new Object[]{"iii","iii","iii",'i',ModItems.plasmaNugget});
		GameRegistry.addRecipe(new ItemStack(ModBlocks.plasmatic_block), new Object[]{"iii","iii","iii",'i',ModItems.plasmaticIngot});
		GameRegistry.addRecipe(new ItemStack(ModItems.plasmaticIngot,9), new Object[]{"i",'i',ModBlocks.plasmatic_block});


	}
	
    public static void registerSmeltingRecipes() {
		Utils.getLogger().info("Reging Smelt Rec");
		GameRegistry.addSmelting(ModBlocks.plasmatic_ore, new ItemStack(ModItems.plasmaticIngot), 100f);
		
	}
    
    private static void registerToolRecipies(){
    	
    	
    	
    }
}
