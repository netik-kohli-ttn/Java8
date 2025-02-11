import java.util.*;
import java.time.*;

public class TimeDateAPI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter dates in (yyyy-mm-dd) \n");
        System.out.println("First Date: ");
        LocalDate fDate = LocalDate.parse(in.nextLine());
        System.out.println("Second Date: ");
        LocalDate sDate = LocalDate.parse(in.nextLine());

        if(fDate.isBefore(sDate))
            System.out.println("First date come before second");
        else if(fDate.isAfter(sDate))
            System.out.println("First date come after second");

        System.out.println("Current Date and Time: " + LocalDateTime.now());

        System.out.println(ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Asia/Kolkata")));
        System.out.println(ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("America/Los_Angeles")));
        System.out.println(ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Paris")));
    }
}
