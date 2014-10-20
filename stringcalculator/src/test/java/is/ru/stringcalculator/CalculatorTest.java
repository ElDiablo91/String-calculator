package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) 
	{
     		 org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    	}

	@Test //1.
	public void testEmptyString() {
		assertEquals(0, Calculator.add(""));
	}

	@Test //2.
	public void testOneNumber() {
		assertEquals(1, Calculator.add("1"));
	}

	@Test //3.
	public void testTwoNumbers() {
		assertEquals(3, Calculator.add("1,2"));
	}	

	@Test //4.
   	 public void testMultipleNumbers(){
		//testing 123
    		assertEquals(6, Calculator.add("1,2,3"));
   	}
	
	@Test //5.
	public void testMultipleNumbers2(){
		assertEquals(8, Calculator.add("2,2,2,2"));
	}

//	@Test
//	public void testForOneNumberAndNewline(){
//		assertEquals(10, Calculator.add("2\n"));
//	}

	@Test //6.
	public void TestMultipleNumbersAndNewline(){
		assertEquals(3, Calculator.add("1\n2"));
	}

	@Test //7.
	public void TestMultipleNumberWithNewAndKomma()
	{		
		assertEquals(10, Calculator.add("2,2\n2,2\n2"));
	}

	@Test //8.
	public void TestDeliminatorIndecation()
	{
		assertEquals(11, Calculator.add("//;ab"));
//		assertEquals(11, Calculator.add("//stuff;"));
	}
}
