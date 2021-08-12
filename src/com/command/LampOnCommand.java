package com.command;

public class LampOnCommand implements Command{
  private final Lamp lamp;

  public LampOnCommand(Lamp lamp) {
    this.lamp = lamp;
  }

  @Override
  public void run() {
    lamp.lightOn();
  }
}
