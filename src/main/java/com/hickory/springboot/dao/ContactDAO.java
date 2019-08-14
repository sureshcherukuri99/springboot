package com.hickory.springboot.dao;





import org.springframework.data.repository.CrudRepository;

import com.hickory.springboot.model.Contact;


 
/**
 * Defines DAO operations for the contact model.
 */
public interface ContactDAO extends CrudRepository<Contact, Integer>{
     
    
}