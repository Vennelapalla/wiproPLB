import java.util.ArrayList;
 class Employee {
    int empId;
    String empName; 
    String email;
    String gender;
    float salary;
    public Employee(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    } 
    public void GetEmployeeDetails() {
        System.out.println("EmpId: " + empId + ", Name: " + empName + 
                           ", Email: " + email + ", Gender: " + gender + 
                           ", Salary: " + salary);
    }
    public static void main(String[] args) {
        EmployeeDB db = new EmployeeDB();
        Employee emp1 = new Employee(101, "Alice Smith", "alice@company.com", "Female", 5000.0f);
        Employee emp2 = new Employee(102, "Bob Jones", "bob@company.com", "Male", 6000.0f);
        System.out.println("Adding Alice: " + db.addEmployee(emp1));
        System.out.println("Adding Bob: " + db.addEmployee(emp2));
        System.out.println("\n--- Displaying Employee Details ---");
        emp1.GetEmployeeDetails();
        emp2.GetEmployeeDetails();
        System.out.println("\n" + db.showPaySlip(101));
        System.out.println("\nDeleting Employee 101: " + db.deleteEmployee(101));
        System.out.println(db.showPaySlip(101));
    }
}
class EmployeeDB {
    ArrayList<Employee> list = new ArrayList<>();

    public boolean addEmployee(Employee e) {
        return list.add(e);
    }

    public boolean deleteEmployee(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                list.remove(e);
                return true; 
            }
        }
        return false;
    }
    public String showPaySlip(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                return "--- PAYSLIP FOR ID: " + e.empId + " ---\n" +
                       "Name: " + e.empName + "\n" +
                       "Monthly Salary: $" + e.salary;
            }
        }
        return "Employee with ID " + empId + " not found.";
    }
}
