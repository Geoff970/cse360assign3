package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testCalculator() {
		Calculator calc = new Calculator();
		
		assertNotNull(calc);
	}
	
	@Test
	public void testGetTotal() {
		Calculator calc = new Calculator();
		
		assertEquals(calc.getTotal(), 0);
	}
	
	@Test
	public void testAddEmpty() {
		Calculator calc = new Calculator();
		calc.add(3);
		
		assertEquals(calc.getTotal(), 3);
	}
	
	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		calc.add(3);
		calc.add(5);
		
		assertEquals(calc.getTotal(), 8);
	}

	@Test
	public void testSubtractEmpty() {
		Calculator calc = new Calculator();
		calc.subtract(2);
		
		assertEquals(calc.getTotal(), -2);
	}
	
	@Test
	public void testSubtract() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.subtract(2);
		
		assertEquals(calc.getTotal(), 8);
	}
	
	@Test
	public void testMultiplyEmpty() {
		Calculator calc = new Calculator();
		calc.multiply(3);
		
		assertEquals(calc.getTotal(), 0);
	}
	
	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.multiply(3);
		
		assertEquals(calc.getTotal(), 30);
	}
	
	
	@Test
	public void testDivideEmpty() {
		Calculator calc = new Calculator();
		calc.divide(10);
		
		assertEquals(calc.getTotal(), 0);
	}
	
	public void testDivide() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.divide(10);
		
		assertEquals(calc.getTotal(), 1);
	}
	
	public void testDivideRemainder() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.divide(8);
		
		assertEquals(calc.getTotal(), 1);
	}
	
	public void testDivideByZero() {
		Calculator calc = new Calculator();
		calc.add(10);
		calc.divide(0);
		
		assertEquals(calc.getTotal(), 0);
	}
	
	@Test
	public void testGetHistory() {
		Calculator calc = new Calculator();
		calc.add(7);
		calc.subtract(9);
		calc.multiply(4);
		calc.divide(8);
		
		assertEquals(calc.getHistory(), "0 + 7 - 9 * 4 / 8");
	}
}
