package com.sarje.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class StudentPk implements Serializable {
	private int rno;
	private int sclass;
	public StudentPk() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentPk(int rno, int sclass) {
		super();
		this.rno = rno;
		this.sclass = sclass;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public int getSclass() {
		return sclass;
	}
	public void setSclass(int sclass) {
		this.sclass = sclass;
	}
	@Override
	public String toString() {
		return rno + " " + sclass;
	}
	
}
