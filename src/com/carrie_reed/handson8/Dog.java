package com.carrie_reed.handson8;

public class Dog implements Mammal {

	//implemented methods defined
	@Override
	public String speak() {
		String sound = "Bark!";
		return sound;
	}

	@Override
	public String run() {
		String speed = "Dogs can run at a top speed of 45 mph!";
		return speed;
	}

	@Override
	public String eat() {
		String food = "Dogs eat bones.";
		return food;
	}
}
