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

        Employee comp2 = Manager.builder()
                .name("TEST2")
                .surname("TESTSur2")
                .salary(2040F)
                .build();


        comp2.Add(comp);
        comp2.Add(work);

        System.out.println(comp2.getSalary());
        System.out.println(comp);
    }
}