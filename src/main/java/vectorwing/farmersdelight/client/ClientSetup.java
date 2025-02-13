package vectorwing.farmersdelight.client;

import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.renderer.item.ItemProperties;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import vectorwing.farmersdelight.client.gui.ComfortHealthOverlay;
import vectorwing.farmersdelight.client.gui.CookingPotScreen;
import vectorwing.farmersdelight.client.gui.NourishmentHungerOverlay;
import vectorwing.farmersdelight.client.renderer.SkilletItemRenderer;
import vectorwing.farmersdelight.common.registry.ModItems;
import vectorwing.farmersdelight.common.registry.ModMenuTypes;

public class ClientSetup
{
	public static final HumanoidModel.ArmPose SKILLET_FLIP = HumanoidModel.ArmPose.create("SKILLET_FLIP", false, new SkilletItemRenderer.ArmPoseTransformer());

	public static void init(final FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ModMenuTypes.COOKING_POT.get(), CookingPotScreen::new);
			ItemProperties.register(ModItems.SKILLET.get(), new ResourceLocation("cooking"),
					(stack, world, entity, s) -> stack.getTagElement("Cooking") != null ? 1 : 0);
		});

		NourishmentHungerOverlay.init();
		ComfortHealthOverlay.init();
	}
}
