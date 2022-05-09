package Aapplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 免单统计
 * 题目描述
 * 某商城举办了一个促销活动，如果某顾客是某一秒内早时刻下单的顾客（可能是多个人），则可以 获取免单。请你编程计算有多少顾客可以获取免单。
 * 解答要求 时间限制：3000ms, 内存限制：64MB 输入 输入为n行数据，每一行表示一位顾客的下单时间。 以（年-月-日 时-分-秒.毫秒）yyyy-MM-dd HH:mm:ss.ﬀf形式给出。
 *
 * 0<n<50000 2000<yyyy<2020 0<MM<=12 0<dd<=28 0<=HH<=23 0<=mm<=59 0<=ss<=59 0<=ﬀf<=999 所有输 入保证合法。
 * 输出 输出一个整数，表示有多少顾客可以获取免单。
 * 样例：
 * 输入样例1
 * 2019-01-01 00:00:00.001
 * 2019-01-01 00:00:00.002
 * 2019-01-01 00:00:00.003
 * 输出样例1
 * 1
 * 输入样例2
 * 2019-01-01 08:59:00.123
 * 2019-01-01 08:59:00.123
 * 2018-12-28 10:08:00.999
 * 输出样例2
 * 3
 * 原文链接：https://blog.csdn.net/liub112/article/details/103312168/
 */
public class A1_FreeOrderStatistics {
    private static final Integer N = 50000;

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> topDates = new ArrayList<>();
        topDates.add("2019-01-01 08:59:00.123");
        topDates.add("2019-01-01 08:59:00.123");
        topDates.add("2019-01-01 08:59:00.152");
        topDates.add("2019-01-01 08:59:00.245");
        topDates.add("2018-12-28 10:08:00.221");
        topDates.add("2018-12-28 10:08:00.234");
        topDates.add("2018-12-28 10:08:00.999");
        topDates.add("2018-12-28 13:08:00.444");
        topDates.add("2018-12-28 13:08:00.444");
        topDates.add("2018-12-28 13:08:00.562");
        topDates.add("2018-12-28 13:08:00.652");
        Integer topUserNum = doGetTopUserNum(topDates);
        System.out.println(topUserNum);
        in.close();
    }

    /**
     * 获取最终免单的人数
     * @param topDates
     * @return
     */
    public static Integer doGetTopUserNum(List<String> topDates) {
        Integer topUser = 0;
        Map<String, String> map = new HashMap<>();
        if (topDates != null && topDates.size() != 0) {
            for (String topDate : topDates) {
                String[] dateAndSec = topDate.split("\\.");
                String pre = dateAndSec[0];
                String suf = dateAndSec[1];
                putMinValueToMap(pre, suf, map);
            }
            //如果某顾客是某一秒内早时刻下单的顾客（可能是多个人）
            for (Map.Entry entry : map.entrySet()) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(entry.getKey()).append(".").append(entry.getValue());
                for (int i = 0; i < topDates.size(); i++) {
                    if (stringBuffer.toString().equals(topDates.get(i))) {
                        topUser++;
                    }
                }
            }

        }
        return topUser;
    }

    /**
     * 录入日期校验
     * @param date
     * @return
     */
    public static boolean validateDate(String date) {
        Boolean validate = true;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        try {
            simpleDateFormat.parse(date);
        } catch (ParseException e) {
            validate = false;
        }
        return validate;
    }

    /**
     * 用map存放每s最小数据:    key是datePreFix，value是datesufFix。
     */
    public static void putMinValueToMap(String datePreFix, String datesufFix, Map<String, String> map) {
        Integer value = map.get(datePreFix) == null ? null : Integer.valueOf(map.get(datePreFix));
        if (value == null) {
            map.put(datePreFix, datesufFix);
        } else if (value.intValue() > Integer.valueOf(datesufFix).intValue()) {
            map.put(datePreFix, datesufFix);
        }
    }
}