package edu.umb.cs680.hw03;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StudentTest {

	Student inStateStudent = Student.createInStateStudent("Sahana", "New York");
	Student outStateStudent = Student.createOutStateStudent("Sahana1", "Dorchester", 10,"MA");
	Student intlStudent = Student.createIntlStudent("Sahana2", "Andra", 001223, "India");

	

	@Test
	void testGetI20() {
		assertEquals(0, inStateStudent.getI20());
		assertEquals(0, outStateStudent.getI20());
		assertEquals(001223, intlStudent.getI20());
		
	}
	
	@Test
	void testGetName() {
		assertEquals("Sahana", inStateStudent.getName());
		assertEquals("Sahana1", outStateStudent.getName());
		assertEquals("Sahana2", intlStudent.getName());
	}



	@Test
	void testGetYearsInState() {
		assertEquals(0, inStateStudent.getYearsInState());
		assertEquals(10, outStateStudent.getYearsInState());
		assertEquals(0, intlStudent.getYearsInState());
	}

	@Test
	void testGetState() {
		assertNull(inStateStudent.getState());
		assertEquals("MA",outStateStudent.getState());
		assertNull(intlStudent.getState());
	}  
	
	@Test
	void testGetUsAddress() {
		assertEquals("New York", inStateStudent.getUsAddress());
		assertEquals("Dorchester", outStateStudent.getUsAddress());
		assertEquals("Andra", intlStudent.getUsAddress());
	}

	@Test
	void testGetForeignAddress() {
		assertNull(inStateStudent.getForeignAddress());
		assertNull(outStateStudent.getForeignAddress());
		assertEquals("India", intlStudent.getForeignAddress());
	}
	@Test
	void testCreateInStateStudentName() {
		String name = "Sahana";
		assertEquals(name, inStateStudent.getName());
	}
	
	@Test
	void testCreateInStateStudentTuition() {
		float actual = inStateStudent.getTuition(); 
		float expected = 9000;
		assertEquals(expected, actual);
	}
	
	@Test
	void testCreateOutStateStudentAddress() {
		String address = "Dorchester";
		assertEquals(address, outStateStudent.getUsAddress());
	}
	
	@Test
	void testCreateOutStateStudentYearsInState() {
		int expected = 10;
		assertEquals(expected, outStateStudent.getYearsInState());
	}
	
	@Test
	void testCreateOutStateStudentState() {
		String expected = "MA";
		assertEquals(expected, outStateStudent.getState());
	}
	
	@Test
	void testCreateOutStateStudentTuition() {
		float actual = outStateStudent.getTuition(); 
		float expected = 12000;
		assertEquals(expected, actual);
	
	}   
	
	@Test
	void testCreateIntlStudentForeignAddress() {
		String address = "India";
		assertEquals(address, intlStudent.getForeignAddress());
	}
	
	@Test
	void testCreateIntlStudentTuition() {
		float actual = intlStudent.getTuition(); 
		float expected = 28000;
		assertEquals(expected, actual);
	}
	

}
