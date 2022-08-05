package me.afagaming.customcommands.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class ClearCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) { //checks if the person who ran the command is a player
            Player player = (Player) sender;

        if (player.isOp() || player.hasPermission("CustomCommands.Clear")){ //checks for perms
            Inventory inv = player.getInventory(); //it has to get the inventory 1st, the inventory is stored in the "inv" variable
            inv.clear(); //clears the inventory
            player.sendMessage(ChatColor.GREEN + "Your inventory has been cleared by the CustomCommands plugin."); //lets them know
            return false; //we've done everything we wanted to so this can return true
        } else {
            player.sendMessage(ChatColor.RED + "Insufficent Permissions!");
            return false; //we've done everything we wanted to so this can return true
        }
        }else {
            System.out.println("You have to be a player to run this command.");
            return false; //we've done everything we wanted to so this can return true
        }
    }
}
//End of code!