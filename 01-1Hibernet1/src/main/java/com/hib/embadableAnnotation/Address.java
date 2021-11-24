package com.hib.embadableAnnotation;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private int pin;
	private String block;

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int pin, String block) {
		super();
		this.pin = pin;
		this.block = block;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	@Override
	public String toString() {
		return "Address [pin=" + pin + ", block=" + block + "]";
	}
}
