package automation.poc;

import org.testng.annotations.Test;
//@Test(groups="deploy")
public class C4 {

	@Test(dependsOnMethods = { "automation.poc.C3.testcaseC3" })
	public void testcaseC3(){
		
	}
	
}
