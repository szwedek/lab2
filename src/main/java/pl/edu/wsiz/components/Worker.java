package pl.edu.wsiz.components;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@Builder
@ToString
public class Worker implements Employee {

    protected String name;
    protected String surname;
    protected Float salary;
    @Override
    public void Add(Employee o) {
    }

    @Override
    public void Remove(Employee o) {

    }
}
