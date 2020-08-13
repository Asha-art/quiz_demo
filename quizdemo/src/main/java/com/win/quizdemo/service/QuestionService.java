package com.win.quizdemo.service;

import com.win.quizdemo.model.Question;

public interface QuestionService {
    public Iterable<Question> findAll();
    
}