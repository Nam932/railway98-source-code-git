package com.vti.frontend;

import com.vti.entity.Mentor;
import com.vti.entity.Trainee;

public class Program5 {
	public static void main(String[] args) {
		// tạo ra trainee
		Trainee trainee1 = new Trainee();
		trainee1.setId(1);
		trainee1.setEmail("trainee1@vti.com");
		trainee1.setUsername("trainee1");
		trainee1.setFullName("Trainee1");
		trainee1.setUniversity("BKHN");

		// Mentor
		Mentor mentor1 = new Mentor();
		mentor1.setId(1);
		mentor1.setEmail("trainee1@vti.com");
		mentor1.setUsername("trainee1");
		mentor1.setFullName("Trainee1");
		mentor1.setYearsOfExperience(5);

//		// Hien thi thong tin cua trainee
//		System.out.println("ID:" + trainee1.getId() + " username:" + trainee1.getUsername() + " university: "
//				+ trainee1.getUniversity());

		mentor1.showInfo();
		trainee1.showInfo();
//		trainee1.getUniversity();

	}
}