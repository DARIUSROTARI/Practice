package main.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Student extends Persoana {

    private ArrayList<Double> note = new ArrayList<>();

    public Student(int age, String name, ArrayList<Double> note) {
        super(age, name);
        this.note = note;
    }

    public void adaugaNota(double nota) {
        note.add(nota);
    }

    @Override
    public void metodaAbstracta() {
        System.out.println("Hello from Student class !");
    }

    @Override
    public String toString() {
        return super.toString() + " " + note;
    }
}
