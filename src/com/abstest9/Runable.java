package com.abstest9;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public interface Runable {
  Runable None = new Runable(){
    @Override
    public void run(Cell cell) {
      throw new NotImplementedException();
    }
  };
  void run(Cell cell);

}
