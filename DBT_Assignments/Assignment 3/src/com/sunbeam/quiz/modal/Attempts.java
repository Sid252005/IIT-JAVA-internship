package com.sunbeam.quiz.modal;

public class Attempts {
	private int id;
	private int quizId;
	private int studentid;
	private int final_score;
	private int total_questions;
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public int getQuizId() {
		return quizId;
	}



	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}



	public int getStudentid() {
		return studentid;
	}



	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}



	public int getFinal_score() {
		return final_score;
	}



	public void setFinal_score(int final_score) {
		this.final_score = final_score;
	}



	public int getTotal_questions() {
		return total_questions;
	}



	public void setTotal_questions(int total_questions) {
		this.total_questions = total_questions;
	}



	public Attempts(int id, int quizId, int studentid, int final_score, int total_questions) {
		super();
		this.id = id;
		this.quizId = quizId;
		this.studentid = studentid;
		this.final_score = final_score;
		this.total_questions = total_questions;
	}



	@Override
	public String toString() {
		return "Attempts [id=" + id + ", quizId=" + quizId + ", studentid=" + studentid + ", final_score=" + final_score
				+ ", total_questions=" + total_questions + "]";
	}



	public Attempts() {
		// TODO Auto-generated constructor stub
	}

}
