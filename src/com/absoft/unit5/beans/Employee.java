package com.absoft.unit5.beans;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private String team;
    private long salary;
    private POSITION position;

//    public Employee() {
//
//    }

    public Employee(String firstName, String lastName, int age, String team, POSITION position) {
        this(firstName, lastName, age, team, 0, position);
    }

    public Employee(String firstName, String lastName, int age, String team, long salary, POSITION position) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.team = team;

        if (salary == 0) {
            salary = position.minSalary;
        } //валидация должна быть в конструкторе или принтер-классе?
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

//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

//   public void setLastName(String lastName) {
//       this.lastName = lastName;
//   }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }

    public String getTeam() {
        return team;
    }

//    public void setTeam(String team) {
//        this.team = team;
//    }

    public long getSalary() {
        return salary;
    }

//    public void setSalary(long salary) {
//        this.salary = salary;
//    }

    public POSITION getPosition() {
        return position;
    }

//    public void setPosition(POSITION position) {
//        this.position = position;
//    }

    public static class Builder {
        private String firstName;
        private String lastName;
        private int age;
        private String team;
        private long salary;
        private POSITION position;

        public Builder firstName(String firstName){
            this.firstName=firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName=lastName;
            return this;
        }

        public Builder age(int age){
            this.age =age;
            return this;
        }

        public Builder team(String team){
            this.team =team;
            return this;
        }

        public Builder salary(long salary){
            this.salary =salary;
            return this;
        }

        public Builder position(POSITION position){
            this.position =position;
            return this;
        }


        public Employee build(){
            return new Employee(firstName,lastName,age,team,salary,position);
        }
    }
}