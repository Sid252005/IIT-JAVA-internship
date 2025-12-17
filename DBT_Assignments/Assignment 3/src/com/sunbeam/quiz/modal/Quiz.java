package com.sunbeam.quiz.modal;

public class Quiz {
	private int quiz_id;
	private String title;
	private int creator_id;
	

	


	public Quiz(int quiz_id, String title, int creator_id) {
		super();
		this.quiz_id = quiz_id;
		this.title = title;
		this.creator_id = creator_id;
	}


	public int getQuiz_id() {
		return quiz_id;
	}


	public void setQuiz_id(int quiz_id) {
		this.quiz_id = quiz_id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getCreator_id() {
		return creator_id;
	}


	public void setCreator_id(int creator_id) {
		this.creator_id = creator_id;
	}


	public Quiz() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Quiz [quiz_id=" + quiz_id + ", title=" + title + ", creator_id=" + creator_id + "]";
	}

}
