package automation.poc;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//@Test//(invocationCount = 2)
public class C1 {

	@Test(dataProvider="x")//(invocationCount = 2)
	public void testcaseC1(int a){
		
		System.out.println("Print Here");
		System.out.println(a);
	}
	
	static int i=0;
	C1()
	{ System.out.println(" in Constructor");
		System.out.println(i);
		i++;
		System.out.println(i);
	}
	
	@DataProvider(name="x")
	
	public Object[][] td()
	{
		Object[][] r={{C1.i},{C1.i+2}};
		return r;
	}
	
	
	
}
