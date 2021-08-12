package com.typesafe.typeimple;

import com.typesafe.Types;

public class Init extends Types {

  @Override
  public Types moveTypeInit() {
    throw new UnsupportedOperationException("지원하지 않는 동작 ");
  }

  @Override
  public Types moveTypeRun() {
    return new Running();
  }

  @Override
  public Types moveTypeTerminate() {
    throw new UnsupportedOperationException("지원하지 않는 동작 ");
  }

  @Override
  public void run() {
    super.run();
    System.out.println("이니셜됨");
  }

  protected Init() {
    super(Type.INIT);
  }
}
