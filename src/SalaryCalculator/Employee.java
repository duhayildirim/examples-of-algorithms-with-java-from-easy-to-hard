package SalaryCalculator;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    void Tax() {
        if (this.salary > 1000) {
            double tax = this.salary % 3;
            this.salary = this.salary + tax;
        }
    }

    void Bonus() {
        if (workHours > 40) {
            int bonus = workHours - 40;
            this.salary += (bonus * 30);
        }
    }

    void raiseSalary() {
        int diff = 2021 - hireYear;
        double extra;
        if (diff < 10) {
            extra = this.salary % 3;
            this.salary += extra;
        } else if (diff < 20) {
            extra = this.salary % 10;
            this.salary += extra;
        } else {
            extra = this.salary % 15;
            this.salary += extra;
        }
    }

    void employeeInfo(){
        System.out.println(this.name);
        System.out.println(this.salary);
        System.out.println(this.workHours);
        System.out.println(this.hireYear);
    }
}
