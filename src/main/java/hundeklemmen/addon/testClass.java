package hundeklemmen.addon;

import org.bukkit.World;
import org.bukkit.entity.Player;

public class testClass {


    main plugin;

    public testClass(main plugin){
        this.plugin = plugin;
    }

    //This will be accessible by our addonName.getWorld so in this test it would be TestAddon.getWorld
    public World getWorld(String worldName){
        World ourWorld = plugin.getServer().getWorld(worldName);
        return ourWorld;
    }

    //This will be accessible by our addonName.kickPlayer so in this test it would be TestAddon.kickPlayer
    public void kickPlayer(Player player, String Reason){
        player.kickPlayer(Reason);
    }

}
