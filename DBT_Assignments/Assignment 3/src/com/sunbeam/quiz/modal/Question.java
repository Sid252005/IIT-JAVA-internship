package com.sunbeam.quiz.modal;

public class Question {
	private int question_id;
	private int quiz_id;
	private String a;
	private String b;
	private String c;
	private String d;
	private String correct_option;
	



	public int getQuestion_id() {
		return question_id;
	}


	public void setQuestion_id(int question_id) {
		this.question_id = question_id;
	}


	public int getQuiz_id() {
		return quiz_id;
	}


	public void setQuiz_id(int quiz_id) {
		this.quiz_id = quiz_id;
	}


	public String getA() {
		return a;
	}


	public void setA(String a) {
		this.a = a;
	}


	public String getB() {
		return b;
	}


	public void setB(String b) {
		this.b = b;
	}


	public String getC() {
		return c;
	}


	public void setC(String c) {
		this.c = c;
	}


	public String getD() {
		return d;
	}


	public void setD(String d) {
		this.d = d;
	}


	public String getCorrect_option() {
		return correct_option;
	}


	public void setCorrect_option(String correct_option) {
		this.correct_option = correct_option;
	}


	public Question(int question_id, int quiz_id, String a, String b, String c, String d, String correct_option) {
		super();
		this.question_id = question_id;
		this.quiz_id = quiz_id;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.correct_option = correct_option;
	}

	@Override
	public String toString() {
		return "Question [question_id=" + question_id + ", quiz_id=" + quiz_id + ", a=" + a + ", b=" + b + ", c=" + c
				+ ", d=" + d + ", correct_option=" + correct_option + "]";
	}

	public Question() {
		// TODO Auto-generated constructor stub
	}

}
