package pl.edu.wsiz;

import pl.edu.wsiz.components.Employee;
import pl.edu.wsiz.components.Manager;
import pl.edu.wsiz.components.Worker;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Employee comp = Worker.builder()
                .name("TEST")
                .surname("TestSur")
                .salary(1020F)
                .build();

        Employee work = Worker.builder()
                .name("TEST")
                .surname("TestSur")
                .salary(1020F)
                .build();

        Employee comp3 = Worker.builder()
                .name("TEST")
                .surname("TestSur")
                .salary(1020F)
                .build();

        Employee comp2 = Manager.builder()
                .name("TEST2")
                .surname("TESTSur2")
                .salary(2040F)
                .build();

        Employee comp4 = Manager.builder()
                .name("comp4")
                .surname("comp4")
                .salary(5040F)
                .build();

        Employee comp5 = Worker.builder()
                .name("comp5")
                .surname("comp5")
                .salary(60F)
                .build();

        comp2.Add(comp);
        comp2.Add(work);
        comp2.Add(comp3);

        comp2.Add(comp4);
        comp4.Add(comp5);

        System.out.println(comp2.getSalary());
        System.out.println(comp2);
        System.out.println(comp4);

        System.out.println();
        System.out.println();

        comp2.Remove(comp4);

        System.out.println(comp2);
        System.out.println(comp4);
    }
}