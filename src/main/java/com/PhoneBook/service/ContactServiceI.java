package com.PhoneBook.service;

import java.util.List;

import com.PhoneBook.model.contact;

public interface ContactServiceI {
	
	//boolean SaveContact(contact Contact); //SAveContact to userdefine Asto but 
	                                  //Repository madhe just "save"
	boolean saveContact(contact Contact);
	
	List<contact> getallContact(); //hi UserDefine always
	
	contact getContactById(Integer contactId); //Get contact Aaplyla contact madhe millel

	boolean updateContact(contact Contact);
	
	 boolean deleteByIdHard(Integer contactId);
	 
	 boolean deleteByIdSoft(Integer contactId);
	
}
