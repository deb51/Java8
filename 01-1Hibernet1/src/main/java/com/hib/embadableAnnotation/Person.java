package com.hib.embadableAnnotation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {

	@Column
	private String name;
	@Id
	private int id;

	

	private Address add;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int id, Address add) {
		super();
		this.name = name;
		this.id = id;
		this.add = add;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", add=" + add + "]";
	}

}
