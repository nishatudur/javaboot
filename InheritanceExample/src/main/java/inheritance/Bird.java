package main.java.inheritance;

public class Bird extends Animal {
    boolean doesSing;

	public Bird() {
		super();
		System.out.println("A new bird has been created!");
        height = 10;
        weight = 50;
        doesSing = true;
        name = "Bird";
    }
	
	@Override
	public void sleep() {
		System.out.println("A bird sleeps...");
	}
	
	@Override
	public void eat() {
		System.out.println("A bird eats...");
	}
}
