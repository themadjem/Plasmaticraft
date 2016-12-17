package themadjem.plasmaticraft.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import themadjem.plasmaticraft.Reference;
import themadjem.plasmaticraft.Utils;

public class ItemModFoods extends ItemFood{

	/*
	 * Holds the potion effects for our food
	*/
	private PotionEffect[] effects;

	/**
	 * This creates a new food item
	 * 
	 * @param unlocalizedName
	 *            The unlocalized and registry name
	 * @param amount
	 *            How many hunger points the food will refill
	 * @param isWolfFood
	 *            If the food can be ate by a wolf
	 * @param potionEffects
	 *            Potion effects that will be given to the player upon eating it
	 */
//	public ItemModFoods(String unlocalizedName, int amount, boolean isWolfFood, PotionEffect... potionEffects) {
//		super(amount, isWolfFood);
//		this.effects = potionEffects;
//		this.setUnlocalizedName(unlocalizedName);
//		this.setRegistryName(Reference.MOD_ID, unlocalizedName);
//		
//	}

	/**
	 * This creates a new food item
	 * 
	 * @param unlocalizedName
	 *            The unlocalized and registry name
	 * @param amount
	 *            How many hunger points the food will refill
	 * @param saturation
	 *            How long the food will last after it has been ate
	 * @param isWolfFood
	 *            If the food can be ate by a wolf
	 * @param potionEffects
	 *            Potion effects that will be given to the player upon eating it
	 */
	public ItemModFoods(String unlocalizedName, int amount, float saturation, boolean isWolfFood, PotionEffect... potionEffects) {
		super(amount, saturation, isWolfFood);
		this.effects = potionEffects;
		this.setUnlocalizedName(unlocalizedName);
		this.setRegistryName(Reference.MOD_ID, unlocalizedName);
		this.setAlwaysEdible();
		this.setMaxStackSize(16);
	}
	

	/**
	 * Called when the player eats the food.
	 * This adds all of the potion effects to the player
	 */
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		Utils.getLogger().info(effects);
		
		for(PotionEffect effect : effects){
			player.addPotionEffect(effect);
			Utils.getLogger().info(effect + " Applied");
		}
		
		Utils.getLogger().info("Item consumed");
	}
	
	
	

}
