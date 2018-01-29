package com.webDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by p.bell on 25.01.2016.
 */
@Controller
public class BanksMvcController {


    @RequestMapping(value = "/teste2", method = RequestMethod.GET)
    public void getAccountListWrapper() {
        System.out.println("Teste2");
    }

}
