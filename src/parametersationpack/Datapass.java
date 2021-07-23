package parametersationpack;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Datapass {
	
	@Test

	@Parameters("datapass")

	public void nameOfMan(String name) {

	System.out.println("Name is: "+name);

	}

}
