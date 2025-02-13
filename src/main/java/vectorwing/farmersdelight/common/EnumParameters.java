package vectorwing.farmersdelight.common;

import net.minecraft.client.RecipeBookCategories;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.neoforged.fml.common.asm.enumextension.EnumProxy;
import net.neoforged.neoforge.client.IArmPoseTransformer;
import vectorwing.farmersdelight.client.renderer.SkilletItemRenderer;
import vectorwing.farmersdelight.common.registry.ModItems;

import java.util.List;
import java.util.function.Supplier;

public class EnumParameters
{
	public static final EnumProxy<RecipeBookCategories> PROXY_COOKING_SEARCH = new EnumProxy<>(
			RecipeBookCategories.class, (Supplier<List<ItemStack>>) () -> List.of(new ItemStack(Items.COMPASS))
	);
	public static final EnumProxy<RecipeBookCategories> PROXY_COOKING_MEALS = new EnumProxy<>(
			RecipeBookCategories.class, (Supplier<List<ItemStack>>) () -> List.of(new ItemStack(ModItems.VEGETABLE_NOODLES.get()))
	);
	public static final EnumProxy<RecipeBookCategories> PROXY_COOKING_DRINKS = new EnumProxy<>(
			RecipeBookCategories.class, (Supplier<List<ItemStack>>) () -> List.of(new ItemStack(ModItems.APPLE_CIDER.get()))
	);
	public static final EnumProxy<RecipeBookCategories> PROXY_COOKING_MISC = new EnumProxy<>(
			RecipeBookCategories.class, (Supplier<List<ItemStack>>) () -> List.of(new ItemStack(ModItems.DUMPLINGS.get()), new ItemStack(ModItems.TOMATO_SAUCE.get()))
	);
	public static final EnumProxy<HumanoidModel.ArmPose> PROXY_SKILLET_FLIP = new EnumProxy<>(
			HumanoidModel.ArmPose.class, false, new SkilletItemRenderer.ArmPoseTransformer()
	);
}
