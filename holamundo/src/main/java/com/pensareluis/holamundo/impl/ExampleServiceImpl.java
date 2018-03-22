package com.pensareluis.holamundo.impl;

import com.pensareluis.holamundo.controller.model.Person;
import com.pensareluis.holamundo.services.ExampleService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {
    private static final Log LOG = LogFactory.getLog(ExampleService.class);
    @Override
    public List<Person> getListPeople() {
        List<Person> people = new ArrayList();
        people.add(new Person ("Jhon", 23));
        people.add(new Person ("Luis", 25));
        people.add(new Person ("Rafael", 30));
        people.add(new Person ("Naye", 27));
        LOG.info("Hello from service");
        return people;
    }
}
