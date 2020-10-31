package edu.umb.cs680.hw01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	 @Test
	 public void multiply2And4() {
		 Calculator calculator = new Calculator();
	     float expected = 8;
	     float actual = calculator.multiply(2, 4);
	     assertEquals(actual, expected);
	 }
	 
	 @Test
	 public void multiply5AndMinus2() {
	     Calculator calculator = new Calculator();
	     float expected = 10;
	     float actual = calculator.multiply(5, -2);
	     assertNotEquals(actual, expected);
	 }
	 
	 @Test
	 public void multiplyMinus5AndMinus2() {
	     Calculator calculator = new Calculator();
	     float expected = 10;
	     float actual = calculator.multiply(-5, -2);
	     assertEquals(actual, expected);
	 }
	    
	 @Test
	 public void multiplyMinus5AndPositive2() {
	     Calculator calculator = new Calculator();
	     float expected = -10;
	     float actual = calculator.multiply(-5, 2);
	     assertEquals(actual, expected);
	 }
	 
	 @Test
	 public void multiplyMinus4AndMinus2() {
	     Calculator calculator = new Calculator();
	     float expected = 8;
	     float actual = calculator.multiply(-4, -2);
	     assertEquals(actual, expected);
	 }

	 @Test
	 public void divide4By2() {
	     Calculator calculator = new Calculator();
	     float expected = 2;
	     float actual = calculator.divide(4, 2);
	     assertEquals(actual, expected);
	 }

	 @Test
	 public void divide2by0ExceptionThrown()  {
	      Calculator calculator = new Calculator();
	        try {
	            calculator.divide(2,0);
	            fail("Division by zero");
	        } catch (IllegalArgumentException ex) {
	            assertEquals("Division by zero",ex.getMessage());
	          }
	    }
}
