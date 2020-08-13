package com.win.quizdemo.repository;

import com.win.quizdemo.model.Answer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnswerRepository extends CrudRepository<Answer, Long> {
    
}