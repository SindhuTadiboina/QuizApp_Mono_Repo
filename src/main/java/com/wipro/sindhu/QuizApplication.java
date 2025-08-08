package com.wipro.sindhu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wipro.sindhu.entities.Category;
import com.wipro.sindhu.entities.DifficultyLevel;
import com.wipro.sindhu.entities.Question;
import com.wipro.sindhu.repo.QuestionRepository;

@SpringBootApplication
public class QuizApplication implements ApplicationRunner{

	@Autowired
	private QuestionRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
		System.out.println(" This is Quiz Application");
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		Question q = new Question(1, "which country introduced the Java langauge","india", "usa", "japan", "china","india", DifficultyLevel.EASY, Category.JAVA);
		repo.save(q);
	}

}
