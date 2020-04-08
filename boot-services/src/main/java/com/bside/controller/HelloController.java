package com.bside.controller;

import com.bside.message.ResponseMessage;
import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HelloController {

//    @Autowired
//    private Facebook facebook;

    @GetMapping("/hello")
    public ResponseMessage greet() {
        Map data = new HashMap();
        data.put("message", "Hello BSide Gangnam!");

        ResponseMessage response = new ResponseMessage();
        response.setStatus("success");
        response.setData(data);

        return response;
    }

//    @GetMapping("/facebookologin")
//    public ResponseMessage facebookLogin(Model model) {
////        List<Reference> friends = facebook.friendOperations().getFriends();
////        model.addAttribute("friends", friends);
//
////        User user = facebook.userOperations().getUserProfile();
//
//        return new ResponseMessage(model.toString());
//    }
}