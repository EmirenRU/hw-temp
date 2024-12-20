package ru.emiren.drools.model;

import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//@AllArgsConstructor
//@NoArgsConstructor
@Getter
@Setter
@Data
public class Computer {
    private String type;
    private String func;
    private List<String> tests = new ArrayList<>();
    private LocalDate productionDate;
    private LocalDate testDeadline;

    public Computer(String type, String function, LocalDate productionDate) {
        this.type = type;
        this.func = function;
        this.productionDate = productionDate;
    }

    @Override
    public String toString() {
        return "Computer with type: " + type
                + ", func: " + func
                + ", productionDate: " + productionDate
                + ", testDeadline: " + testDeadline
                + ", tests: " + tests;
    }
}
