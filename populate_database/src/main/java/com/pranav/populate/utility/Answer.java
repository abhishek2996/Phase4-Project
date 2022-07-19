package com.pranav.populate.utility;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Answer {
	@JsonProperty
	private int id;
	@JsonProperty
	private boolean answer_a_correct;
	@JsonProperty
	private boolean answer_b_correct;
	@JsonProperty
	private boolean answer_c_correct;
	@JsonProperty
	private boolean answer_d_correct;
	@JsonProperty
	private boolean answer_e_correct;
	@JsonProperty
	private boolean answer_f_correct;
	
	public Answer() {}

	public Answer(int id, boolean answer_a_correct, boolean answer_b_correct, boolean answer_c_correct,
			boolean answer_d_correct, boolean answer_e_correct, boolean answer_f_correct) {
		super();
		this.id = id;
		this.answer_a_correct = answer_a_correct;
		this.answer_b_correct = answer_b_correct;
		this.answer_c_correct = answer_c_correct;
		this.answer_d_correct = answer_d_correct;
		this.answer_e_correct = answer_e_correct;
		this.answer_f_correct = answer_f_correct;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isAnswer_a_correct() {
		return answer_a_correct;
	}

	public void setAnswer_a_correct(boolean answer_a_correct) {
		this.answer_a_correct = answer_a_correct;
	}

	public boolean isAnswer_b_correct() {
		return answer_b_correct;
	}

	public void setAnswer_b_correct(boolean answer_b_correct) {
		this.answer_b_correct = answer_b_correct;
	}

	public boolean isAnswer_c_correct() {
		return answer_c_correct;
	}

	public void setAnswer_c_correct(boolean answer_c_correct) {
		this.answer_c_correct = answer_c_correct;
	}

	public boolean isAnswer_d_correct() {
		return answer_d_correct;
	}

	public void setAnswer_d_correct(boolean answer_d_correct) {
		this.answer_d_correct = answer_d_correct;
	}

	public boolean isAnswer_e_correct() {
		return answer_e_correct;
	}

	public void setAnswer_e_correct(boolean answer_e_correct) {
		this.answer_e_correct = answer_e_correct;
	}

	public boolean isAnswer_f_correct() {
		return answer_f_correct;
	}

	public void setAnswer_f_correct(boolean answer_f_correct) {
		this.answer_f_correct = answer_f_correct;
	}
	
	

}