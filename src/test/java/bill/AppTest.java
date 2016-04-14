package bill;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest{
	  
	private Plan gp, sp;
	private Cost c;

	@Before
	public void setUp(){
		c = new Cost(null, 0, 0);
		gp = new GoldPlan();
		sp = new SilverPlan();
	}
	
	
	@Test
	public void testGoldPlanSetting() {
		
		gp.setBasecost(50);
		gp.setAddLineCost(15);
		gp.setOverflowTrafficCost(0.5);
		gp.setBaseTraffic(1100);
		
		assertTrue(50 == gp.getBasecost());
		assertTrue(15 == gp.getAddLineCost());
		assertTrue(0.5 ==gp.getOverflowTrafficCost());
		assertTrue(1100 == gp.getBaseTraffic());
			
	}
	
	@Test
	public void testSilverPlanSetting() {
		sp.setBasecost(30);
		sp.setAddLineCost(22);
		sp.setOverflowTrafficCost(0.6);
		sp.setBaseTraffic(550);
		
		assertTrue(30 == sp.getBasecost());
		assertTrue(22 == sp.getAddLineCost());
		assertTrue(0.6 == sp.getOverflowTrafficCost());
		assertTrue(550 == sp.getBaseTraffic());
			
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
