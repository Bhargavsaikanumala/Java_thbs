package hew;

public class Person {
	String name;
    int age;
 
    // Constructor
    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
 
    // Getter for name
    public String get_name() { return name; }
 
    // Setter for name
    public void change_name(String name)
    {
        this.name = name;
    }
 
    // Method to Print the Details of
    // the person
    public void printDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}