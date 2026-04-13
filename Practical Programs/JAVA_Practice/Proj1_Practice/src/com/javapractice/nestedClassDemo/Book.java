package com.javapractice.nestedClassDemo;

public class Book {
	private int bid;
	private String bname;
	Lesson lesson;

	public Book(int bid, String bname) {
		super();
		this.bid = bid;
		this.bname = bname;
	}

	public class Lesson {
		private int lid;
		private String lname;

		public Lesson() {
			super();
		}

		public Lesson(int lid, String lname) {
			super();
			this.lid = lid;
			this.lname = lname;
		}

		public int method1() {
			System.out.println("in method 1");
			return 0;
		}
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Lesson getLesson() {
		return lesson;
	}

	public void setLesson(Lesson lesson) {
		this.lesson = lesson;
	}
}
