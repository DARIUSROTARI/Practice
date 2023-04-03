package main;

import main.example.Persoana;
import main.example.Student;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Double> note = new ArrayList<>();
        note.add(10.0);
        note.add(10.0);
        note.add(10.0);
        Persoana persoana = new Student(20, "Stefan-Lucian Done", note);

        System.out.println("Diferenta fata de primul commit");
        System.out.println(persoana);
    }
}