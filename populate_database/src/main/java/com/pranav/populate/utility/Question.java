package com.pranav.populate.utility;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.pranav.populate.entity.Answers;
import com.pranav.populate.entity.Options;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Question {
	@JsonProperty
	private int id;
	
	@JsonProperty
	private String question;
	
	@JsonProperty
	private String description;
	
	@JsonProperty
	private Option answers;

	@JsonProperty
	private boolean multiple_correct_answers;
	
	
	@JsonProperty
	private Answer correct_answers;
	
	@JsonProperty
	private String correct_answer;
	
	@JsonProperty
	private String explanation;
	
	@JsonProperty
	private String tip;
	

	
	@JsonProperty
	private String difficulty;
	
	@JsonProperty
	private String category;
	
	public Question() {}

	public Question(int id, String question, String description, boolean multipleAnswers, Option options,
			Answer correctAnswers, String correctAnswer, String explanation, String tip,
			String difficulty, String category) {
		super();
		this.id = id;
		this.question = question;
		this.description = description;
		this.multiple_correct_answers = multipleAnswers;
		this.answers = options;
		this.correct_answers = correctAnswers;
		this.correct_answer = correctAnswer;
		this.explanation = explanation;
		this.tip = tip;
		this.difficulty = difficulty;
		this.category = category;
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

	public boolean isMultipleAnswers() {
		return multiple_correct_answers;
	}

	public void setMultipleAnswers(boolean multipleAnswers) {
		this.multiple_correct_answers = multipleAnswers;
	}

	public Option getOptions() {
		return answers;
	}

	public void setOptions(Option options) {
		this.answers = options;
	}

	public Answer getCorrectAnswers() {
		return correct_answers;
	}

	public void setCorrectAnswers(Answer correctAnswers) {
		this.correct_answers = correctAnswers;
	}

	public String getCorrectAnswer() {
		return correct_answer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correct_answer = correctAnswer;
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



	public String getDifficulty() {
		return difficulty;
	}

	public void setDifficulty(String difficulty) {
		this.difficulty = difficulty;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	
	

}
