import com.absoft.unit5.beans.*;

public class Runner {
    public static void main(String[] args) {
        var employee1 = new Employee("Alex", "", 1, "", 1, POSITION.JUNIOR);
//        System.out.println(employee1.getFirstName());
//        employee1.setFirstName("new First Name");
//        System.out.println(employee1.getFirstName());
//        System.out.println("*********");

//        var employee2 = new Employee();
//        employee2.setFirstName("John");
//        employee2.setLastName("Doe");
//        employee2.setAge(30);
//        employee2.setTeam("AQA");
//        employee2.setPosition(POSITION.JUNIOR);


        var employee3 = new Employee.Builder()
                .firstName("Ivan")
                .lastName("Ivanov")
                .age(20)
                .team("QA")
                .position(POSITION.MIDDLE)
                .build();

        System.out.println(employee3.getLastName());
        System.out.println(employee3.getPosition());
        System.out.println(employee3.getAge());
        System.out.println(employee3.getSalary());


        var singleton1 = SingletonExample.Instance;
        var singleton2 = SingletonExample.Instance;

        System.out.println(employee1 == employee3);
        System.out.println(singleton1 == singleton2);
        System.out.println("***********");

        var employee4 = EmployeeBuilderFactory.INSTANCE.buildEmployeeBuilder()
                .firstName("Ivan")
                .lastName("Ivanov")
                .age(25)
                .team("QA")
                .position(POSITION.MIDDLE)
                .build();

        System.out.println(employee4.getLastName());
        System.out.println(employee4.getPosition());
        System.out.println(employee4.getAge());
        System.out.println(employee4.getSalary());
        System.out.println(employee4.isIntern());

    }
}