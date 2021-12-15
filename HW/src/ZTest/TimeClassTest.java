package ZTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeClassTest {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); //现在的日期
        System.out.println(today);
        LocalDate tomorrow = today.plusDays(-1); //今天之后的一天的日期
        System.out.println(tomorrow);
        LocalTime time = LocalTime.of(10,10,10,358); //设定时间
        System.out.println(time);
        LocalTime now = LocalTime.now(); //时间
        System.out.println(now);
        LocalDateTime atDate = now.atDate(today);  //日期+时间
        System.out.println(atDate);
        LocalDateTime dateTime = LocalDateTime.now(); //当前日期和时间
        System.out.println(dateTime);
    }
}
