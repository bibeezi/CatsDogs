package ie.tudublin;

// Cat is a subclass of the Animal class
public class Cat extends Animal
{
    private int numLives;

    public Cat(String name)
    {
        // Constructor chaining
        // Constructing the Cat and the Animal
        super(name);
        setNumLives = 9;
    }

    public int getNumLives() {
        return numLives;
    }

    public void setNumLives(int numLives) {
        this.numLives = numLives;
    }

    public void speak()
    {
        System.out.println("Meow =^.^=");
    }
}