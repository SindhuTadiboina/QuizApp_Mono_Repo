package com.wipro.sindhu.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect  //extra logic
@Component //object creation
@Slf4j
public class LoggingAspect {

	//
	@Before("execution(* com.wipro.sindhu.controllers.QuestionController.addQuestion(..))")
public void logBeforeAddQuestion(JoinPoint joinpoint) {
    log.warn("Logging before addQuestion endpoint: " + joinpoint.getArgs());
}

	
}
