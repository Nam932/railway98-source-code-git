package com.vti.entity;

public class Mentor extends Person implements IToDoPerson {

	private int yearsOfExperience;

	public int getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;

	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void login() {
		// TODO Auto-generated method stub

	}
}
