import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>();

        Dog dog = new Dog("Rex", 5, true, 15, 25, "something",
                "anotherSomething");
        animals.add(dog);
        Mammal mammal = new Mammal("unknownMammal", 3, false, 10, 15,
                "something");
        animals.add(mammal);
        Animal animal = new Animal("unknownAnimal", 2, true, 5, 10);

        animals.add(animal);

        for (Animal a : animals) {
            System.out.println(a);
            if (a instanceof Dog) {
                ((Dog) a).walk();
            }
        }
    }
}