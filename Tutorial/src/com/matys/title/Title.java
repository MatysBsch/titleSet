package com.matys.title;

import com.matys.title.Commands.Commands;
import com.matys.title.events.ChatEvents;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Title extends JavaPlugin {

    @Override
    public void onEnable(){
        this.getCommand("settitle").setExecutor(new Commands());
        getServer().getPluginManager().registerEvents(new ChatEvents(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "[Title] : Plugin is enabled");
    }


    @Override
    public void onDisable(){
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "[Title] : Plugin is disabled");

    }
}
