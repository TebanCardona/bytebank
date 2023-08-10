package com.bytebank.model;

public class GuardarObjectos {
  int indice = 0;
  Object[] ref = new Object[10];

  public void add(Object obj) {
    ref[indice] = obj;
    this.indice++;
  }

  public Object getObject(int indice) {
    return ref[indice];
  }
}
