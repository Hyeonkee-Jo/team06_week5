package bill;


public class GoldPlan implements Plan{
	
	double basecost;
	String grade;
	double addlinecost;
	double overflowtrafficcost;
	int basetraffic;
	
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