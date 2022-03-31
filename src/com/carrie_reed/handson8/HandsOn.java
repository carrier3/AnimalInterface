package com.carrie_reed.handson8;

public class HandsOn {

	public static void main(String[] args) {
		// create new Objects
		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();
		Turtle turtle = new Turtle();
		Lizard lizard = new Lizard();
		
		
		//call methods for each object
		String dogSpeak = dog.speak();
		String dogRun = dog.run();
		String dogEat = dog.eat();
		String catSpeak = cat.speak();
		String catRun = cat.run();
		String catEat = cat.eat();
		String cowSpeak =cow.speak();
		String cowRun = cow.run();
		String cowEat = cow.eat();
		String turtleEat = turtle.eat();
		String turtleCrawl = turtle.crawl();
		String lizardEat = lizard.eat();
		String lizardCrawl = lizard.crawl();
		
		
		//print statements
		System.out.println("~::: Dog stats :::~ \n" + dogSpeak + "\n" + dogRun + "\n" + dogEat);
		System.out.println("------------------------\n");
		System.out.println("~::: Cat stats :::~ \n" + catSpeak + "\n" + catRun + "\n" + catEat);
		System.out.println("------------------------\n");
		System.out.println("~::: Cow stats :::~ \n" + cowSpeak + "\n" + cowRun + "\n" + cowEat);
		System.out.println("------------------------\n");
		System.out.println("~::: Turtle stats :::~ \n" + turtleEat + "\n" + turtleCrawl);
		System.out.println("------------------------\n");
		System.out.println("~::: Lizard stats :::~ \n" + lizardEat + "\n" + lizardCrawl);
		System.out.println("------------------------\n");
	}
}
