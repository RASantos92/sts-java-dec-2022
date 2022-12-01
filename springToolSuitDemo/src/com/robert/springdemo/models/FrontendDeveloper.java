package com.robert.springdemo.models;

public class FrontendDeveloper extends Developer {
	private boolean isArtistic;
	
	public FrontendDeveloper() {
		super("No name givin", true,75000, 6.5 );
		this.isArtistic = true;
	}
	
	public FrontendDeveloper(String name) {
		super(name, true,75000, 6.5 );
		this.isArtistic = true;
	}
	
	//methods
	public String displayStats() {
		String output = super.displayStats();
		output += "isArtistic: " + this.isArtistic+ "\n";	
		return output;
	}
	
	public void giveRaise(int amount){
		this.setSalary(amount + this.getSalary());
	}
	// getters and setters

	public boolean isArtistic() {
		return isArtistic;
	}

	public void setArtistic(boolean isArtistic) {
		this.isArtistic = isArtistic;
	}
	

}
