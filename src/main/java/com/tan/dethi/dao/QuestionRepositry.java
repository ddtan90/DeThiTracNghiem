package com.tan.dethi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tan.dethi.domain.Question;

public interface QuestionRepositry extends JpaRepository<Question, Long> {

}
