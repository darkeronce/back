package cl.tresit.Prueba.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cl.tresit.Prueba.model.Quiz;
import cl.tresit.Prueba.service.QuizService;

@RestController
public class QuizController {

	@Autowired
	QuizService quizService;

	@GetMapping("/quiz/rockresults")
	public long rockResults(){
		return quizService.rockCount();
	}
	
	@GetMapping("/quiz/popresults")
	public long popResults(){
		return quizService.popCount();
	}
	
	@GetMapping("/quiz/jazzresults")
	public long jazzResults(){
		return quizService.jazzCount();
	}
	
	@GetMapping("/quiz/classicresults")
	public long classsicResults(){
		return quizService.classicCount();
	}
	
	@GetMapping("/quiz/etcresults")
	public long etcResults(){
		return quizService.etcCount();
	}
	
	@PostMapping("/quiz")
	public ResponseEntity<Quiz> save(@RequestBody Quiz quiz){
		return quizService.save(quiz);
	}
	
	
}
