package com.absoft.unit5;

public class Employee {
    public String firstName;
    public String lastName;
    public int age;
    public String team;
    public long salary;
    public POSITION position;

    public Employee(String firstName, String lastName, int age, String team, POSITION position) {
        this(firstName, lastName, age, team, 0, position);
    }

    public Employee(String firstName, String lastName, int age, String team, long salary, POSITION position) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.team = team;

        if (salary == 0) {salary=position.minSalary;} //валидация должна быть в конструкторе или принтер-классе?
//            switch (position) {
//                case JUNIOR:
//                    salary = 5000;
//                    break;
//                case MIDDLE:
//                    salary = 10000;
//                    break;
//                case SENIOR:
//                    salary = 20000;
//                    break;
//                default:
//                    salary = -10000;
//            }
//        }

        this.salary = salary;
        this.position = position;
    }
}