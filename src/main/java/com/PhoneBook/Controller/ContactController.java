package com.PhoneBook.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PhoneBook.model.contact;
import com.PhoneBook.service.ContactServiceI;

@RestController
public class ContactController {
	
	
	@Autowired
	public ContactServiceI contactServiceI;
	
	
	@PostMapping(value="/saveContact",consumes="application/json")
	public ResponseEntity<String> saveContact(@RequestBody contact Contact)
	{
		boolean saveContact = contactServiceI.saveContact(Contact);
		if(saveContact==true)
		{
			String msg="Contact saved sucessfully";
			return new ResponseEntity<String>(msg,HttpStatus.OK);
					
		}
		else
		{
			String msg="Contact  not saved ";
			return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);
			
		}
	}
	
//	@PostMapping(value="/SaveContact", consumes="Application/json",produces="Application/json") //**consumes&produces are always in small
//	public ResponseEntity<String> SaveContact (contact Contact) {
//		boolean saveContact = contactServiceI.SaveContact(Contact); //Referance contactService
//		 if(saveContact== true) {
//			 
//			 String message="Conact Save Succsefull";
//			 return new ResponseEntity<String>(message,HttpStatus.OK);
//			 }
//		 String message="Conact Save Succsefull";
//		return new ResponseEntity<String>(message,HttpStatus.BAD_REQUEST);
//	}
	
	@GetMapping(value="/getAllContact",produces="application/json")	
	public ResponseEntity<List<contact>> getallContact(){
		List<contact> getallContact = contactServiceI.getallContact();
		
		if(getallContact!=null) {
			
			return new ResponseEntity<List<contact>> (getallContact, HttpStatus.OK);
		}
		
		String mesg="Data not found";
		return new ResponseEntity (mesg,HttpStatus.BAD_REQUEST); // (List not convert into String in OutPut)so Here "ResponseEntity" type not taking
		
	}
	
	@GetMapping(value="/getContactById/{contactId}",produces="application/json")
	public  ResponseEntity<contact> getById( @PathVariable Integer contactId){
		contact contactById = contactServiceI.getContactById(contactId);
		
		return new ResponseEntity<contact>(contactById,HttpStatus.OK);
		
	}
	
	@PutMapping(value="/updateContact",produces="application/String") // for Update Used @PutMapping
	public ResponseEntity<String> updateContact(@RequestBody contact Contact)
	{
		boolean updateContact = contactServiceI.updateContact(Contact);
		if(updateContact!=false)
		{
			String msg="Contact updated Sucessfully";
			return new ResponseEntity<String>(msg,HttpStatus.OK);
		}
		else
		{
		String msg="Contact not updated Sucessfully";
		return new ResponseEntity<String>(msg,HttpStatus.BAD_REQUEST);
		}
	}
	
	@DeleteMapping(value="/deleteByIdHard/{contactId}")//@DeleteMapping USed
	public ResponseEntity<String> deleteByIdHard(@PathVariable Integer contactId)
	{
		boolean deleteByIdHard = contactServiceI.deleteByIdHard(contactId);
		if(deleteByIdHard)
		{
		return new ResponseEntity<String>("Record deleted Sucessfully",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("Record not deleted Sucessfully",HttpStatus.OK);
		}
	}
	
	@DeleteMapping(value="/deleteByIdsoft/{contactId}")
	public ResponseEntity<String> deleteByIdSoft(@PathVariable Integer contactId)
	{
		boolean deleteByIdsoft = contactServiceI.deleteByIdSoft(contactId);
		if(deleteByIdsoft)
		{
		return new ResponseEntity<String>("Record deleted Sucessfully",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("Record not deleted Sucessfully",HttpStatus.OK);
		}
	}
	
	
	
	
	
	
	

}
