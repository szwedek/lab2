package pl.edu.wsiz.components;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode
public abstract class Employee {

    protected String name;
    protected String surname;
    @ToString.Exclude
    protected Float salary;

    public abstract void Add(Employee o);
    public abstract void Remove(Employee o);
}
