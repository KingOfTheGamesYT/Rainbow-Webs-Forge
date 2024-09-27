package com.easton.rainbowebs.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ShearsItem;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WebBlock;
import net.minecraft.world.level.block.state.BlockState;

public class ColorWeb extends WebBlock {

    public ColorWeb() {
        super(Block.Properties.copy(Blocks.COBWEB)
                .strength(4.0F, 4.0F)
                .noCollission());
    }
    @Override
    public float getDestroyProgress(BlockState state, Player player, BlockGetter worldIn, BlockPos pos) {
        if (player.getMainHandItem().getItem() instanceof SwordItem || player.getMainHandItem().getItem() instanceof ShearsItem) {
            return 0.1F; // Instant break with sword
        }
        return super.getDestroyProgress(state, player, worldIn, pos);
    }
    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        ItemStack heldItem = player.getMainHandItem();
        if (heldItem.getItem() instanceof SwordItem || heldItem.getItem() instanceof ShearsItem) {
            level.destroyBlock(pos, true);  //Drops the block with normal drops
        }
        super.playerWillDestroy(level, pos, state, player);
    }
    }