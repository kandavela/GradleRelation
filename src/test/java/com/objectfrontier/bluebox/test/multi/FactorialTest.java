package com.objectfrontier.bluebox.test.multi;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.objectfrontier.bluebox.service.multi.FactorialSolution;


public class FactorialTest {
	
	@Test(dataProvider = "dpFactorialValue")
	public void testFactorialValue(int input, int expected) {
		
		try {
			
			FactorialSolution fs = new FactorialSolution();
			int actual = fs.fact(input);
			Assert.assertEquals(actual, expected);
		} catch(Exception e) {
			System.out.println("Enter valid number");
		}
		
	}
	
	@DataProvider
	public Object[][] dpFactorialValue() {
		
		return new Object[][] {
			new Object[] { 5 , 120 }
		};
	}
}
