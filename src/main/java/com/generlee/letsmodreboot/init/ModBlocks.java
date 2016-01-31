package com.generlee.letsmodreboot.init;


import com.generlee.letsmodreboot.block.BlockFlag;
import com.generlee.letsmodreboot.block.BlockLMRB;
import com.generlee.letsmodreboot.reference.Names;
import com.generlee.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLMRB flag = new BlockFlag();

    public static void init()
    {
        GameRegistry.registerBlock(flag, Names.Blocks.FLAG);
    }
}

