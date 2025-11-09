package in.Kgcoding.Challenge79;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Shameem",21,45000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Shaam");
        System.out.println(emp.getEmployeeDetails());
    }
}
