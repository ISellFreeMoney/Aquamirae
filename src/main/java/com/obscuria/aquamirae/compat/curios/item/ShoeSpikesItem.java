package com.obscuria.aquamirae.compat.curios.item;

import com.obscuria.aquamirae.compat.curios.CuriosCompat;
import com.obscuria.core.common.item.Lore;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

@Lore("lore.aquamirae.shoe_spikes")
public class ShoeSpikesItem extends CurioCompatItem {

    public ShoeSpikesItem() {
        super(new Properties().stacksTo(1).rarity(Rarity.COMMON));
    }

    public static class Curio implements ICurioItem {

        @Override
        public void curioTick(SlotContext context, ItemStack stack) {
            CuriosCompat.LivingEntityExtension.shoeSpikesTick(context.entity());
        }
    }
}
