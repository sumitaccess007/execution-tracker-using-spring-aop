package com.sumitaccess007;

import com.sumitaccess007.configurations.ProjectConfig;
import com.sumitaccess007.model.Comment;
import com.sumitaccess007.services.CommentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
@Slf4j
public class ExecutionTrackerUsingSpringAopApplication {
	public static AnnotationConfigApplicationContext context;
	public static void main(String[] args) {
		context = new AnnotationConfigApplicationContext(ExecutionTrackerUsingSpringAopApplication.class);

		var commentService = context.getBean(CommentService.class);
		var comment = new Comment();
		comment.setText("Usage of Spring AOP");
		comment.setAuthor("Sumit SHARMA");

		commentService.publishComment(comment);
	}

}
