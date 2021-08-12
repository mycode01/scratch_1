package com.typesafe.typeimple;

import com.typesafe.Types;

public class Running extends Types {

  @Override
  public Types moveTypeInit() {
    throw new UnsupportedOperationException("지원하지 않는 동작 ");
  }

  @Override
  public Types moveTypeRun() {
    throw new UnsupportedOperationException("지원하지 않는 동작 ");
  }

  @Override
  public Types moveTypeTerminate() {
    return new Terminated();
  }

  @Override
  public void run() {
    super.run();
    System.out.println("열심히 일함 ");
  }

  protected Running() {
    super(Type.RUNNING);
  }
}
