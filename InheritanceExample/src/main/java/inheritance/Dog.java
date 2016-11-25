package main.java.inheritance;

public class Dog extends Animal {
    boolean doesBark;

	public Dog() {
		super();
		System.out.println("A new dog has been created!");
        height = 50;
        weight = 100;
        doesBark = false;
        name = "Dog";
    }
	
	@Override
	public void sleep() {
		System.out.println("A dog sleeps...");
	}
	
	@Override
	public void eat() {
		System.out.println("A dog eats...");
	}
}
