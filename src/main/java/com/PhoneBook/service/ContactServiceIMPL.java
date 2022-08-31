package com.PhoneBook.service;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PhoneBook.Repository.ContactRepository;
import com.PhoneBook.model.contact;

@Service
public class ContactServiceIMPL implements ContactServiceI {

	
	@Autowired
	public ContactRepository contactRepository;
	
	@Override
	public boolean SaveContact(contact Contact) {
		
		
		contact save = contactRepository.save(Contact); //hi "save" Repositorichi Asate
		
		if(save!= null)
		{
		  return true;	
		}else
		return false;
	}

	//@Override
	//public void getContactById(Integer id) {
		// TODO Auto-generated method stub
		
	//}

//	@Override
	//public List<contact> getallContact() { //getAllContact he aaplyla list madhe....
//		 
	//	List<contact> saveList = contactRepository.findAll(); //getAll sathi "findAll" Method (Small letter)
		                   //List madhe milel & "saveList" madhe save hoil..
	//	 Stream<contact> stream = saveList.stream();
	//	                 stream.filter(contact -> contact.getActiveSwitch() =='Y');
		         
	       
	//	return saveList;
	//}
	
	

}
