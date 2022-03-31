package com.carrie_reed.handson8;

public class Cow implements Mammal {

	//implemented methods defined
	@Override
	public String speak() {
		String sound = "Moo!";
		return sound;
	}

	@Override
	public String run() {
		String speed = "Cows can run at a top speed of 25 mph!";
		return speed;
	}

	@Override
	public String eat() {
		String food = "Cows eat grass.";
		return food;
	}
}
