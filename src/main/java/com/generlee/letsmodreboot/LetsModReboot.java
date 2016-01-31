package com.generlee.letsmodreboot;


import com.generlee.letsmodreboot.client.handler.KeyInputEventHandler;
import com.generlee.letsmodreboot.handler.ConfigurationHandler;
import com.generlee.letsmodreboot.init.ModBlocks;
import com.generlee.letsmodreboot.init.ModItems;
import com.generlee.letsmodreboot.init.Recipes;
import com.generlee.letsmodreboot.proxy.IProxy;
import com.generlee.letsmodreboot.reference.Reference;
import com.generlee.letsmodreboot.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;


@Mod(modid= Reference.MOD_ID, name= Reference.MOD_NAME, version= Reference.VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class LetsModReboot {

    @Mod.Instance(Reference.MOD_ID)
    public static LetsModReboot instance;

    @SidedProxy(clientSide= Reference.CLIENT_PROXY_CLASS, serverSide=Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        proxy.registerKeyBindings();

        ModItems.init();
        ModBlocks.init();
        LogHelper.info("Pre Initialization Complete ");
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        FMLCommonHandler.instance().bus().register(new KeyInputEventHandler());
        Recipes.init();
        LogHelper.info("Initialization Complete ");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        LogHelper.info("Post Initialization Complete ");
    }

}
