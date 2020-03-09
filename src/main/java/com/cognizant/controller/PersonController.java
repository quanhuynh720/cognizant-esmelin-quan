package com.cognizant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.model.Person;
import com.cognizant.service.PersonService;



@RestController
@RequestMapping(value = "/person")
@CrossOrigin(origins= "*")
public class PersonController {

    @Autowired
    private PersonService ps;

    
    @GetMapping(value = "/{name}")
    public Person getByName(@PathVariable("name") String name) {
        return ps.findByName(name);
    }

    @PostMapping(value = "/addperson")
	public void save(@RequestBody Person per) {
		ps.save(per);
    }
    
    
}