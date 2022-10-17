package EmployeeProject;

public class Employee01 {


    public static String name;
    public static double salary;
    public static double workHours;
    public static int hireYear;


    public Employee01(String name, int salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    public static double tax() {

        double paymentOfTax = 0;

        if (salary < 1000) {
            paymentOfTax = paymentOfTax + 0;
        } else {
            paymentOfTax = salary * 0.03;
        }

        return paymentOfTax;

    }
    public static double bonus() {

        double paymentOfBonus = 0;
        int additionalBonus = 30;

        if (workHours > 40) {
            paymentOfBonus = (workHours - 40) * additionalBonus;
        }

        return paymentOfBonus;
    }

    public static String raiseSalary() {

        int timeOfYear = 2021;
        int sumOfYear = timeOfYear - hireYear;
        double allOfSalary = salary;

        if (sumOfYear <= 9) {
            salary = (salary * 0.05);
            allOfSalary = allOfSalary + salary + bonus() - tax();
        } else if (10 <= sumOfYear && sumOfYear < 19) {
            salary = salary * 0.1;
            allOfSalary = allOfSalary + salary + bonus() - tax();
        } else {
            salary = salary * 0.15;
            allOfSalary = allOfSalary + salary + bonus() - tax();
        }

        return "Raise Salary: " + salary + " All of Salary: " + allOfSalary;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                ", tax=" + tax() +
                ", bonus=" + bonus() +
                ", " + raiseSalary() +
                '}';
    }



}





