import java.util.Optional;

class EmployeeDetails {
    private int id;
    private String name;

    EmployeeDetails(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Employee Id: " + id);
        System.out.println("Employee Name: " + name);
    }
}

class InvalidEmployeeException extends Exception {
    InvalidEmployeeException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {

        EmployeeDetails emp = null;   // Change to new EmployeeDetails(101, "Vennela") for valid output

        try {
            EmployeeDetails e = Optional.ofNullable(emp)
                    .orElseThrow(() -> new InvalidEmployeeException("Invalid Employee"));

            e.display();

        } catch (InvalidEmployeeException ex) {
            System.out.println(ex.getMessage());
        }
    }
}