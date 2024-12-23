public class Dog extends Mammal{
    String anotherSomething;
    public Dog() {
        super();
    }

    public Dog(String name, int age, boolean gender, int height, int weight, String something,
               String anotherSomething) {
        super(name, age, gender, height, weight, something);
        this.anotherSomething = anotherSomething;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof-woof");;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nAnother something: " + anotherSomething;
    }

    public void walk() {
        System.out.println("walks");
    }
}
