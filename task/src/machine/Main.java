package machine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) {
    public static void main(String[] args) throws IOException {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Write action(buy, fill, take): ");
      int answer;

      String reply = reader.readLine();
      switch (reply) {
        case "buy": {
          System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
          answer = Integer.parseInt(reader.readLine());
          buy(answer);
          break;
        }
        case "fill": {
          fill();
          break;
        }
        case "take": {
          take();
          break;
        }
        default: {
          System.out.println("Nothing available");
          return;
        }
      }
      System.out.println("Write how many many ml of water the coffee machine has:");

      int amountWater = Integer.parseInt(reader.readLine());
      System.out.println("Write how many ml of milk the coffee machine has:");
      int amountMilk = Integer.parseInt(reader.readLine());
      System.out.println("Write how many grams of coffee beans the coffee machine has:");
      int amountBeans = Integer.parseInt(reader.readLine());
      System.out.println("Write how many cups of coffee you will need");
      int amount = Integer.parseInt(reader.readLine());
      int cups = numberAvailable(amountWater, amountMilk, amountBeans);
      if (cups >= amount) {
        int numberLeft = cups - amount;
        if (numberLeft > 0) {
          System.out.println("Yes, I can make that amount of coffee (and even " + numberLeft + " more than that)");
        } else System.out.println("Yes, I can make that amount of coffee");
      } else {
        System.out.println("No, I can make only " + cups + " cup(s) of coffee");
      }

    }
  }
}
