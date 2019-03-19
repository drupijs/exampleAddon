package hundeklemmen.addon;

import hundeklemmen.api.DrupiAPI;
import hundeklemmen.api.DrupiLoadEvent;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class main extends JavaPlugin implements Listener {

    private static main instance;
    private static DrupiAPI Drupi;

    public static boolean update = false;

    @Override
    public void onEnable() {
        instance = this;
        instance.getLogger().info("Drupi Addon has been enabled");

        instance.getServer().getPluginManager().registerEvents(this, this);
        instance.getServer().getPluginManager().registerEvents(new eventHandler(), this);

        //register our addon
        instance.getLogger().info("Registering TestAddon");
        Drupi = new DrupiAPI("TestAddon");
        instance.getLogger().info("TestAddon has been registered");

    }

    @Override
    public void onDisable(){
        instance.getLogger().info("Drupi Addon has been disabled");
    }

    @EventHandler
    public void DrupiLoad(DrupiLoadEvent event){
        //registering a class
        Drupi.register(new testClass(instance));
    }


    public static main getInstance(){
        return instance;
    }

    public static DrupiAPI getDrupi(){
        return Drupi;
    }



}