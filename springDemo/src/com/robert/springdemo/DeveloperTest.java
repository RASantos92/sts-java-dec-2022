package com.robert.springdemo;

import java.util.ArrayList;

import com.robert.springdemo.models.Developer;
import com.robert.springdemo.models.FrontendDeveloper;

public class DeveloperTest {

	public static void main(String[] args) {
		 System.out.println("---------Developer Test---------");


	        FrontendDeveloper fed = new FrontendDeveloper("Nathan Mort");

	        ArrayList<String> lang = new ArrayList<String>();
	        lang.add("Java");
	        lang.add("Python");

	        fed.setLanguages(lang);
	        fed.giveRaise(25000);

	        System.out.println(fed.displayStats());
	        System.out.println(Developer.getDevCount());
	        System.out.println(Developer.getTotalSalaries());

	}

}
