package basicsQuestions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class WorkingWithDateandTime {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println("date:"+date);
        LocalTime time=LocalTime.now();
        System.out.println("time:"+time);
        LocalDateTime dateTime=LocalDateTime.now();
        System.out.println("date and tim"+dateTime);
        /* Display the day of the month
          display the day of year
          display the week ,month name or its number

          E- nam of the day ( mon-sun)
          D- day of the year (1-366)
          dd- day of the month(1-31)
          M- month number(1-12)
          MMM- month name (jan-dec)
         */
        DateTimeFormatter formatter= DateTimeFormatter.ofPattern("D,MMM dd yyyy");
        String formatteddateandtime=dateTime.format(formatter);
        System.out.println("formatted date"+formatteddateandtime);
    }
}
