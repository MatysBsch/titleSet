package com.matys.title.Commands;

import com.sun.xml.internal.stream.events.NamedEvent;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.awt.*;

public class Commands implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String s, String[] strings) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            StringBuffer sb = new StringBuffer();
            StringBuffer sb2 = new StringBuffer();
            StringBuffer sb3= new StringBuffer();

                sb.append(strings[0]);
            String str = sb.toString();

            String pName = player.getName();

            sb2.append(strings[1]);
            String str2 = sb2.toString();

            sb3.append(strings[2]);
            String str3 = sb3.toString();

            ChatColor c = ChatColor.valueOf(str2);
            ChatColor c2 = ChatColor.valueOf(str3);

            String Name = str.toString();
            player.setDisplayName(c + Name + " " + c2 + pName);


        }
        return true;
    }

}
