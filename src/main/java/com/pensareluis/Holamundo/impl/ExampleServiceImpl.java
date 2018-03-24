package com.pensareluis.Holamundo.impl;

import com.pensareluis.Holamundo.services.ExampleService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("exampleService")
public class ExampleServiceImpl implements ExampleService {
    private static final Log LOG = LogFactory.getLog(ExampleService.class);

    @Override
    public Object getListPeople() {
        return null;
    }
}
