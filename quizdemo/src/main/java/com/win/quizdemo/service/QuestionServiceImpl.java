package com.win.quizdemo.service;

import com.win.quizdemo.model.Question;
import com.win.quizdemo.repository.QuestionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepo;

    @Override
    public Iterable<Question> findAll() {
        return questionRepo.findAll();
    }
}