package bill;

public class SilverPlan implements Plan {
	double basecost;
	int basetraffic;
	String grade;
	double addlinecost;
	double overflowtrafficcost;
	
	public SilverPlan() {
		this.basecost = 29.95;
		this.basetraffic = 500;
		this.grade = "SILVER";
		this.addlinecost = 21.5;
		this.overflowtrafficcost = 0.54;	
	}
	
	@Override
	public double getBasecost() {
		return this.basecost;
	}
	@Override
	public int getBaseTraffic() {
		return this.basetraffic;
	}
	
	@Override
	public double getAddLineCost()
	{
		return this.addlinecost;
	}
	
	@Override
	public double getOverflowTrafficCost() {
		return this.overflowtrafficcost;
	}

	@Override
	public void setBasecost(double basecost) {
		this.basecost = basecost;
		
	}

	@Override
	public void setBaseTraffic(int basetraffic) {
		this.basetraffic = basetraffic;
		
	}

	@Override
	public void setAddLineCost(double addlinecost) {
		this.addlinecost = addlinecost;
		
	}

	@Override
	public void setOverflowTrafficCost(double overflowtrafficcost) {
		this.overflowtrafficcost = overflowtrafficcost;
	}
	
}