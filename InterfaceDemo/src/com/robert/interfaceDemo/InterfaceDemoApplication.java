package com.robert.interfaceDemo;

import com.robert.interfaceDemo.models.Cat;
import com.robert.interfaceDemo.models.Dog;

public class InterfaceDemoApplication {

	public static void main(String[] args) {
		Cat cat1 = new Cat("reggy");
		cat1.play();
		cat1.showAffection();
		cat1.askForFood();
		System.out.println("******************************");
		
		Dog dog1 = new Dog("Rocky");
		dog1.play();
		dog1.showAffection();
		dog1.askForFood();

	}

}
