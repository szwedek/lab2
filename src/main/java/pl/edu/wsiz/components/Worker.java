package pl.edu.wsiz.components;

import lombok.Data;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@ToString(callSuper=true)
public class Worker extends Employee {

    @Override
    public void Add(Employee o) {
    }

    @Override
    public void Remove(Employee o) {

    }
}
