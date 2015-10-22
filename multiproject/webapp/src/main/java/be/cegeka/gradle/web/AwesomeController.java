package be.cegeka.gradle.web;

import be.cegeka.gradle.api.AwesomeService;
import org.springframework.beans.factory.annotation.Autowired;

public class AwesomeController {

    @Autowired
    private AwesomeService service;

}
