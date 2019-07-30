package hundeklemmen.addon;

import hundeklemmen.legacy.addon.DrupiAddon;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerGameModeChangeEvent;

public class eventHandler implements Listener {

    //Registering an event as normal
    @EventHandler
    public void PlayerGameModeChange(PlayerGameModeChangeEvent event){
        //Loading our DrupiAPI from our main
        DrupiAddon Addon = MainPlugin.getAddon();
        //registering our Drupi event, this will be accessible by addonName_PlayerGameModeChangeEvent and in this example it would then be: function TestAddon_PlayerGameModeChangeEvent(event)
        //We could use event.getClass().getName() instead of "PlayerGameModeChangeEvent" but this is simpler to show
        Addon.callEvent("PlayerGameModeChangeEvent", event);
    }

}
