package bill;


public class GoldPlan extends Plan{
	
	
	public GoldPlan()
	{
		this.basecost = 49.95;
		this.grade = "Gold";
		this.addlinecost = 14.50;
		this.overflowtrafficcost = 0.45;
		this.basetraffic = 1000;
	}
	
	public double getBasecost()
	{
		return this.basecost;
	}
	
	public double getAddLineCost()
	{
		return this.addlinecost;
	}
	
	public double getOverflowTrafficCost()
	{
		return this.overflowtrafficcost;
	}
	
	public int getBaseTraffic()
	{
		return this.basetraffic;
	}


}