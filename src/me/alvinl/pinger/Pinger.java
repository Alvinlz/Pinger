package me.alvinl.pinger;
//Import the goods
import java.util.logging.Logger;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

public class Pinger extends JavaPlugin{
	public final Logger logger = Logger.getLogger("Minecraft");
	public static Pinger plugin;
	
	//Plugin shut-down
	@Override
	public	void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Has been disabled!");
	}
	//Plugin start-up
	@Override
	public void onEnable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		this.logger.info(pdfFile.getName() + " Version " + pdfFile.getVersion() + " Has been enabled!");
	}
	//Commands
	public boolean onCommand(CommandSender sender, Command cmd, String commandLabel, String[] args){
		Player player = (Player) sender;	
		if(commandLabel.equalsIgnoreCase("ping")){
			player.sendMessage(ChatColor.GOLD + "pong!");
			}
		return false;
		}
}