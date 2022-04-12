package cl.tresit.Prueba.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cl.tresit.Prueba.model.Quiz;

public interface IQuizRepository extends JpaRepository<Quiz, Long> {
	
	@Query("SELECT COUNT(q) FROM Quiz q WHERE q.rock=true")
    long countRockStyle();

	
	@Query("SELECT COUNT(q) FROM Quiz q WHERE q.pop=true")
    long countPopStyle();
	
	@Query("SELECT COUNT(q) FROM Quiz q WHERE q.jazz=true")
    long countJazzStyle();
	
	@Query("SELECT COUNT(q) FROM Quiz q WHERE q.classic=true")
    long countClassicStyle();
	
	@Query("SELECT COUNT(q) FROM Quiz q WHERE q.etc=true")
    long countEtcStyle();
	
}
