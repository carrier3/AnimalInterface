package com.carrie_reed.handson8;

public class Cat implements Mammal {

	//implemented methods defined
	@Override
	public String speak() {
		String sound = "Meow!";
		return sound;
	}

	@Override
	public String run() {
		String speed = "Cats can run at a top speed of 30 mph!";
		return speed;
	}

	@Override
	public String eat() {
		String food = "Cats eat mice.";
		return food;
	}
}
