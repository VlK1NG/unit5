package com.absoft.unit5.beans;

public class EmployeeBuilderFactory {
    public static final EmployeeBuilderFactory INSTANCE = new EmployeeBuilderFactory();

    private EmployeeBuilderFactory() {

    }

    public AbstractEmployeeBuilder buildEmployeeBuilder() {
        return new Employee.Builder();
    }
}
