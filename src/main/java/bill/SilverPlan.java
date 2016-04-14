package bill;

public class SilverPlan extends Plan {
	
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
	
}