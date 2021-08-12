package com.command;

public class GoogleHome {
  private Command command;

  public GoogleHome(Command command) {
    setCommand(command);
  }

  public void setCommand(Command command) {
    this.command = command;
  }

  public void talk(){
    command.run();
  }
}
