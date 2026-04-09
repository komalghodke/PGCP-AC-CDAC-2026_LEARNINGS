package com.assignments.q3.Exam;

/*
Exam class
Stores examid, name, topic, date, and array of questions.
Conducts the test and calculates marks.
*/
import java.util.*;

public class Exam {
	int examid;
	String name, topic, date;
	Question[] questions;

	public Exam(int examid, String name, String topic, String date, Question[] questions) {
		this.examid = examid;
		this.name = name;
		this.topic = topic;
		this.date = date;
		this.questions = questions;
	}

	public int conductExam(Scanner sc) {
		int score = 0;
		for (Question q : questions) {
			if (q.ask(sc))
				score += q.marks;
		}
		return score;
	}
}
