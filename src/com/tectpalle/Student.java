package com.tectpalle;

import javax.persistence.*;

@Entity

@Table(name="movie")
public class Student 
{
	@Id
	private int sno;
	private String sname;
	private String subject;
	
	public Student() {
		super();
	}
	public Student(int sno, String sname, String subject) {
		super();
		this.sno = sno;
		this.sname = sname;
		this.subject = subject;
	}
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	

}
