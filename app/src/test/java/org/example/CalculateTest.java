package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  @Test
  public void testaverage() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.average(2, 3), 0.01);
  }

  @Test
  public void testsumto() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.sumto(1, 10));
    assertEquals(expected, calculate.sumto(10, 1));
  }

  @Test
  public void testsumodd() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.sumodd(1, 10));
    assertEquals(expected, calculate.sumodd(10, 1));
  }

  @Test
  public void testsumenve() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.sumenve(1, 10));
    assertEquals(expected, calculate.sumenve(10, 1));
  }
}
