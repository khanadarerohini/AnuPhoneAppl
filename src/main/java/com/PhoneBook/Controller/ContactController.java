package com.PhoneBook.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.PhoneBook.model.contact;
import com.PhoneBook.service.ContactServiceI;

@RestController
public class ContactController {
	
	@Autowired
	public ContactServiceI contactServiceI;
	
	public ResponseEntity<String> SaveContact (contact Contact) {
		
		boolean saveContact = contactServiceI.SaveContact(Contact); //Referance contactService
		 if(saveContact== true) {
			 
			 String message="Conact Save Succsefull";
			 return new ResponseEntity<String>(message,HttpStatus.OK);
			 
		 }
		
		 String message="Conact Save Succsefull";
		return new ResponseEntity<String>(message,HttpStatus.BAD_REQUEST);
	}
	

}
