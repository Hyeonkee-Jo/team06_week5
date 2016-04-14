package bill;

public abstract class Plan {
	
	double basecost;
	String grade;
	double addlinecost;
	double overflowtrafficcost;
	int basetraffic;
	
	
	public abstract double getBasecost();
	public abstract int getBaseTraffic();
	public abstract double getAddLineCost();
	public abstract double getOverflowTrafficCost();
	
	public void setBasecost(double basecost) {
		this.basecost = basecost;
	}

	public void setBaseTraffic(int basetraffic) {
		this.basetraffic = basetraffic;
	}

	
	public void setAddLineCost(double addlinecost) {
		this.addlinecost = addlinecost;
		
	}

	public void setOverflowTrafficCost(double overflowtrafficcost) {
		this.overflowtrafficcost = overflowtrafficcost;
		
	}
	
}