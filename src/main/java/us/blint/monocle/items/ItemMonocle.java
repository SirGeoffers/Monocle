package us.blint.monocle.items;

import net.minecraft.item.ItemArmor;

public class ItemMonocle extends ItemArmor {

    public ItemMonocle(String unlocalizedName, ArmorMaterial material, int renderIndex, int armorType) {
        super(material, renderIndex, armorType);
        this.setUnlocalizedName(unlocalizedName);
    }

}
