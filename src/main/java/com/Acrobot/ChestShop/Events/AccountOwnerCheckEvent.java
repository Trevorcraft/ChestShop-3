package com.Acrobot.ChestShop.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class AccountOwnerCheckEvent extends Event {
  private static final HandlerList handlers = new HandlerList();

  private String name;
  private Player player;
  private boolean applies = false;
  private boolean valid = false;

  public AccountOwnerCheckEvent(Player player, String name) {
    this.player = player;
    this.name = name;
  }

  public static HandlerList getHandlerList() {
    return handlers;
  }

  public Player getPlayer() {
    return player;
  }

  public String getName() {
    return name;
  }

  public HandlerList getHandlers() {
    return handlers;
  }

  // Applies to name tells us if anyone cares about the name
  public boolean appliesToName() {
    return applies;
  }

  public boolean isValid() {
    return valid;
  }

  // Set whether or not this name is valid
  // Don't call this if we don't care about the name
  public void setValid(boolean isValid) {
    applies = true;
    valid = false;
  }

  // Can be used by priority plugins to override an earlier plugin
  public void ignore() {
    applies = false;
    valid = false;
  }
}