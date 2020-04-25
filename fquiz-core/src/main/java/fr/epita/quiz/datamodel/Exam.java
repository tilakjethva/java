package fr.epita.quiz.datamodel;

import javax.inject.Named;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Named(value = "EXAM")
public class Exam {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long e_id;
	
	@Named(value = "E_TITLE")
	private String e_title;

	public long getE_id() {
		return e_id;
	}

	public void setE_id(long e_id) {
		this.e_id = e_id;
	}

	public String getE_title() {
		return e_title;
	}

	public void setE_title(String e_title) {
		this.e_title = e_title;
	}

	
}
