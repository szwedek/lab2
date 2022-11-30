package pl.edu.wsiz.components;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@ToString
public class Manager implements Employee {
    protected String name;
    protected String surname;
    protected Float salary;
    private final List<Employee> workers = new ArrayList<>();

    @Override
    public void Add(Employee o) {
        workers.add(o);
    }

    @Override
    public void Remove(Employee o) {
        if(o instanceof Manager){
            workers.addAll(((Manager) o).getWorkers());
        }
        workers.remove(o);
    }

    public Float getSalary() {
        Double workerSalary = workers.stream()
                .map( w -> w.getSalary())
                .mapToDouble(Float::doubleValue)
                .sum();

        return Float.valueOf(workerSalary.floatValue()) + this.salary;
    }
}
