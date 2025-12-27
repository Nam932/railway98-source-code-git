package com.vti.entity;

public class VietnamesePhone extends Phone {

	@Override
	public void insertContact(String name, String phone) {
		contacts.add(new Contact(name, phone));
		System.out.println("Đã thêm liên hệ!");
	}

	@Override
	public void removeContact(String name) {
		for (int i = 0; i < contacts.size(); i++) {
			if (contacts.get(i).getName().equals(name)) {
				contacts.remove(i);
				System.out.println("Đã xóa liên hệ!");
				return;
			}
		}
		System.out.println("Không tìm thấy liên hệ!");
	}

	@Override
	public void updateContact(String name, String newPhone) {
		for (Contact contact : contacts) {
			if (contact.getName().equals(name)) {
				contact.setPhone(newPhone);
				System.out.println("Đã cập nhật liên hệ!");
				return;
			}
		}
		System.out.println("Không tìm thấy liên hệ!");
	}

	@Override
	public void searchContact(String name) {
		for (Contact contact : contacts) {
			if (contact.getName().equals(name)) {
				System.out.println(contact);
				return;
			}
		}
		System.out.println("Không tìm thấy liên hệ!");
	}
}
