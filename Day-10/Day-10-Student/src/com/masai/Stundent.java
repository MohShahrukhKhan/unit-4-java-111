package com.masai;

public abstract class Stundent {
	String name;
	String address;
	public Stundent(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	public abstract int getPercentage( );
}
