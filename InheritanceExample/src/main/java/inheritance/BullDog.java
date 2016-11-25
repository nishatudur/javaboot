package main.java.inheritance;

public class BullDog extends Dog {

    public BullDog() {
        super();
        System.out.println("A new BUL dog has been created!");
        height = 20;
        weight = 300;
        doesBark = true;
        name = "BullDog";
    }

    @Override
    public void sleep() {
        System.out.println("A bull dog sleeps...");
    }

    @Override
    public void eat() {
        System.out.println("A bull dog eats...");
    }
}
