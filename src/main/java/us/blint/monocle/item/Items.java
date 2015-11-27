package us.blint.monocle.item;

import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class Items {

    public static ArmorMaterial monocleMaterial = EnumHelper.addArmorMaterial("monocleA", "tutorial:tutorial", 16,
                                                        new int[] { 0, 0, 0, 0 }, 0);

    public static void createItems() {

        ItemMonocle itemMonocle = new ItemMonocle("Monocle", monocleMaterial, 1, 0);
        GameRegistry.registerItem(itemMonocle, "Monocle");

    }

}
