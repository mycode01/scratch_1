package com.typesafe.typeimple;

import com.typesafe.Types;

public class Nothing extends Types {

  @Override
  public Types moveTypeInit() {
    return new Init();
  }

  @Override
  public Types moveTypeRun() {
    throw new UnsupportedOperationException("지원하지 않는 동작 ");
  }

  @Override
  public Types moveTypeTerminate() {
    throw new UnsupportedOperationException("지원하지 않는 동작 ");
  }

  @Override
  public void run() {
    super.run();
    System.out.println("경 아무것도 안함 축");
  }

  public Nothing() {
    super(Type.NOTHING);
  }
}
