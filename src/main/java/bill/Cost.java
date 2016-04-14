package bill;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Cost {
	
	Plan plan;
	int traffic;
	int num;
	
	public Cost(String p, int traffic , int num) {
		
		this.traffic = traffic;
		this.num=num;
		if(("S").equals(p)){
			plan = new SilverPlan();		
		}
		else if(("G").equals(p)) {
			plan = new GoldPlan();
		}
	}
	
	@Override
	public String toString() {
		return this.calculatetotalcost()+"$";
	}
	
	
	public int getNumLine(){
		return num;
	}
	
	public double calculateoverflowtrafficcost(){
		double expectedBill = 0;
		if(traffic >= plan.getBaseTraffic())
			expectedBill = plan.getOverflowTrafficCost()*(traffic-plan.getBaseTraffic());
	
		return expectedBill;
	}
	
	public double calculatetotalcost(){
		double totalcost;
		totalcost = plan.getBasecost() + this.calculateoverflowtrafficcost() + this.calculateAddlineCost();
		return totalcost;
	}
	
	public double calculateAddlineCost(){
		int numofLine = getNumLine();
		double addlineCost = plan.getAddLineCost();
		double calculateCost;
		if (numofLine < 4)
			calculateCost = addlineCost * (numofLine-1); 
		else 
			calculateCost = ( addlineCost * 2 ) + ( 5 * (numofLine-3) );
				
		return calculateCost;
	}
	
	public void scanNprint() {
		Logger logger = Logger.getLogger("Bill");
	      @SuppressWarnings("resource")
	      Scanner scanner = new Scanner(System.in);
	      String planp = scanner.nextLine();
	      int trafficp = scanner.nextInt();
	      int nump = scanner.nextInt();
	      
	      Cost cost = new Cost(planp, trafficp, nump);
	      logger.log(Level.INFO, cost.toString());
	}

}
