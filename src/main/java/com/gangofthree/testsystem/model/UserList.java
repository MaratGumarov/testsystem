package com.gangofthree.testsystem.model;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by maratgumarov on 08.11.16.
 */
public class UserList {
    private static final List<User> USERS = new ArrayList<User>();

    public UserList() {
    }

    static {
        USERS.add(new User(1,"Kamila","qwer","kamila@gmail.com"));
        USERS.add(new User(1,"Ivan","qwer","ivan@gmail.com"));
        USERS.add(new User(1,"Marat","qwer","marat@gmail.com"));
    }
    public static List<User> getInstance(){
        return USERS;
    }
}
