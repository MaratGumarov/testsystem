package com.gangofthree.testsystem.controller;

import com.gangofthree.testsystem.model.User;
import com.gangofthree.testsystem.model.UserList;
import java.util.List;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ListUserController extends AbstractController{

    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest httpServletRequest,
                                                 HttpServletResponse httpServletResponse) throws Exception {

        List<User> users = UserList.getInstance();

        ModelAndView modelAndView = new ModelAndView("users");
        modelAndView.addObject("users",users);
        return modelAndView;
    }
}
