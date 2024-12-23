public class Mammal extends Animal {
    private String something;

    public Mammal() {
        super(); //calls no arg constructor from superclass
    }

    public Mammal(String name, int age, boolean gender, int height, int weight, String something) {
        super(name, age, gender, height, weight); // calls parametrized constructor from super class
        this.something = something;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nSomething: " + something;
    }
}
