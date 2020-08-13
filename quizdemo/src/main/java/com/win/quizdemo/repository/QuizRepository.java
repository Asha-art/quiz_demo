package com.win.quizdemo.repository;

import com.win.quizdemo.model.Quiz;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizRepository extends CrudRepository<Quiz, Long> {

}