package com.win.quizdemo.repository;

import com.win.quizdemo.model.Question;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface QuestionRepository extends CrudRepository<Question, Long> {
    
}