package com.carrie_reed.handson8;

public class Turtle implements Reptile {

	//implemented methods defined
	@Override
	public String eat() {
		String food = "Turtles eat lettuce.";
		return food;
	}

	@Override
	public String crawl() {
		String speed = "On land, turtles can move up to 1 mph!";
		return speed;
	}

}
