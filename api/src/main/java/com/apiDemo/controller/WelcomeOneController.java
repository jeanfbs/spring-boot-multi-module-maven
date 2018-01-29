package com.apiDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by p.bell on 26.01.2016.
 * this class consists of rest services for database operations
 */
@Controller
public class WelcomeOneController {


    @RequestMapping(value="/welcome", method = RequestMethod.GET)
    public ModelAndView update() {

        return new ModelAndView("welcome");
    }

}
