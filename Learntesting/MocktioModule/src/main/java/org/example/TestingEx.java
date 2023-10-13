package org.example;

import java.util.ArrayList;
import java.util.List;

public class TestingEx {

    private User user;

    public TestingEx(User user) {
        this.user = user;
    }

    public String Greeting(){
        return Name(user.getName()) +AppName();
    }

    public String AppName(){
        return "Welcome to Testing FrameWork";
    }

    public String Name(String name){
        return "Hello "+ name +"!! ";
    }
}
