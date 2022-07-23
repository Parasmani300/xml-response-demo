package com.example.xmlresponsedemo.controller;

import com.example.xmlresponsedemo.model.User;
import com.example.xmlresponsedemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/user",method = RequestMethod.GET,produces = {MediaType.APPLICATION_XML_VALUE,MediaType.TEXT_XML_VALUE})
    public List<User> getUser()
    {
        return  userService.getuser();
    }

    @RequestMapping(value = "/u",method = RequestMethod.GET,produces = {MediaType.APPLICATION_XML_VALUE,MediaType.TEXT_XML_VALUE})
    public User getU()
    {
        return  userService.getuser().get(0);
    }

    @RequestMapping(value = "/post",method = RequestMethod.POST,
            consumes = {MediaType.APPLICATION_XML_VALUE,MediaType.TEXT_XML_VALUE,MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE}
    )
    public User publishUser(@RequestBody User user)
    {
        return user;
    }
}
