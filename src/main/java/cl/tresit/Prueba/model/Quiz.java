package cl.tresit.Prueba.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Quiz {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String email;
	private boolean rock;
	private boolean pop;
	private boolean jazz;
	private boolean classic;
	private boolean etc;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isRock() {
		return rock;
	}
	public void setRock(boolean rock) {
		this.rock = rock;
	}
	public boolean isPop() {
		return pop;
	}
	public void setPop(boolean pop) {
		this.pop = pop;
	}
	public boolean isJazz() {
		return jazz;
	}
	public void setJazz(boolean jazz) {
		this.jazz = jazz;
	}
	public boolean isClassic() {
		return classic;
	}
	public void setClassic(boolean classic) {
		this.classic = classic;
	}
	public boolean isEtc() {
		return etc;
	}
	public void setEtc(boolean etc) {
		this.etc = etc;
	}
	

	
	
	
}
