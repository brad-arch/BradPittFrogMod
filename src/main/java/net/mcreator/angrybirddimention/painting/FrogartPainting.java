
package net.mcreator.angrybirddimention.painting;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class FrogartPainting {

	@SubscribeEvent
	public static void registerPaintingType(RegistryEvent.Register<PaintingType> event) {
		event.getRegistry().register(new PaintingType(64, 64).setRegistryName("frogart"));
	}

}
