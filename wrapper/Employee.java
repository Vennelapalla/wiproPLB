public class Employee implements Cloneable {
    private int id;
    private String name;
    private double salary;

    // Constructor
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }

    // --- MAIN METHOD IS NOW INSIDE EMPLOYEE CLASS ---
    public static void main(String[] args) {
        try {
            Employee originalEmp = new Employee(101, "Alice", 75000.0);
            System.out.println("--- Original Employee (Before cloning) ---");
            System.out.println(originalEmp);

            Employee clonedEmp = (Employee) originalEmp.clone();
            System.out.println("\n--- Cloned Employee (Immediately after cloning) ---");
            System.out.println(clonedEmp);

            originalEmp.setId(102);
            originalEmp.setName("Bob");
            originalEmp.setSalary(90000.0);

            System.out.println("\n--- After modifying the ORIGINAL Employee ---");
            System.out.println("Original: " + originalEmp);
            System.out.println("Clone   : " + clonedEmp);

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported: " + e.getMessage());
        }
    }
}