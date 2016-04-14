package bill;

public class App {
   private App(){
      
   } 
   public static void main(String[] args) {
      Cost cost = new Cost("S", 0, 0);
      
      cost.scanNprint();
      
   }
}
