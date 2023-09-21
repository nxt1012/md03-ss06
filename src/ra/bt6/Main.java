package ra.bt6;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("RA0001", "Minh", 21, true, 3.66);
        employees[1] = new Employee("RA0002", "Nam", 22, true, 4.56);
        employees[2] = new Employee("RA0003", "Vân Anh", 23, false, 5.11);
        employees[3] = new Employee("RA0004", "Tiến", 24, true, 5.3);
        employees[4] = new Employee("RA0005", "Ánh", 25, false, 4.23);
        for (int i = 0; i < employees.length; i++) {
            employees[i].calSalary();
            employees[i].displayData();
        }
    }
}
