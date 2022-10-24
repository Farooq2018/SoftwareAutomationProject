package com.contact;

public class Contact {
	
	//attributes
	private String contactID;
	private String firstName;
	private String lastName;
	private long phoneNumber;
	private String address;
	
	
	public Contact(String contactID, String firstName, String lastName, long phoneNumber, String address) {
		
		if(!isValid(contactID, 10)) {
			throw new IllegalArgumentException("Contact ID is too long. Must be less 10 characters");	
		}
		
		if(!isValid(firstName, 10)) {
			throw new IllegalArgumentException("First Name is too long. Must be less 10 characters");
		}
		
		if(!isValid(lastName, 10)) {
			throw new IllegalArgumentException("Last Name is too long. Must be less 10 characters");
			
		}
		
		if(!isValid(address, 30)) {
			throw new IllegalArgumentException("Address is too long. Must be less 30 characters");
		}
		
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		
	}
	//Getters and Setters
	public String getContactID() {
		return contactID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		if(!isValid(firstName, 10)) {
			throw new IllegalArgumentException("First Name is too long. Must be less 10 characters");	
		}
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		if(!isValid(lastName, 10)) {
			throw new IllegalArgumentException("Last Name is too long. Must be less 10 characters");
		}
		this.lastName = lastName;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long number) {
		this.phoneNumber = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if(!isValid(address, 30)) {
			throw new IllegalArgumentException("Address is too long. Must be less 30 characters");
		}
		this.address = address;
	}
	
	//private method to verify value in not null and length of input
	private boolean isValid(String value, int valLength) {
		return (value != null) && (value.length() <= valLength);
		
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (contactID == null) {
			if (other.contactID != null)
				return false;
		} else if (!contactID.equals(other.contactID))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (phoneNumber != other.phoneNumber)
			return false;
		return true;
	}
	
	
}
