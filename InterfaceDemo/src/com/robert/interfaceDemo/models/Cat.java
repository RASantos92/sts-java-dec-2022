package com.robert.interfaceDemo.models;

import com.robert.interfaceDemo.interfaces.Keepable;

public class Cat extends Pet implements Keepable{

	public Cat() {
		super();
	}
	
	public Cat(String name) {
		super(name);
	}

	@Override
	public void showAffection() {
		System.out.println("Purrrrrr..");
		
	}

	@Override
	public void askForFood() {
		System.out.println("Meow...");
		
	}

}
