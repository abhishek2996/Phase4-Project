package com.pranav.dto;



import com.pranav.entity.Questions;

public class AnswersDto {
	

	private int id;
	
	private boolean answerA;
	
	private boolean answerB;
	
	private boolean answerC;
	
	private boolean answerD;
	
	private boolean answerE;
	
	private boolean answerF;
	
	
	public AnswersDto() {}

	public AnswersDto(int id, boolean answerA, boolean answerB, boolean answerC, boolean answerD, boolean answerE,
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
