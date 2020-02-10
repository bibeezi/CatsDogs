package ie.tudublin;

public class Animal
{
    //every Animal has these attributes
    //local to the class
    private String name;

    // Constructor is the same name as the class
    // Can only create an Animal object if
    //  a name is passed (no default constructor now)
    // No return type
    public Animal(String name)
    {
        setName(name);
    }
    
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    //Polymorphism
    public void speak()
    {
        System.out.println("Animals can't speak!");
    }

    // ALWAYS
    // Converts a class into a string
    // Gets called automatically
    // Returns String
    public String toString()
    {
        return getName();
    }
}