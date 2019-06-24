package cg;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	static Calculator ob;
	
	@BeforeAll  //junit4 @BeforeClass
	public static void beforeAllTests()
	{
		System.out.println("Before all tests");
		ob=new Calculator();
	}
	
	@AfterAll // junit4 AfterClass
	public static void AfterAllTests()
	{
		System.out.println("After all tests");
		ob=null;
	}
	
	@BeforeEach //junit4 @Before
	public void beforeEachTest()
	{
		System.out.println("Before Each Test");
		ob=new Calculator();
	}
	
	@AfterEach// junit4 @After
	public void afterEachTest()
	{
		System.out.println("After Each Test");
		ob=null;
	}
	
	@RepeatedTest(3)
	//@Test
	void testadd() {
		System.out.println("test case testadd");
	//	calculator ob=new calculator();
		assertEquals(9,ob.add(4,5));
	}
	@Test
	void testadd1() {
		System.out.println("test case testadd1");
	//	calculator ob=new calculator();
		assertTrue(ob.add(4,5)>0);
		assertTrue(ob.add(4,-5)>=0);
		assertTrue(ob.add(-4,5)==0);
	}
	@Disabled
	@Test
		void testadd2()
		{
		System.out.println("test case testadd2");
		assertTrue(ob.idgeneration()>0);

		}
		
	}