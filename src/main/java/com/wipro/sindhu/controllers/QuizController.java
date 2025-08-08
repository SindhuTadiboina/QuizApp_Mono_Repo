package com.wipro.sindhu.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.sindhu.entities.QuestionWrapper;
import com.wipro.sindhu.entities.Quiz;
import com.wipro.sindhu.entities.Response;
import com.wipro.sindhu.service.QuizService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@RequiredArgsConstructor
@Slf4j
@RestController 
@RequestMapping("/api/v1/quiz")
public class QuizController {
	
	private final QuizService service;

	@PostMapping("/create")
	public Quiz createQuiz( 
			@RequestParam String category,
			@RequestParam String difficultyLevel,
			@RequestParam String title
			) {
		return service.createQuiz(category,difficultyLevel,title);
	}
	
	@GetMapping("/getQuizByID/{id}")                  
    public List<QuestionWrapper> getQuizQuestions(@PathVariable Integer id){
        return service.getQuizQuestions(id);
    }
    
    
    
    @PostMapping("/submitQuiz/{id}")
    public Integer submitQuiz(@PathVariable int id, @RequestBody List<Response> responses){
        return service.calculateResult(id, responses);
    }
	
}
