package com.wipro.sindhu.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wipro.sindhu.entities.Category;
import com.wipro.sindhu.entities.Question;

public interface QuestionService {

	Question saveQuestion(Question q);
	Question getQuestion(Long id);
	Page<Question> findAllQuestions(Pageable pg);
	void deleteQuestion(Long id);
	Question patchQuestionById(Long id, Question q);
	List<Question> getQuestionsByCategory(Category category);
	
	
}
