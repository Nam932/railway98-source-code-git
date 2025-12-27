package com.vti.frontend;

import com.vti.entity.Phone;
import com.vti.entity.VietnamesePhone;

// Demo excercise 6 
public class Program4 {
	public static void main(String[] args) {

		Phone phone = new VietnamesePhone();

		phone.insertContact("Nam", "0123456789");
		phone.insertContact("An", "0987654321");

		phone.searchContact("Nam");

		phone.updateContact("Nam", "0111111111");
		phone.searchContact("Nam");

		phone.removeContact("An");
		phone.searchContact("An");
	}
}
