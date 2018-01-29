package com.webDemo.controller;

import com.webDemo.entity.User;
import com.webDemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by p.bell on 25.01.2016.
 */
@Controller
public class UserController {

    private static Integer count = 0;

    @Autowired
    private UserService userService;


    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ModelAndView getAccountListWrapper() {

        ModelAndView view = new ModelAndView("user");
        view.addObject("listUsers", userService.findAll());
        return view;
    }


    @RequestMapping(value = "/new", method = RequestMethod.GET)
    public String createNew() {

        User user = new User();
        count++;
        user.setLogin("login" + count);
        user.setSenha(String.valueOf(count));
        User saved = userService.save(user);
        System.out.println("Novo usuario criado: " + saved);

        return "redirect:/user";
    }

}
