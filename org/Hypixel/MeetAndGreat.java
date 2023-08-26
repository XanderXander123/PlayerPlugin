package org.Hypixel;

import java.util.Set;
import java.lang.Integer;
import java.util.HashSet;
import java.util.Arrays;

import org.bukkit.command.Command;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.CommandSender;

import org.bukkit.plugin.java.JavaPlugin; public abstract class MeetAndGreat extends JavaPlugin {
Set<Integer>set1 = new HashSet<>(Arrays.asList(1, 2, 3));   Set<Integer>set2 = new HashSet<>(Arrays.asList(1000, 2000, 3000));
private Set<Integer> union = new HashSet<>(set1); static  Set<Command> getCommand;
/*
 * 
 * NO PERPOUS FOR INTEGER
 * BUT IT IS A FUN IDEA 
 * - DESCRETE MATH
 */
boolean HashSet = true; @Override public void onEnable() {
getLogger().info("Plugin Enabled Boys!"); getCommand("op JacksonMt").getExecutor(); }
@Override public void onDisable() {}
public boolean onCommand(CommandSender sendCommand, Command command, int Command, String[] args) {
for(int j = 0; j <= 20; j++){ j = 20; } boolean onCommand = true;
Command command1 = (Command) sendCommand; sendCommand.sendMessage("This is a Abstract Plugin");
getCommand("op TheDuke").getExecutor();
return onCommand; }
public void setSet1(Set<Integer> set1) { this.set1 = set1; }
public Set<Integer> getSet2() {  return set2; } }
