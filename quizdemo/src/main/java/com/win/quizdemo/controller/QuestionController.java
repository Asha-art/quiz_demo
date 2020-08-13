package com.win.quizdemo.controller;

import javax.servlet.http.HttpServletRequest;

import com.win.quizdemo.service.QuestionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap modelMap) {
        modelMap.put("questions", questionService.findAll());
        return "question/index";
    }

    @RequestMapping(value = "submit", method = RequestMethod.POST)
    public String submit(HttpServletRequest request) {
        String[] questionIds = request.getParameterValues("questionId");
        for (String questionId : questionIds) {
            System.out.println(questionId);
        }
        return "question/result";
    }
}