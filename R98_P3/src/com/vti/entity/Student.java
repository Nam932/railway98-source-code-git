package com.vti.entity;

public class Student {
	private int id;

	private final String code; // Sau khi đã được cấp thì sẽ kh

	private String name;
	public static String className; // quản lý ở lớp Student
	private static int genId = 1;

	public Student(String code) {
		super();
		this.code = code;
		this.id = genId;
		genId++;
	}

	public String getCode() {
		return code;
	}

//  public void setCode(String code) {
//      this.code = code;
//  }

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getClassName() {
		return className;
	}

	public static void setClassName(String className) {
		Student.className = className;
	}

	public static int getGenId() {
		return genId;
	}

	public static void setGenId(int genId) {
		Student.genId = genId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student(int id, String code, String name) {
		super();
		this.id = id;
		this.code = code;
		this.name = name;
	}
}