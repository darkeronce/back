package cl.tresit.Prueba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import cl.tresit.Prueba.model.Quiz;
import cl.tresit.Prueba.model.Result;
import cl.tresit.Prueba.repository.IQuizRepository;

@Service
public class QuizService {

	@Autowired
	IQuizRepository quizRepository;
	
	
	public ResponseEntity<Quiz> save(@RequestBody Quiz quiz){
		
		try {
			return new ResponseEntity<>(quizRepository.save(quiz), HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	public long rockCount(){	
		return quizRepository.countRockStyle();			
	}
	
	public long popCount(){	
		return quizRepository.countPopStyle();			
	}
	
	public long jazzCount(){	
		return quizRepository.countJazzStyle();			
	}
	
	public long classicCount(){	
		return quizRepository.countClassicStyle();			
	}
	
	public long etcCount(){	
		return quizRepository.countEtcStyle();			
	}
}
