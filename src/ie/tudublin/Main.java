package ie.tudublin;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");

        // Animal a = new Animal();

        // Not Polymorphism
        Cat topcat = new Cat("Topcat");

        // Polymorphism
        Animal mino = new Cat("Mino");

        // Uses the speak() from Cat.java
        // A virtual method - dynamic binding
        mino.speak();

        // System.out.println(mino.getNumLives());
        // won't compile because the compiler doesn't
        //  know which class mino is because mino only
        //  gets instantiated when the code is run.
        // Example of castings
        System.out.println(((Cat)mino).getNumLives());

        // If the type is animal then the objects can 
        //  be either a cat or dog class
        mino = new Dog("Misty");
        // This will not compile because the type is Cat
        //topCat = new Dog("Tara");

        Animal a = new Cat("a");
        Animal b = new Cat("b");

        System.out.println(a);
        System.out.println(b);

        // primitive types : ints and floats
        //  would print c b
        // but prints c c because of object referencing
        //  a now points to b
        a = b;

        a.setName("c");

        System.out.println(a);
        System.out.println(b);
    }

}