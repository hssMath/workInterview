package ZTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeClassTest {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); //���ڵ�����
        System.out.println(today);
        LocalDate tomorrow = today.plusDays(-1); //����֮���һ�������
        System.out.println(tomorrow);
        LocalTime time = LocalTime.of(10,10,10,358); //�趨ʱ��
        System.out.println(time);
        LocalTime now = LocalTime.now(); //ʱ��
        System.out.println(now);
        LocalDateTime atDate = now.atDate(today);  //����+ʱ��
        System.out.println(atDate);
        LocalDateTime dateTime = LocalDateTime.now(); //��ǰ���ں�ʱ��
        System.out.println(dateTime);
    }
}
