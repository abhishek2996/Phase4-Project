package com.pranav.dto;

import com.pranav.entity.Answers;
import com.pranav.entity.Options;
import com.pranav.entity.Tags;

public class QuestionsDto {
	
	
	private int id;

	private String question;
	
	private String description;

	private boolean multipleAnswers;
	
	private String correctAnswer;
	
	private String explanation;
	
	private String tip;
	
	private String category;
	
	private String difficulty;
	
	private Options options;
	
	private Answers answers;
	
	private Tags tags;

	
	public QuestionsDto() {}

	public QuestionsDto(int id, String question, String description, Options options, boolean multipleAnswers,String correctAnswer,
			Answers correctAnswerId, String explanation, String tip,String category, String difficulty, Tags tags) {
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
		this.tags = tags;
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
	

	public Options getOptions() {
		return options;
	}

	public void setOptions(Options options) {
		this.options = options;
	}

	public Answers getAnswers() {
		return answers;
	}

	public void setAnswers(Answers answers) {
		this.answers = answers;
	}

	public Tags getTags() {
		return tags;
	}

	public void setTags(Tags tags) {
		this.tags = tags;
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
