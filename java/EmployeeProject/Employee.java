package EmployeeProject;

public class Employee {


    public String name;
    public double salary;
    public double workHours;
    public int hireYear;


    public Employee(String name, int salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    public static double tax(double salary) {

        double paymentOfTax = 0;

        if (salary < 1000) {
            paymentOfTax = paymentOfTax + 0;
        } else {
            paymentOfTax = salary * 0.03;
        }

        return paymentOfTax;

    }


    public static double bonus(double workHours) {

        double paymentOfBonus = 0;
        int additionalBonus = 30;

        if (workHours > 40) {
            paymentOfBonus = (workHours - 40) * additionalBonus;
        }

        return paymentOfBonus;
    }

    public static String raiseSalary(int hireYear, double salary, double workHours) {

        int timeOfYear = 2021;
        int sumOfYear = timeOfYear - hireYear;
        double allOfSalary = salary;

        if (sumOfYear <= 9) {
            salary = (salary * 0.05);
            allOfSalary = allOfSalary + salary + bonus(workHours) - tax(salary);
        } else if (10 <= sumOfYear && sumOfYear < 19) {
            salary = salary * 0.1;
            allOfSalary = allOfSalary + salary + bonus(workHours) - tax(salary);
        } else {
            salary = salary * 0.15;
            allOfSalary = allOfSalary + salary + bonus(workHours) - tax(salary);
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
                ", tax=" + tax(salary) +
                ", bonus=" + bonus(workHours) +
                ", " + raiseSalary(hireYear, salary, workHours) +
                '}';
    }
}





