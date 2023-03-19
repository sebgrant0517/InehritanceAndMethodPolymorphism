//Dog class implements the Animal interface, and is inherited by FrenchBulldog.
//These are forms of Inheritance.

//Dog is the superclass of FrenchBulldog
public class Dog implements Animal{
    //These protected fields are a form of Abstraction and Encapsulation
    protected String sound;
    protected String name;
    public Dog(){
        sound = "Bark";
        name = "Dog";
    }

    //This is an overloaded constructor, a form of Polymorphism
    public Dog(String n){
        sound = "Bark";
        name = n;
    }

    //This is an overridden speak method, another form of Polymorphism
    @Override
    public String speak() {
        return sound;
    }
    //Every object has a toString method, since in Java it is inherited from the Object class.
    //That makes this an overridden method as well.
    public String toString(){
        return "This is a " + name +". It says " + sound +"!";
    }
}
