package com.gangofthree.testsystem.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {

  @RequestMapping(value = "/")
   public ModelAndView showStart() {
    return new ModelAndView("Login");
  }
}
