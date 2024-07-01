package org.example;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(int x, int y) {
    double ave = (double) sum(x, y) / 2;
    return ave;
  }

  public int sumto(int x, int y) {
    int sum = 0;
    if (x > y) {
      int a;
      a = x;
      x = y;
      y = a;
    }
    for (int i = x; i <= y; i++) {
      sum += i;
    }
    return sum;
  }

  public int sumodd(int x, int y) {
    int sumo = 0;
    if (x > y) {
      int a;
      a = x;
      x = y;
      y = a;
    }
    for (int i = x; i <= y; i++) {
      if (i % 2 != 0) {
        sumo += i;
      }
    }
    return sumo;
  }

  public int sumenve(int x, int y) {
    int sume = 0;
    if (x > y) {
      int a;
      a = x;
      x = y;
      y = a;
    }
    for (int i = x; i <= y; i++) {
      if (i % 2 == 0) {
        sume += i;
      }
    }
    return sume;
  }
}
