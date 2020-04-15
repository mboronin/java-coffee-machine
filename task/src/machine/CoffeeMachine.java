package machine;

import org.w3c.dom.ls.LSOutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeMachine {
  private int cash;
  private int milk;
  private int water;
  private int beans;
  enum Coffee {ESPRESSO, LATTE, CAPPUCCINO};

  public CoffeeMachine(int milk, int water, int beans) {
    this.milk = milk;
    this.water = water;
    this.beans = beans;
    this.cash = 0;
  }

  public int getCash() {
    return cash;
  }

  public void setCash(int cash) {
    this.cash = cash;
  }

  public int getMilk() {
    return milk;
  }

  public void setMilk(int milk) {
    this.milk = milk;
  }

  public int getWater() {
    return water;
  }

  public void setWater(int water) {
    this.water = water;
  }

  public int getBeans() {
    return beans;
  }

  public void setBeans(int beans) {
    this.beans = beans;
  }

  public void addCash(int cash) {
    this.cash += cash;
  }

  public void giveCash(int cash) {
    if (this.cash >= cash) this.cash -= cash;
  }

  public int cupsAvailable() {
    return Math.min(Math.min(water / 200, milk / 50), beans / 15);
  }

  public void makeCoffee(Coffee coffee){
    switch (coffee){
      case LATTE:
        break;
      case CAPPUCCINO:

    }

  }

  public void makeCoffee(){

  }

  private int[] amountNeeded(int numberOfCups) {
    return new int[]{numberOfCups * 200, numberOfCups * 50, numberOfCups * 15};
  }

  @Override
  public String toString() {
    return "The coffee machine has:\n" +
            water + " of water\n" +
            milk + " of milk\n" +
            beans + " of coffee beans\n" +
            cupsAvailable() + " of disposable cups\n" +
            cash + " of money";
  }
}

