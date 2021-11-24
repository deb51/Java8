package com.hib.oneToMany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Question {
	@Id
	private int question_id;
	private String question;
	
	@OneToMany(mappedBy = "question")
	private List<Answer> answers;

	public Question(int question_id, String question, List<Answer> answer) {
		super();
		this.question_id = question_id;
		this.question = question;
		this.answers = answer;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getQuestion_id() {
		return question_id;
	}

	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswer() {
		return answers;
	}

	public void setAnswer(List<Answer> answer) {
		this.answers = answer;
	}

}
