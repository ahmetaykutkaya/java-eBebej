package EmployeeProject;

public class Runner {

    public static void main(String[] args) {
        Employee employee = new Employee("Aykut Kaya",10000,41,2000);
        System.out.println(employee.salary);
        System.out.println(employee.toString());

        Employee01 employee1 = new Employee01("Aykut Kaya",10000,41,2000);
        System.out.println(employee1.toString());
    }
}
