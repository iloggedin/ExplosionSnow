package me.iloggedin.explosionsnow.explosionsnow;

import org.bukkit.plugin.java.JavaPlugin;

public final class ExplosionSnow extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new ExplosionListener(), this);
    }


}
