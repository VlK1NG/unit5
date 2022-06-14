import com.absoft.unit5.beans.Employee;
import com.absoft.unit5.beans.EmployeeBuilder;
import com.absoft.unit5.beans.POSITION;

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


        var employee3 = new EmployeeBuilder()
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
    }
}