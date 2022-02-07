package me.iloggedin.explosionsnow.explosionsnow;

import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class ExplosionListener implements Listener{

    @EventHandler
    public void onHitEvent(ProjectileHitEvent event){
        if(event.getEntity() instanceof Snowball s){
            s.getWorld().createExplosion(s.getLocation(), 4);
        }
    }
}
