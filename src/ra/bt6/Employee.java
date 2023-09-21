package ra.bt6;

public class Employee {
    String employeeId;
    String employeeName;
    int age;
    boolean gen;
    double rate;
    double salary;

    public Employee() {
    }

    public Employee(String employeeId, String employeeName, int age, boolean gen, double rate) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
    }

    public void displayData(){
        String gender = gen ? "Nam" : "Nữ";
        System.out.printf("Nhân viên số hiệu %s có tên %-7s, %-3d tuổi, giới tính %-3s, hệ số lương %-4.2f, mức lương hiện tại là %-10.2f.\n", employeeId, employeeName, age, gender, rate, salary);
    }
    public void inputData(String employeeId,String employeeName, int age, boolean gen, double rate){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.age = age;
        this.gen = gen;
        this.rate = rate;
    }
    public void calSalary(){
        this.salary = this.rate * 1300000;
    }
}
