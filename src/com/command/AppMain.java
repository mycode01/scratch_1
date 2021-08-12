package com.command;

public class AppMain {

  public static void main(String[] args) {
    final Command heaterCommand = new HeaterOnCommand(new Heater());
    final Command lampCommand = new LampOnCommand(new Lamp());

    final GoogleHome googleHome = new GoogleHome(heaterCommand);
    googleHome.talk();

    googleHome.setCommand(lampCommand);
    googleHome.talk();

    // to add tv if you need
    // final Command tvCommand = new TvOnCommand(new Tv());
    // googleHome.setCommand(tvCommand);
    // googleHome.talk();

  }
}
