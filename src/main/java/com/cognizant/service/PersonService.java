package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.dao.PersonDao;
import com.cognizant.model.Person;

@Service
public class PersonService {

	  @Autowired
	  PersonDao pd;

	  public Person findByName(String name) {
	  return pd.findByName(name);
	  }

	  public void save(Person person) {
	  pd.save(person);
	  }
}
