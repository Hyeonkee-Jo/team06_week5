package bill;

public interface Plan {
	
	public void setBasecost(double basecost);
	public double getBasecost();
	public void setBaseTraffic(int basetraffic);
	public int getBaseTraffic();
	public void setAddLineCost(double addlinecost);	
	public double getAddLineCost();
	public void setOverflowTrafficCost(double overflowtrafficcost);
	public double getOverflowTrafficCost();
	
}