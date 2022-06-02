package com.masai;

public class ZImpl implements Z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Z  Z=new ZImpl();
		Z.funA();
		Z.fun();
		Z.funAA();
		Z.funC();
		Z.funZ();

		
		
		
	}

	@Override
	public void funC() {
		// TODO Auto-generated method stub
		System.out.println("this is funC");
	}

	@Override
	public void fun() {
		// TODO Auto-generated method stub
		System.out.println("this is fun");
	}

	@Override
	public void funZ() {
		// TODO Auto-generated method stub
		System.out.println("this is funZ");
	}

	
}
