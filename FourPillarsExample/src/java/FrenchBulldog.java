//FrenchBulldog extends Dog, which is a form of Inheritance. It gets the previous
//methods without having to rewrite them.

//FrenchBulldog is also a subclass of Dog
public class FrenchBulldog extends Dog{
    public FrenchBulldog(){
        sound = "Rorf";
        name = "French Bulldog";
    }

    //This is an overloaded constructor, a form of Polymorphism
    public FrenchBulldog(String n){
        sound = "Rorf";
        name = n;
    }
}
