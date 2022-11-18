package pl.edu.wsiz.components;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@SuperBuilder
@ToString(callSuper=true)
public class Manager extends Employee {
    private final List<Employee> workers = new ArrayList<>();

    @Override
    public void Add(Employee o) {
        workers.add(o);
    }

    @Override
    public void Remove(Employee o) {

    }

    @Override
    public Float getSalary() {
        Double workerSalary = workers.stream()
                .map( w -> w.getSalary())
                .mapToDouble(Float::doubleValue)
                .sum();

        return Float.valueOf(workerSalary.floatValue()) + this.salary;
    }
}
