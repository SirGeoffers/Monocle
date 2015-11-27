package us.blint.monocle;

import us.blint.monocle.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Monocle.MODID, version = Monocle.VERSION)
public class Monocle {

    public static final String  MODID       = "monocle";
    public static final String  VERSION     = "1.0";

    private static final String CLIENTPROXY = "us.blint.monocle.proxy.ClientProxy";
    private static final String SERVERPROXY = "us.blint.monocle.proxy.ServerProxy";

    @SidedProxy(clientSide = CLIENTPROXY, serverSide = SERVERPROXY)
    public static CommonProxy   proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        Monocle.proxy.preInit(e);
    }

    @EventHandler
    public void init(FMLInitializationEvent e) {
        Monocle.proxy.init(e);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent e) {
        Monocle.proxy.postInit(e);
    }

}
