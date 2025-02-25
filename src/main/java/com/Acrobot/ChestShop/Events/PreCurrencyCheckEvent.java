package com.Acrobot.ChestShop.Events;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

import java.math.BigDecimal;
import java.util.UUID;

public class PreCurrencyCheckEvent extends Event implements Cancellable {
  private static final HandlerList handlers = new HandlerList();

  private UUID account;
  private BigDecimal amountSent;
  private boolean b = false;
  private boolean hasEnough = false;

  public PreCurrencyCheckEvent(UUID account, BigDecimal amountSent) {
    this.account = account;
    this.amountSent = amountSent;
  }

  public UUID getAccount() {
    return account;
  }

  public BigDecimal getAmountSent() {
    return amountSent;
  }

  public HandlerList getHandlers() {
    return handlers;
  }

  public static HandlerList getHandlerList() {
    return handlers;
  }

  public boolean isHasEnough() {
    return hasEnough;
  }

  public void setHasEnough(boolean hasEnough) {
    this.hasEnough = hasEnough;
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