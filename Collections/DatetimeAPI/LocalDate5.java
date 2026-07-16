import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class LocalDate5{
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        LocalTime futureTime = currentTime.plusMinutes(25);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Current Time:      " + currentTime.format(formatter));
        System.out.println("Time after 25 min: " + futureTime.format(formatter));
    }
}
