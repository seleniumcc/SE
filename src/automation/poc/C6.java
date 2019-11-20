package automation.poc;

import org.testng.annotations.Test;
//@Test(groups="deploy")
public class C6 {

	@Test(dependsOnMethods = { "automation.poc.C5.testcaseC3" })
	public void testcaseC3(){
		
	}
	
}
