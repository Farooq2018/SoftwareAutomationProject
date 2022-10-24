package com.contact;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class ContactServiceTest {
	
	
	//Tests addContact method
	@Test
	@Tag("Testing addContact method")
	@RepeatedTest(2)
	void testContactServiceSuccess() {
		//Instantiate ContactService
		ContactService contactService = new ContactService();
		
		//Use addContact method to create Contact instance
		Contact contact1 = contactService.addContact("123456", "Bob", "Mike", 4802929112L, "1111 E Road Street");
		
		//assert if contact is no empty
		assertTrue(contact1 != null);
		//assert that contact id is equal to contact id that pass through constructor
		assertTrue(contact1.getContactID().equals("123456"));
	}
	
	//Tests updateContact method
	@Test
	@Tag("Testing updateContact method")
	void testContactServiceUpdate() {
		//Instantiate ContactService
		ContactService contactService = new ContactService();
		
		//Use addContact method to create Contact instance
		Contact contact2 = contactService.addContact("586974", "Lauren", "Gabriel", 48029209345L, "1010 West Shore Dr");
		
		//Use update contact method to update the current instance
		contact2 = contactService.updateContact("586974", "Frank", "Hustler", 5875248978L, "925 E Beltline St");
		assertTrue(contact2 != null);
		
		//Compare them to see if they have updated
		assertTrue(contact2.getFirstName().equals("Frank"));
		assertTrue(contact2.getLastName().equals("Hustler"));
		assertTrue(contact2.getPhoneNumber() == 5875248978L);
		assertTrue(contact2.getAddress().equals("925 E Beltline St"));
	}
	
	//Tests deleteContact method
	@Test
	@Tag("Testing deleteContact method")
	@RepeatedTest(2)
	void testContactServiceDelete() {
		//Instantiate ContactService
		ContactService contactService = new ContactService();
		//Use addContact method to create Contact instance
		Contact contact3 = contactService.addContact("335879", "Lauren", "Gabriel", 48029209345L, "1010 West Shore Dr");
		
		assertTrue(contact3 != null);
		//Check to see if the delete method is working or not
		assertTrue(contact3.equals(contactService.deleteContact("335879")));
	}

}
