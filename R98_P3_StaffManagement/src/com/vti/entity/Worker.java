package com.vti.entity;

public class Worker extends Staff {

	private int rank;

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public Worker() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Worker [rank=" + rank + ", getRank()=" + getRank() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
