package dev.doaddon.cornexpansion.items;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

public class StickFoodItem extends EffectItem {
    public StickFoodItem(Item.Properties arg) {
        super(arg);
    }

    @Override
    public @NotNull ItemStack finishUsingItem(ItemStack item, Level level, LivingEntity entity) {
        ItemStack itemStack = super.finishUsingItem(item, level, entity);

        if (entity instanceof Player && ((Player) entity).getAbilities().instabuild)
            return itemStack;

        if ((!level.isClientSide) && (entity instanceof Player player)) {
            ItemStack stickStack = new ItemStack(Items.STICK);
            if (!player.getInventory().add(stickStack)) player.drop(stickStack, false);
        }
        return itemStack;
    }
}
