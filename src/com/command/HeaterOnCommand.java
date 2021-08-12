package com.command;

public class HeaterOnCommand implements Command {

  private final Heater heater;

  public HeaterOnCommand(Heater heater) {
    this.heater = heater;
  }

  @Override
  public void run() {
    heater.powerOn();
  }
}
