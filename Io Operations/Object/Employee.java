import java.util.Date;
import java.text.SimpleDateFormat; 
import java.text.ParseException;   
class Employee {
    private String name;
    private String department;
    private Date dateOfBirth; 
    private String designation;
    private double salary;
    public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }
      public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    public Date getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(Date dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public String getDesignation() { return designation; }
    public void setDesignation(String designation) { this.designation = designation; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date dob = null;
        try {
            dob = dateFormat.parse("1995-08-15");
        } catch (ParseException e) {
            System.out.println("Error parsing date: " + e.getMessage());
        }
        Employee emp = new Employee("Alex Mercer", dob, "IT Department", "Software Engineer", 75000.50);
        System.out.println("--- Employee Details ---");
        System.out.println("Name: " + emp.getName());
        System.out.println("DOB: " + (emp.getDateOfBirth() != null ? dateFormat.format(emp.getDateOfBirth()) : "N/A"));
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Designation: " + emp.getDesignation());
        System.out.println("Salary: $" + emp.getSalary());
    }
}
