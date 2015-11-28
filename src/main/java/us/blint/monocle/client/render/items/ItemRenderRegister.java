package us.blint.monocle.client.render.items;

import us.blint.monocle.Monocle;
import us.blint.monocle.items.Items;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class ItemRenderRegister {

    public static void registerItemRenderer() {
        registerItem(Items.itemMonocle);
    }

    private static void registerItem(Item item) {
        Minecraft
                .getMinecraft()
                .getRenderItem()
                .getItemModelMesher()
                .register(
                        item,
                        0,
                        new ModelResourceLocation(Monocle.MODID + ":" + item.getUnlocalizedName().substring(5),
                                "inventory"));
    }

}
