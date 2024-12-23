public class Animal {
    private static int id = 1;
    private int id_gen;
    private String name;
    private int age;
    private boolean gender;
    private int height;
    private int weight;

    public Animal() {
        this.id_gen = id++;
    }

    public Animal(String name, int age, boolean gender, int height, int weight) {
        this();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getId_gen() {
        return id_gen;
    }

    public void eat(){
        System.out.println("Animal eats unknown food");
    }

    public void sleep(){
        System.out.println("Animal sleeps");
    }

    public void makeSound(){
        System.out.println("Animal makes unknown sound");
    }

    @Override
    public String toString() {
        return "ID: " + id_gen +
                "\nName: " + name +
                "\nAge: " + age +
                "\nGender: " + (gender ? "male" : "female") +
                "\nHeight: " + height +
                "\nWeight: " + weight;
    }
}
