import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //Polymorphism and Inheritance allow me to create a list of animals
        //This can include both cats and dogs
        List<Animal> pets = new ArrayList<>();
        pets.add(new Cat());
        pets.add(new Dog());
        pets.add(new FrenchBulldog());
        //Overloaded constructor for Cat is called, allowing me to change its name to Kitty
        pets.add(new Cat("Kitty"));
        for(Animal a : pets){
            System.out.println(a.toString());
            System.out.println(a.speak());
        }
    }
}
