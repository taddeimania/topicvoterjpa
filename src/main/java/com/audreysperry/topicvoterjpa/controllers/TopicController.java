package com.audreysperry.topicvoterjpa.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TopicController {

    @RequestMapping("/")
    public String topicList() {
        return "index";
    }
}
