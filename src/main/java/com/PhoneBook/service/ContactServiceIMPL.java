package com.PhoneBook.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.PhoneBook.Repository.ContactRepository;
import com.PhoneBook.model.contact;

@Service
public class ContactServiceIMPL implements ContactServiceI {

	
	@Autowired
	public ContactRepository contactRepository;

	@Override
	public boolean saveContact(contact Contact) 
	{
		contact save = contactRepository.save(Contact);
		if(save!=null)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
//	@Override
//	public boolean SaveContact(contact Contact) {
//		
//		
//		contact save = contactRepository.save(Contact); //hi "save" Repositorichi Asate
//		
//		if(save!= null)
//		{
//		  return true;	
//		}else
//		return false;
//	}

	
	@Override
	public List<contact> getallContact() { //getAllContact he aaplyla list madhe....
		 
		List<contact> saveList = contactRepository.findAll(); //getAll sathi "findAll" Method (Small letter)
		                   //List madhe milel & "saveList" madhe save hoil..
		 
		         return saveList;
	}



     @Override
     public contact getContactById(Integer contactId) {
		contact contactGet = contactRepository.findById(contactId).get();
		return contactGet;
	}
     
     @Override
 	public boolean updateContact(contact Contact) 
 	{
 		contact save = contactRepository.save(Contact);
 		if(save!=null)
 		{
 			return true;
 		}
 		else
 		{
 			
 			return false;
 		}
 		
 		
 	}


     @Override
 	public boolean deleteByIdHard(Integer contactId) 
 	{
 		boolean existsById = contactRepository.existsById(contactId);
 		if(existsById)
 		{
 			contactRepository.deleteById(contactId);
 			return true;
 		}
 		else
 		{
 			return false;
 		}
 		
 	}


     @Override
 	public boolean deleteByIdSoft(Integer contactId) //**
 	{
 		Optional<contact> findById = contactRepository.findById(contactId);
 		if(findById.isPresent())
 		{
 			contact Contact = findById.get();
 			Contact.setActiveSwitch('N');
 			contactRepository.save(Contact);
 			return true;
 		}
 		else
 		{
 		return false;
 	}
 	}

     

	


	
	
	

}
