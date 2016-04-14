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
	
	@Override
	public double getBasecost()
	{
		return this.basecost;
	}
	
	@Override
	public double getAddLineCost()
	{
		return this.addlinecost;
	}
	
	@Override
	public double getOverflowTrafficCost()
	{
		return this.overflowtrafficcost;
	}
	
	@Override
	public int getBaseTraffic()
	{
		return this.basetraffic;
	}
	
	@Override
	public String getGrade() {
		return this.grade;
	}


}