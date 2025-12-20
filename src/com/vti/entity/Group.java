package com.vti.entity;

import java.util.Date;

public class Group {
	private int id;
	private String groupName;
	private Account creator;
	private Account[] accounts;
	private Date createDate;

	// a) Không có parameter
	public Group() {
	}

	// b) GroupName, Creator, Account[], CreateDate
	public Group(String groupName, Account creator, Account[] accounts, Date createDate) {
		this.groupName = groupName;
		this.creator = creator;
		this.accounts = accounts;
		this.createDate = createDate;
	}

	// c) GroupName, Creator, String[] usernames, CreateDate
	public Group(String groupName, Account creator, String[] usernames, Date createDate) {
		this.groupName = groupName;
		this.creator = creator;
		this.createDate = createDate;

		this.accounts = new Account[usernames.length];
		for (int i = 0; i < usernames.length; i++) {
			Account acc = new Account();
			acc.setUsername(usernames[i]); // ✅ FIX
			this.accounts[i] = acc;
		}
	}

	// Getter (frontend cần đọc)
	public String getGroupName() {
		return groupName;
	}

	public Account[] getAccounts() {
		return accounts;
	}
}
