package by.hoitan.springc;

public class Cat implements Pet{

    public Cat() {
        System.out.println("cat");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow");
    }
}
