package com.contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


class ContactTest {
	

	@Test
	void testCreateContactSuccess() {
		Contact contact = new Contact("123456", "Bob", "Mike", 4802929112L, "1111 E Road Street");
		
		assertTrue(contact != null);
		assertTrue(contact.getContactID().equals("123456"));
	}
	
	
	@Test
	@Tag("Test if user/system inputs more than 10 characters Contact ID")
	void testContactIDTooLong() {
		assertThrows(IllegalArgumentException.class, () -> {
			new Contact("5698755815482185", "Laura", "Brandon", 9724583659L, "825 Miller Rd");
		});
	}
	
	@Test
	@Tag("Test if user/system inputs more than 10 characters First Name")
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("569875", "Laura William", "Brandon", 9724583659L, "825 Miller Rd");
		});
	}
	
	@Test
	@Tag("Test if user/system inputs more than 10 characters Last Name")
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("569875", "Laura", "Brandon Williams", 9724583659L, "825 Miller Rd");
		});
	}
	
	@Test
	@Tag("Test if the user enters a long address. More than 30 characters")
	void contactAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("569875", "Laura", "Brandon", 9724583659L, "825 Miller Rd, Dallas Texas 75243");
		});
	}
	
	@Test
	@Tag("Test setFirstName method")
	void testContactSetFirstName(){
		Contact contact = new Contact("569875", "Laura", "Brandon", 9724583659L, "825 Miller Rd");
		contact.setFirstName("Betty");
		assertEquals("Betty", contact.getFirstName());
	}
	@Test
	@Tag("Test setLastName method")
	void testContactSetLastName(){
		Contact contact = new Contact("569875", "Laura", "Brandon", 9724583659L, "825 Miller Rd");
		contact.setLastName("Nancy");
		assertEquals("Nancy", contact.getLastName());
	}
	@Test
	@Tag("Test setAddress method")
	void testTaskSetDescription(){
		Contact contact = new Contact("569875", "Laura", "Brandon", 9724583659L, "825 Miller Rd");
		contact.setAddress("333 MacDonald Ave");
		assertEquals("333 MacDonald Ave", contact.getAddress());
	}
	
	@Test
	@Tag("Test if the user enters a long first name in the setFirstName method")
	void testSetFirstName() {
		Contact contact = new Contact("569875", "Laura", "Brandon", 9724583659L, "825 Miller Rd");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setFirstName("Lauren Williams");
		});
	}
	@Test
	@Tag("Test if the user enters a long last name in the setLastName method")
	void testSetLastName() {
		Contact contact = new Contact("569875", "Laura", "Brandon", 9724583659L, "825 Miller Rd");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setLastName("Brandon Williams");
		});
	}
	
	@Test
	@Tag("Test if the user enters a long address in the setAddress method")
	void testSetAddress() {
		Contact contact = new Contact("569875", "Laura", "Brandon", 9724583659L, "825 Miller Rd");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			contact.setAddress("825 Miller Rd, Dallas Texas 75243");
		});
	}
	
	@Test
	@Tag("Test set and get method for phone number")
	void testSetPhoneNumber() {
		Contact contact = new Contact("569875", "Laura", "Brandon", 9724583659L, "825 Miller Rd");
		contact.setPhoneNumber(4692548796L);
		assertEquals(4692548796L, contact.getPhoneNumber());
	}
	@Test
	@Tag("Test equals method")
	void testContactEquals(){
		Contact contact1 = new Contact("569875", "Laura", "Brandon", 9724583659L, "825 Miller Rd");
		Contact contact2 = new Contact("569875", "Laura", "Brandon", 9724583659L, "825 Miller Rd");
		assertTrue(contact1.equals(contact2));
	}
}
