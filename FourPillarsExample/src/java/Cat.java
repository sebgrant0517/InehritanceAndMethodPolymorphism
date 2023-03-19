public class Cat implements Animal{
    //These private fields are a form of Abstraction and Encapsulation
    private String sound;
    private String name;
    public Cat(){
        sound = "Meow";
        name = "Cat";
    }

    //This is an overloaded constructor, a form of Polymorphism
    public Cat(String n){
        sound = "Meow";
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
