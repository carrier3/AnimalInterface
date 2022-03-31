package com.carrie_reed.handson8;

public class Lizard implements Reptile {

	//implemented methods defined
	@Override
	public String eat() {
		String food = "Lizards eat crickets.";
		return food;
	}

	@Override
	public String crawl() {
		String speed = "An Iguana can run up to 21 mph!";
		return speed;
	}

}
