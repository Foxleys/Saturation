package me.foxley.saturation;

import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Saturation extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler
    public void onFoodLevelChange(FoodLevelChangeEvent event) {
        event.setFoodLevel(20);

        HumanEntity humanEntity = event.getEntity();
        if(humanEntity instanceof Player) {
            ((Player) humanEntity).setSaturation(20.0f);
        }
    }
}
