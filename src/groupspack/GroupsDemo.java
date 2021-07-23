package groupspack;

import org.testng.annotations.Test;

public class GroupsDemo {
	
	@Test(groups = {"Apple"})

	public void apple1Tests() {

	System.out.println("Apple1 tests");

	}

	@Test(groups = {"Apple"})

	public void apple2Tests() {

	System.out.println("Apple2 tests");

	}

	@Test(groups= {"samsung"})

	public void samsung() {

	System.out.println("Samsung");

	}

	@Test(groups= {"samsung"})

	public void samsung2Tests() {

	System.out.println("Samsung2");

	}

	@Test(groups= {"moto"})

	public void moto1Tests() {

	System.out.println("moto1 tests");

	}

	@Test(groups= {"moto"})

	public void moto2Tests() {

	System.out.println("moto2 tests");

	}

}
