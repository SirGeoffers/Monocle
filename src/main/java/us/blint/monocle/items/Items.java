package us.blint.monocle.items;

import us.blint.monocle.Monocle;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;

public class Items {

    public static Item itemMonocle;
    public static ArmorMaterial AM_Monocle = EnumHelper.addArmorMaterial("AM_Monocle", Monocle.MODID + ":monocleHeadpiece", 16,
                                                        new int[] { 3, 8, 6, 3 }, 30);

    public static void createItems() {
        GameRegistry.registerItem(itemMonocle = new ItemMonocle("monocleHeadpiece", AM_Monocle, 1, 0), "monocleHeadpiece");
    }

}
