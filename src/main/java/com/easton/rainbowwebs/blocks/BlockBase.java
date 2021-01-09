package com.easton.rainbowwebs.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.WebBlock;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;

public class BlockBase extends WebBlock {

    public BlockBase() {
        super(Block.Properties.create(Material.WEB)
                .hardnessAndResistance(4.0F)
                .harvestLevel(0)
                .doesNotBlockMovement()
                .notSolid()
                .harvestTool(ToolType.PICKAXE));
    }
}