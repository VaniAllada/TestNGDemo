package testpack;

import org.testng.annotations.Test;

public class PrioritiseTestcases {
	
	@Test(priority=0)

	public void startTheGear() {

	System.out.println("Start the Car");

	}

	// @Test(priority=1, dependsOnMethods = "startTheGear") // priority and dependency method

	// public void firstGear() {

	// System.out.println("TestCase1 : Put First Gear");

	// }

	//

	// @Test(priority=2)

	// public void secondGear() {

	// System.out.println("Testcase 2: Put Second Gear");

	// }

	//

	// @Test(priority=3)

	// public void thirdGear() {

	// System.out.println("Testcase 3: Put Third Gear");

	// }

	//

	// @Test(priority=4)

	// public void fourthGear() {

	// System.out.println("TestCase 4: put Forth Gear");

	// }

	//

	// @Test(priority=5,enabled=false)

	// public void musicON() {

	// System.out.println("Music ON");

	// }

	//

}
