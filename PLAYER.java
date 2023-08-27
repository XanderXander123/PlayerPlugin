import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class HelloHypixelPlugin extends JavaPlugin implements Listener, CommandExecutor {
    @Override  public void onEnable() {  getLogger().info("HelloHypixelPlugin has been enabled!");
    getServer().getPluginManager().registerEvents(this, this); getCommand("vip").setExecutor(this); }
    @Override  public void onDisable() { getLogger().info("HelloHypixelPlugin has been disabled!");
    @EventHandler  public void onPlayerJoin(PlayerJoinEvent event) { Player player = event.getPlayer();
    if (player.getServer().getServerName().equalsIgnoreCase("Hypixel")) {  player.sendMessage(ChatColor.GREEN +
    "Hello? You have joined Hypixel.");  } }
    @Override  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
    if (cmd.getName().equalsIgnoreCase("vip")) { if (sender instanceof Player) { Player player = (Player) sender;
    if (player.getServer().getServerName().equalsIgnoreCase("Hypixel")) {  player.sendMessage(ChatColor.YELLOW + "Buy VIP at Hypixel.net");
    } else {  player.sendMessage(ChatColor.RED + "You are not on Hypixel."); }
    return true;
    } else { sender.sendMessage(ChatColor.RED + "Only players can use this command."); return true;
    } } return false; }
}
