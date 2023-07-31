package javabasics._11;
/*
Create a Java class called Programmer
The Programmer class will have the following instance variables:
name as a string
age as an integer
wearsGlasses as a boolean
The Programmer class will have the following methods:
drinkCoffe() - that prints in console Espresso is the secret!
printDetails() - that prints in console NameHere is a AgeHere-yo programmer
hasGlasses - that prints in console Is NameHere wearing glasses? followed by the value of the dedicated variable
create a Java tester class called TestProgrammers where you:
create 2 Programmer objects (class instance)
define the state of the objects by assigning values to the instance variables
call the drinkCoffee() and printDetails() methods for the first Programmer object
call the printDetails() and hasGlasses() methods for the second Programmer object
 */
public class Programmer {
    private String name;
    private int age;
    private boolean wearsGlasses;
    public Programmer(String name, int age, boolean wearsGlasses) {
        this.name = name;
        this.age = age;
        this.wearsGlasses = wearsGlasses;
    }
    public void drinkCofee(){
        System.out.println("Espresso is the secret!");
    }

    public void printdetails(){
        System.out.println(name + " is a " + age + "-yo programmer");
    }

    public void hasGlasses(){
        System.out.println("Is " + name + " wearing glasses? " + wearsGlasses);
    }
}
