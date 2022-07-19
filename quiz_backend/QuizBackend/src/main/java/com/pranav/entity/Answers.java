package com.pranav.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="answers")
public class Answers {
	
	@Id
	
	private int id;
	
	@Column(name="answer_a")
	private boolean answerA;
	
	@Column(name="answer_b")
	private boolean answerB;
	
	@Column(name="answer_c")
	private boolean answerC;
	
	@Column(name="answer_d")
	private boolean answerD;
	
	@Column(name="answer_e")
	private boolean answerE;
	
	@Column(name="answer_f")
	private boolean answerF;
	
	@OneToOne(mappedBy = "correctAnswers")
	private Questions question;
	
	public Answers() {}

	public Answers(int id, boolean answerA, boolean answerB, boolean answerC, boolean answerD, boolean answerE,
			boolean answerF) {
		super();
		this.id = id;
		this.answerA = answerA;
		this.answerB = answerB;
		this.answerC = answerC;
		this.answerD = answerD;
		this.answerE = answerE;
		this.answerF = answerF;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isAnswerA() {
		return answerA;
	}

	public void setAnswerA(boolean answerA) {
		this.answerA = answerA;
	}

	public boolean isAnswerB() {
		return answerB;
	}

	public void setAnswerB(boolean answerB) {
		this.answerB = answerB;
	}

	public boolean isAnswerC() {
		return answerC;
	}

	public void setAnswerC(boolean answerC) {
		this.answerC = answerC;
	}

	public boolean isAnswerD() {
		return answerD;
	}

	public void setAnswerD(boolean answerD) {
		this.answerD = answerD;
	}

	public boolean isAnswerE() {
		return answerE;
	}

	public void setAnswerE(boolean answerE) {
		this.answerE = answerE;
	}

	public boolean isAnswerF() {
		return answerF;
	}

	public void setAnswerF(boolean answerF) {
		this.answerF = answerF;
	}
	
	

}
