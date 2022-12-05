package SalaryCalculator;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Duha", 2000, 45, 2019);
        e1.Tax();
        e1.raiseSalary();
        e1.Bonus();
        e1.employeeInfo();
    }
}
