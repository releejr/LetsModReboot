package com.generlee.letsmodreboot.init;

import com.generlee.letsmodreboot.item.ItemLMRB;
import com.generlee.letsmodreboot.item.ItemMapleLeaf;
import com.generlee.letsmodreboot.reference.Names;
import com.generlee.letsmodreboot.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLMRB mapleLeaf = new ItemMapleLeaf();

    public static void init()
    {
        GameRegistry.registerItem(mapleLeaf, Names.Items.MAPLE_LEAF);
    }
}
