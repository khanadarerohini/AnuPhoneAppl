package com.PhoneBook.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PhoneBook.model.contact;

@Repository
public interface ContactRepository extends JpaRepository<contact,Integer> {

 
	
	

}
