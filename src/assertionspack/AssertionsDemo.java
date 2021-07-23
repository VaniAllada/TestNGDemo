package assertionspack;

import org.testng.Assert;

public class AssertionsDemo {
	
	String name="Durga";

	boolean flag = true;

	public void checkCondition() {

	Assert.assertEquals(name, "Durga");

	Assert.assertNotEquals(name, "Bhavani");

	Assert.assertTrue(flag, "good");

	Assert.assertFalse(flag);
	
	}
}
