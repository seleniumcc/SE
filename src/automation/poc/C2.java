package automation.poc;

import org.testng.Assert;
import org.testng.annotations.Test;
//@Test(groups="deploy")
public class C2 {

	@Test(dependsOnMethods = { "automation.poc.C1.testcaseC1" })
	public void testcaseC2(){
		
		Assert.fail();
		
	}
	
}
