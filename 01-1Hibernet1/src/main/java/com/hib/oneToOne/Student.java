package com.hib.oneToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int stu_id;
	private String stuname;
	@OneToOne
	private Address add;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int stu_id, String stuname, Address add) {
		super();
		this.stu_id = stu_id;
		this.stuname = stuname;
		this.add = add;
	}

	public int getStu_id() {
		return stu_id;
	}

	public void setStu_id(int stu_id) {
		this.stu_id = stu_id;
	}

	public String getStuname() {
		return stuname;
	}

	public void setStuname(String stuname) {
		this.stuname = stuname;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

}
