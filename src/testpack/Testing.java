package testpack;

import org.testng.ITestListener;
import org.testng.annotations.Test;

public class Testing implements ITestListener {
	
	@Test
	public void Sample() {
		
		System.out.println("Calling");
	}
	
	

}
