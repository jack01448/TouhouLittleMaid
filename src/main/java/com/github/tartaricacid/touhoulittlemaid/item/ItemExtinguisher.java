package com.github.tartaricacid.touhoulittlemaid.item;

import com.github.tartaricacid.touhoulittlemaid.init.InitItems;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.Util;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class ItemExtinguisher extends Item {
    public ItemExtinguisher() {
        super((new Properties()).tab(InitItems.MAIN_TAB).durability(128).setNoRepair());
    }

    @Override
    public ActionResult<ItemStack> use(World worldIn, PlayerEntity playerIn, Hand handIn) {
        if (worldIn.isClientSide) {
            playerIn.sendMessage(new TranslationTextComponent("message.touhou_little_maid.extinguisher.player_cannot_use"), Util.NIL_UUID);
        }
        return super.use(worldIn, playerIn, handIn);
    }
}
