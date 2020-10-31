package edu.umb.cs680.HW2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class CalculatorTest {

	 @Test
	    public void multiply3And4() {
	        Calculator calculator = new Calculator();
	        float expected = 12;
	        float actual = calculator.multiply(3, 4);
	        assertEquals(actual, expected);
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
	    public void divide4By2() {
	        Calculator calculator = new Calculator();
	        float expected = 2;
	        float actual = calculator.divide(4, 2);
	        assertEquals(actual, expected);
	    }

	    @Test
	    public void divide5by0ExceptionThrown()  {
	        Calculator calculator = new Calculator();
	        try {
	            calculator.divide(5,0);
	            fail("Division by zero");
	        } catch (IllegalArgumentException ex) {
	            assertEquals("Division by zero",ex.getMessage());
	          }
	    }
}
