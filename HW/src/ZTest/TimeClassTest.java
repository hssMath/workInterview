package ZTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeClassTest {
    public static void main(String[] args) {
//        LocalDate today = LocalDate.now(); //现在的日期
//        System.out.println(today);
//        LocalDate tomorrow = today.plusDays(-1); //今天之后的一天的日期
//        System.out.println(tomorrow);
//        LocalTime time = LocalTime.of(10,10,10,358); //设定时间
//        System.out.println(time);
//        LocalTime now = LocalTime.now(); //时间
//        System.out.println(now);
//        LocalDateTime atDate = now.atDate(today);  //日期+时间
//        System.out.println(atDate);
//        LocalDateTime dateTime = LocalDateTime.now(); //当前日期和时间
//        System.out.println(dateTime);

        //获取当前时间
        LocalDateTime nowTime= LocalDateTime.now();
        System.out.println(nowTime);
        //自定义时间
        LocalDateTime endTime = LocalDateTime.of(2017, 10, 22, 10, 10, 10);
        System.out.println(endTime);
        //比较  现在的时间 比 设定的时间 之前  返回的类型是Boolean类型
        System.out.println(nowTime.isAfter(endTime));
        //比较   现在的时间 比 设定的时间 之后  返回的类型是Boolean类型
        System.out.println(nowTime.isBefore(endTime));
        //比较   现在的时间 和 设定的时候  相等  返回类型是Boolean类型
//        System.out.println(nowTime.equals(endTime));
    }
}
