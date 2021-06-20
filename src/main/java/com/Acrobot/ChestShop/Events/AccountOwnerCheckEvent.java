package com.Acrobot.ChestShop.Events;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class AccountOwnerCheckEvent extends Event implements Cancellable {
  private static final HandlerList handlers = new HandlerList();
  private String name;
  private Player player;
  private boolean b = false;

  public AccountOwnerCheckEvent(Player player, String name) {
    this.player = player;
    this.name = name;
  }

  public static HandlerList getHandlerList() {
    return handlers;
  }

  public Player getPlayer() {
    return this.player;
  }

  public String getName() {
    return this.name;
  }

  public HandlerList getHandlers() {
    return handlers;
  }

  public boolean isCancelled() {
    return this.b;
  }

  public void setCancelled(boolean b) {
    this.b = b;
  }
}