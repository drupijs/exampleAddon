package hundeklemmen.addon;

import hundeklemmen.legacy.addon.DrupiAddon;
import org.bukkit.plugin.java.JavaPlugin;

public class MainPlugin extends JavaPlugin {

    private static MainPlugin instance;
    private static DrupiAddon Addon;


    @Override
    public void onEnable() {
        instance = this;
        instance.getLogger().info("Drupi Addon has been enabled");

        instance.getServer().getPluginManager().registerEvents(new eventHandler(), this);

        //register our addon
        instance.getLogger().info("Registering TestAddon");
        Addon = new DrupiAddon("TestAddon", new DPIAddon(instance));
        instance.getLogger().info("TestAddon has been registered");

    }

    @Override
    public void onDisable(){
        instance.getLogger().info("Drupi Test Addon has been disabled");
    }


    public static MainPlugin getInstance(){
        return instance;
    }

    public static DrupiAddon getAddon(){
        return Addon;
    }



}