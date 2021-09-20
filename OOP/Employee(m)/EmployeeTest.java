public class EmployeeTest {

    public static void main(String[] args) {

        double monthlySalarye1 = IBIO.inputDouble("Enter monthly Salary for employee 1: ");
        double monthlySalarye2 = IBIO.inputDouble("Enter monthly Salary for employee 2: ");
        int year = 12;

        Employee employee1 = new Employee("James", "Daniel", monthlySalarye1);
        Employee employee2 = new Employee("Daniel", "Harrison", monthlySalarye2);

        System.out.println(employee1.getMonthlySalary() * year);
        System.out.println(employee2.getMonthlySalary() * year);

        employee1.setMonthlySalary(monthlySalarye1 + (0.1 * monthlySalarye1));
        employee2.setMonthlySalary(monthlySalarye2 + (0.1 * monthlySalarye2));

        System.out.println(employee1.getMonthlySalary() * year);
        System.out.println(employee2.getMonthlySalary() * year);

    }

}
