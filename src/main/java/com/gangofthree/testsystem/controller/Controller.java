package com.gangofthree.testsystem.controller;

<<<<<<< HEAD
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
=======
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {

  @RequestMapping(value = "/")
   public ModelAndView showStart() {
    return new ModelAndView("Login");
  }
>>>>>>> Gafurov0ivan/master
}
