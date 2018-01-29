package com.apiDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by p.bell on 26.01.2016.
 * this class consists of rest services for database operations
 */
@Controller
public class BanksController {


    @RequestMapping(value="/teste", method = RequestMethod.GET)
    public void update() {
        System.out.println(
                "Teste"
        );
    }

}
