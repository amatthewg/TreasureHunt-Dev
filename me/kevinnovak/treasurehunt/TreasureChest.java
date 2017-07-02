package me.kevinnovak.treasurehunt;

import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Chest;
import org.bukkit.inventory.ItemStack;

public class TreasureChest {
	private UUID id;
	private Location location;
	private int timeAlive = 0;
	private int timeSinceOpened = 0;
	private boolean opened = false;
	private String foundBy = "None";
	private String type = "None";
	
	TreasureChest(UUID id, Location location, String chestType) {
        this.id = id;
        this.location = location;
        this.type = chestType;
    }
	
	TreasureChest(UUID id, Location location, String chestType, int timeAlive) {
		this.id = id;
        this.location = location;
        this.timeAlive = timeAlive;
    }
	
	UUID getID() {
		return this.id;
	}
	
	void setID(UUID id) {
		this.id = id;
	}
	
	Location getLocation() {
		return this.location;
	}
	
	void setLocation(Location location) {
		this.location = location;
	}
	
	int getTimeAlive() {
		return this.timeAlive;
	}
	
	void setTimeAlive(int timeAlive) {
		this.timeAlive = timeAlive;
	}
	
	int getTimeSinceOpened() {
		return this.timeSinceOpened;
	}
	
	void setTimeSinceOpened(int timeSinceOpened) {
		this.timeSinceOpened = timeSinceOpened;
	}
	
	boolean isOpened() {
		return this.opened;
	}
	
	void setOpened(boolean opened) {
		this.opened = opened;
	}
	
	String getFoundBy() {
		return this.foundBy;
	}
	
	void setFoundBy(String foundBy) {
		this.foundBy = foundBy;
	}
	
	String getType() {
		return this.type;
	}
	
	void setType(String type) {
		this.type = type;
	}
	
	void spawn(ItemStack[] items) {
		this.location.getBlock().setType(Material.CHEST);
		Chest chest = (Chest) this.location.getBlock().getState();
		chest.getInventory().setContents(items);
	}
	
	void despawn() {
		this.location.getBlock().setType(Material.AIR);
	}
}