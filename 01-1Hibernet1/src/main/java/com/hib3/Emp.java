package com.hib3;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "emp_details")
public class Emp {
	@Id
	private int eid;
	
	@Column(name = "emp_name")
	private String ename;

	private byte ejoin;
	@Transient
	private double sal;

	
	public Emp(int eid, String ename, byte ejoin, double sal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.ejoin = ejoin;
		this.sal = sal;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public byte getEjoin() {
		return ejoin;
	}

	public void setEjoin(byte ejoin) {
		this.ejoin = ejoin;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

}
