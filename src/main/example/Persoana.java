package main.example;

public abstract class Persoana {
    protected int age = 0;
    protected String name = "";

    public Persoana(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void metodaAbstracta();

    @Override
    public String toString() {
        return name + " " + age;
    }
}
