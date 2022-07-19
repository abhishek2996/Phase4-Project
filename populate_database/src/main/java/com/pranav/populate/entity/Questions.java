package com.pranav.populate.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="questions")
public class Questions {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="question")
	private String question;
	
	@Column(name="description")
	private String description;
	
	
	@Column(name="multiple_correct_answers")
	private boolean multipleAnswers;
	

	
	@Column(name="correct_answer")
	private String correctAnswer;
	
	@Column(name="explanation")
	private String explanation;
	
	@Column(name="tip")
	private String tip;
	

	
	@Column(name="category")
	private String category;
	
	@Column(name="difficulty")
	private String difficulty;
	
	@OneToOne( cascade = CascadeType.ALL)
	@JoinColumn(name="option_id")
	private Options options;
	
	@OneToOne( cascade = CascadeType.ALL)
	@JoinColumn(name="correct_answer_id")
	private Answers answers;

	
	public Questions() {}

	public Questions(int id, String question, String description, Options options, boolean multipleAnswers,String correctAnswer,
			Answers correctAnswerId, String explanation, String tip,String category, String difficulty) {
		super();
		this.id = id;
		this.question = question;
		this.description = description;
		this.options = options;
		this.multipleAnswers = multipleAnswers;
		this.answers = correctAnswerId;
		this.correctAnswer = correctAnswer;
		this.explanation = explanation;
		this.tip = tip;
		this.category = category;
		this.difficulty = difficulty;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Options getOptionId() {
		return options;
	}

	public void setOptionId(Options optionId) {
		this.options = optionId;
	}

	public boolean isMultipleAnswers() {
		return multipleAnswers;
	}

	public void setMultipleAnswers(boolean multipleAnswers) {
		this.multipleAnswers = multipleAnswers;
	}

	public Answers getCorrectAnswerId() {
		return answers;
	}

	public void setCorrectAnswerId(Answers correctAnswerId) {
		this.answers = correctAnswerId;
	}

	public String getCorrectAnswer() {
		return correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public String getExplanation() {
		return explanation;
	}

	public void setExplanation(String explanation) {
		this.explanation = explanation;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}


	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}
}
