package bill;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{
	  
	private Plan gp;
	private Plan sp;
	private Cost c;

	@Before
	public void setUp(){
		c = new Cost(null, 0, 0);
		gp = new GoldPlan();
		sp = new SilverPlan();
	}
	
	
	@Test
	public void testGoldPlanSetBaseCost() {
		
		gp.setBasecost(50);
		assertEquals(50.00, gp.getBasecost(), 0.01);
	}
	
	@Test
	public void testGoldPlanSetAddLineCost(){
		gp.setAddLineCost(15);
		assertEquals(15.00, gp.getAddLineCost(), 0.01);
	}
	
	@Test
	public void testGoldPlanSetOverflowTrafficCost() {
		gp.setOverflowTrafficCost(0.5);
		assertEquals(0.5, gp.getOverflowTrafficCost(), 0.1);
		
	}
	
	@Test
	public void testGoldPlanSetBaseTraffic() {
		gp.setBaseTraffic(1100);
		assertEquals(1100, gp.getBaseTraffic());
		
	}
	
	@Test
	public void testSilverPlanSetBaseCost() {
		sp.setBasecost(30);
		assertEquals(30.00, sp.getBasecost(), 0.01);
	}
	
	@Test
	public void testSilverPlanSetAddLineCost(){
		sp.setAddLineCost(22);
		assertEquals(22.00, sp.getAddLineCost(), 0.01);
	}
	
	@Test
	public void testSilverPlanSetOverflowTrafficCost() {
		sp.setOverflowTrafficCost(0.6);
		assertEquals(0.6, sp.getOverflowTrafficCost(), 0.1);
	}
	
	@Test
	public void testSilverPlanSetBaseTraffic() {
		sp.setBaseTraffic(550);
		assertEquals(550, sp.getBaseTraffic());
	}
	
	@Test
	public void testDefaultCostclass() {
		c = new Cost();
		assertEquals("29.95$", c.toString());
	}
	
	@Test
	public void testGoldSetGrade() {
		gp.setGrade("GOLD");
		assertEquals("GOLD", gp.getGrade());
	}
	
	@Test
	public void testGoldlineOverflowTrafficCost() {
		c = new Cost("G", 1200, 2);
		assertEquals("90.0$", c.printCalculateOverflowTrafficCost());
	}
	
	@Test
	public void testGoldlineAddlineCost() {
		c = new Cost("G", 1200, 4);
		assertEquals("34.0$", c.printCalculateAddlineCost());
	}
	
	@Test
	public void testSilverlineOverflowTrafficCost() {
		c = new Cost("S", 700, 2);
		assertEquals("108.0$", c.printCalculateOverflowTrafficCost());
	}
	
	@Test
	public void testSilverlineAddlineCost() {
		c = new Cost("S", 700, 4);
		assertEquals("48.0$", c.printCalculateAddlineCost());
	}
	
	@Test
	public void testGoldOnelineBelowThau() {
		c = new Cost("G", 700, 1);
		assertEquals("49.95$", c.toString());
	}
	
	@Test
	public void testGoldTwolineBelowThau() {
		c = new Cost("G", 700, 2);
		assertEquals("64.45$", c.toString());
	}
	
	@Test
	public void testGoldThreelineBelowThau() {
		c = new Cost("G", 700, 3);
		assertEquals("78.95$", c.toString());
	}
	
	@Test
	public void testGoldOverThreelineBelowThau() {
		c = new Cost("G", 700, 4);
		assertEquals("83.95$", c.toString());
	}
	
	@Test
	public void testGoldOnelineOverThau() {
		c = new Cost("G", 1200, 1);
		assertEquals("139.95$", c.toString());
	}
	
	@Test
	public void testGoldTwolineOverThau() {
		c = new Cost("G", 1200, 2);
		assertEquals("154.45$", c.toString());
	}
	
	@Test
	public void testGoldThreelineOverThau() {
		c = new Cost("G", 1200, 3);
		assertEquals("168.95$", c.toString());
	}
	
	@Test
	public void testGoldOverThreelineOverThau() {
		c = new Cost("G", 1200, 4);
		assertEquals("173.95$", c.toString());
	}
	
	@Test
	public void testSilverSetGrade() {
		sp.setGrade("SILVer");
		assertEquals("SILVer", sp.getGrade());
	}
	
	@Test
	public void testSilverOnelineBelowFiveHund() {
		c = new Cost("S", 400, 1);
		assertEquals("29.95$", c.toString());
	}
	
	@Test
	public void testSilverTwolineBelowFiveHund() {
		c = new Cost("S", 400, 2);
		assertEquals("51.45$", c.toString());
	}
	
	@Test
	public void testSilverThreelineBelowFiveHund() {
		c = new Cost("S", 400, 3);
		assertEquals("72.95$", c.toString());
	}
	
	@Test
	public void testSilverOverThreelineBelowFiveHund() {
		c = new Cost("S", 400, 4);
		assertEquals("77.95$", c.toString());
	}
	
	@Test
	public void testSilverOnelineOverFiveHund() {
		c = new Cost("S", 700, 1);
		assertEquals("137.95$", c.toString());
	}
	
	@Test
	public void testSilverTwolineOverFiveHund() {
		c = new Cost("S", 700, 2);
		assertEquals("159.45$", c.toString());
	}
	
	@Test
	public void testSilverThreelineOverFiveHund() {
		c = new Cost("S", 700, 3);
		assertEquals("180.95$", c.toString());
	}
	
	@Test
	public void testSilverOverThreelineOverFiveHund() {
		c= new Cost("S", 700, 4);
		assertEquals("185.95$", c.toString());
	}
}
