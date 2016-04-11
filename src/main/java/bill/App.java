package bill;

import java.util.logging.*;
import java.util.Scanner;

public class App {
   private App(){
      
   }
   
   public static void main(String[] args) {
      Logger logger = Logger.getLogger("Bill");
      @SuppressWarnings("resource")
      Scanner scan = new Scanner(System.in);
      String plan = scan.nextLine();
      int traffic = scan.nextInt();
      int num = scan.nextInt();
      
      Cost cost = new Cost(plan, traffic, num);
      logger.log(Level.INFO, cost.toString());
   }
}
