package com.jaoafa.AntiAlts3;

import java.util.UUID;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;

public class AntiAltsPlayer {
	private String name;
	private UUID uuid;

	public AntiAltsPlayer(Player player) {
		name = player.getName();
		uuid = player.getUniqueId();
	}

	public AntiAltsPlayer(OfflinePlayer player) {
		name = player.getName();
		uuid = player.getUniqueId();
	}

	public AntiAltsPlayer(String name, UUID uuid) {
		this.name = name;
		this.uuid = uuid;
	}

	public AntiAltsPlayer(UUID uuid) {
		this.name = null;
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public UUID getUniqueId() {
		return uuid;
	}
}
