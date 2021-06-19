package com.Acrobot.ChestShop.Events;

import com.Acrobot.ChestShop.Database.Account;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PreAccountCheckEvent extends Event implements Cancellable {
  private static final HandlerList handlers = new HandlerList();

  private Account account;

  private boolean b = false;

  public PreAccountCheckEvent(Account account) {
    this.account = account;
  }

  public Account getAccount() {
    return account;
  }

  public HandlerList getHandlers() {
    return handlers;
  }

  public static HandlerList getHandlerList() {
    return handlers;
  }

  @Override
  public boolean isCancelled() {
    return b;
  }

  @Override
  public void setCancelled(boolean b) {
    this.b = b;
  }
}