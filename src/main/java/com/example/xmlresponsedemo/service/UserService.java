package com.example.xmlresponsedemo.service;

import com.example.xmlresponsedemo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    public List<User> getuser()
    {
        List<User> list = new ArrayList<>();

        User user1 = new User("ABC",1,2);
        User user2 = new User("ABC",1,2);
        User user3 = new User("ABC",1,2);
        User user4 = new User("ABC",1,2);
        User user5 = new User("ABC",1,2);
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        list.add(user5);
        return list;
    }
}
