package com.easton.rainbowebs.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WebBlock;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;
import net.minecraftforge.common.IForgeShearable;

import java.util.Collections;
import java.util.List;

public class ColorWeb extends WebBlock implements IForgeShearable {

    public ColorWeb() {
        super(Block.Properties.copy(Blocks.COBWEB)
                .strength(4.0F, 4.0F)
                .noCollission());
    }
    @Override
    public float getDestroyProgress(BlockState state, Player player, BlockGetter worldIn, BlockPos pos) {
        if (player.getMainHandItem().getItem() instanceof SwordItem) {
            return 1.0F; // Instant break with sword
        }
        return super.getDestroyProgress(state, player, worldIn, pos);
    }
    }