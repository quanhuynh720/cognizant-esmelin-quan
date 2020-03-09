package com.cognizant.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cognizant.model.Person;


@Repository
@Transactional
public interface PersonDao extends CrudRepository<Person, Integer> {
    
	Person findByName(String name);
}
