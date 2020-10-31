package edu.umb.cs680.hw01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeGeneratorTest {

	 @Test
	 public void primes() {
	       PrimeGenerator primeGenerator = new PrimeGenerator(1, 10);
	       primeGenerator.generatePrimes();
	       Long[] expectedprimes = { 2L, 3L, 5L, 7L };
	       assertArrayEquals(expectedprimes, primeGenerator.getPrimes().toArray());
	 }

	 @Test
	 public void primesRangeStartNotOne() {
	       PrimeGenerator primeGenerator = new PrimeGenerator(10, 30);
	       primeGenerator.generatePrimes();
	       Long[] expectedprimes = { 11L, 13L, 17L, 19L, 23L, 29L};
	       assertArrayEquals(expectedprimes, primeGenerator.getPrimes().toArray());
	 }

	 @Test
	 public void primesRangeStartIsAPrime() {
	       PrimeGenerator primeGenerator = new PrimeGenerator(11, 30);
	       primeGenerator.generatePrimes();
	       Long[] expectedprimes = { 11L, 13L, 17L, 19L, 23L, 29L};
	       assertArrayEquals(expectedprimes, primeGenerator.getPrimes().toArray());
	 }

	 @Test
	 public void primesRangeEndIsAPrime() {
	       PrimeGenerator primeGenerator = new PrimeGenerator(11, 30);
	       primeGenerator.generatePrimes();
	       Long[] expectedprimes = { 11L, 13L, 17L, 19L, 23L, 29L};
	       assertArrayEquals(expectedprimes, primeGenerator.getPrimes().toArray());
	 }

	 @Test
	 public void noPrimes() {
	       PrimeGenerator primeGenerator = new PrimeGenerator(14, 16);
	       primeGenerator.generatePrimes();
	       assertEquals(primeGenerator.getPrimes().size(), 0);
	 }

     @Test
	 public void invalidInputRangeStartGreaterThanRangeEnd() {
	       try {
	            PrimeGenerator primeGenerator = new PrimeGenerator(10, 1);
	            primeGenerator.generatePrimes();
	       } catch (RuntimeException ex) {
	            assertEquals("Wrong input values: from=10 to=1", ex.getMessage());
	         }
	    }

	    @Test
	    public void invalidInputRangeStartNegativeNumber() {
	        try {
	            PrimeGenerator primeGenerator = new PrimeGenerator(-10, 1);
	            primeGenerator.generatePrimes();
	        } catch (RuntimeException ex) {
	            assertEquals("Wrong input values: from=-10 to=1", ex.getMessage());
	        }
	    }

	    @Test
	    public void invalidInputRangeEndNegativeNumber() {
	        try {
	            PrimeGenerator primeGenerator = new PrimeGenerator(10, -1);
	            primeGenerator.generatePrimes();
	        } catch (RuntimeException ex) {
	            assertEquals("Wrong input values: from=10 to=-1", ex.getMessage());
	        }
	    }

	    @Test
	    public void invalidInputBothRangeStartAndEndNegativeNumbers() {
	        try {
	            PrimeGenerator primeGenerator = new PrimeGenerator(-10, -1);
	            primeGenerator.generatePrimes();
	        } catch (RuntimeException ex) {
	            assertEquals("Wrong input values: from=-10 to=-1", ex.getMessage());
	        }
	    }

	    @Test
	    public void invalidInputRangeStartZero() {
	        try {
	            PrimeGenerator primeGenerator = new PrimeGenerator(0, 10);
	            primeGenerator.generatePrimes();
	        } catch (RuntimeException ex) {
	            assertEquals("Wrong input values: from=0 to=10", ex.getMessage());
	        }
	    }

	    @Test
	    public void invalidInputRangeEndZero() {
	        try {
	            PrimeGenerator primeGenerator = new PrimeGenerator(10, 0);
	            primeGenerator.generatePrimes();
	        } catch (RuntimeException ex) {
	            assertEquals("Wrong input values: from=10 to=0", ex.getMessage());
	        }
	    }

	    @Test
	    public void invalidInputBothRangeStartAndEndZeroes() {
	        try {
	            PrimeGenerator primeGenerator = new PrimeGenerator(0, 0);
	            primeGenerator.generatePrimes();
	        } catch (RuntimeException ex) {
	            assertEquals("Wrong input values: from=0 to=0", ex.getMessage());
	        }
	    }

	    @Test
	    public void invalidInputBothRangeStartAndEndAreEqual() {
	        try {
	            PrimeGenerator primeGenerator = new PrimeGenerator(10, 10);
	            primeGenerator.generatePrimes();
	        } catch (RuntimeException ex) {
	            assertEquals("Wrong input values: from=10 to=10", ex.getMessage());
	        }
	    }

	    @Test
	    public void invalidInputBothRangeStartAndEndAreNegativeEqualValues() {
	        try {
	            PrimeGenerator primeGenerator = new PrimeGenerator(-10, -10);
	            primeGenerator.generatePrimes();
	        } catch (RuntimeException ex) {
	            assertEquals("Wrong input values: from=-10 to=-10", ex.getMessage());
	        }
	    }

}
