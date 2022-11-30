package pl.edu.wsiz.components;

import lombok.*;
import lombok.experimental.SuperBuilder;

public interface Employee {
    void Add(Employee o);
    void Remove(Employee o);

    Float getSalary();
}
