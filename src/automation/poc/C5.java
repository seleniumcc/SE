package automation.poc;

import org.testng.annotations.Test;
//@Test(groups="deploy")
public class C5 {

	@Test(dependsOnMethods = { "automation.poc.C4.testcaseC3","automation.poc.C41.testcaseC3" })
	public void testcaseC3(){
		
	}
	
}
