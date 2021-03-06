import java.util.Comparator;

public class Person
{

    private String name;
    private int age;
    private int weight;
    private int rost;

    public Person(String name, int age, int weight, int rost) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.rost = rost;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getRost() {
        return rost;
    }

    public void setRost(int rost) {
        this.rost = rost;
    }
}
