package com.gangofthree.testsystem.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Controller extends AbstractController{

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest,
                                                 HttpServletResponse httpServletResponse) throws Exception {

        ModelAndView modelAndView = new ModelAndView("Login");
        modelAndView.addObject("helloString","Привет!");
        return modelAndView;
    }
}
