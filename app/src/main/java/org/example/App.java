/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public String getSumAverage(int x, int y) {
    Calculate calculate = new Calculate();
    int sum = calculate.sum(x, y);
    double ave = calculate.average(x, y);
    String str = String.format("Sum of %d and %d is %d. Average is %.1f.", x, y, sum, ave);
    return str;
  }

  public String getSumto(int x, int y) {
    Calculate calculate = new Calculate();
    int sum = calculate.sumto(x, y);
    double ave = calculate.average(x, y);
    String str = String.format("Sum of %d to %d is %d. Average is %.1f.", x, y, sum, ave);
    return str;
  }

  public String getSumOE(int x, int y) {
    Calculate calculate = new Calculate();
    int sumo = calculate.sumodd(x, y);
    int sume = calculate.sumenve(x, y);
    String str = String.format("Sum of odd %d to %d is %d. Sum of even is %d.", x, y, sumo, sume);
    return str;
  }

  public static void main(String[] args) {
    System.out.println(new App().getGreeting());
    System.out.println(new App().getSumAverage(2, 3));
    System.out.println(new App().getSumto(1, 10));
    System.out.println(new App().getSumOE(1, 10));
  }
}
