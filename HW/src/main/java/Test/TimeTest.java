package Test;

//��ʽ������ String-->Date ���� Data-->String
//
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        Date date = sdf.parse("2009-11-04");//String-->Date
//
//        String sdate = sdf.format(date );// Data-->String ===============================================================
import java.text.DateFormat;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class TimeTest {
    //����ȫ�ֿ��� ��һ�ܣ����ܣ���һ�ܵ������仯
    private int weeks = 0;
    private int MaxDate;//һ���������
    private int MaxYear;//һ���������

    /**
     * @param args
     */
    public static void main(String[] args) {
        TimeTest tt = new TimeTest();

        System.out.println("�õ�6���º������:" + tt.getAfterMonth(6));
        System.out.println("��ȡ��������:" + tt.getNowTime("yyyy-MM-dd"));
        System.out.println("��ȡ����һ����:" + tt.getMondayOFWeek());
        System.out.println("��ȡ�����յ�����~:" + tt.getCurrentWeekday());
        System.out.println("��ȡ����һ����:" + tt.getPreviousWeekday());
        System.out.println("��ȡ����������:" + tt.getPreviousWeekSunday());
        System.out.println("��ȡ����һ����:" + tt.getNextMonday());
        System.out.println("��ȡ����������:" + tt.getNextSunday());
        System.out.println("�����Ӧ�ܵ�����:" + tt.getNowTime("yyyy-MM-dd"));
        System.out.println("��ȡ���µ�һ������:" + tt.getFirstDayOfMonth());
        System.out.println("��ȡ�������һ������:" + tt.getDefaultDay());
        System.out.println("��ȡ���µ�һ������:" + tt.getPreviousMonthFirst());
        System.out.println("��ȡ�������һ�������:" + tt.getPreviousMonthEnd());
        System.out.println("��ȡ���µ�һ������:" + tt.getNextMonthFirst());
        System.out.println("��ȡ�������һ������:" + tt.getNextMonthEnd());
        System.out.println("��ȡ����ĵ�һ������:" + tt.getCurrentYearFirst());
        System.out.println("��ȡ�������һ������:" + tt.getCurrentYearEnd());

        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
//        new Date(t.getTime());
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");//���Է�����޸����ڸ�ʽ
        String years = dateFormat.format(date)+ "-12-31 00:00:00";
        System.out.println(LocalDateTime.parse(years,df));

        System.out.println("��ȡȥ��ĵ�һ������:" + tt.getPreviousYearFirst());
        System.out.println("��ȡȥ������һ������:" + tt.getPreviousYearEnd());
        System.out.println("��ȡ�����һ������:" + tt.getNextYearFirst());
        System.out.println("��ȡ�������һ������:" + tt.getNextYearEnd());
        System.out.println("��ȡ�����ȵ�һ�쵽���һ��:" + tt.getThisSeasonTime(11));
        System.out.println("��ȡ��������֮��������2008-12-1~2008-.29:" + TimeTest.getTwoDay("2008-12-1", "2008-9-29"));
    }

    /**
     * �õ�ָ���º�ǰ�������� ��������������
     */

    public static String getAfterMonth(int month) {
        Calendar c = Calendar.getInstance();//���һ��������ʵ��
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse("2009-11-04");//��ʼ����
        } catch (Exception e) {

        }
        c.setTime(date);//��������ʱ��
        c.add(Calendar.MONTH, month);//���������·�������6����
        String strDate = sdf.format(c.getTime());//�ĵ�����Ҫ��6���º������
        return strDate;

    }


    /**
     * �õ��������ڼ�ļ������
     */
    public static String getTwoDay(String sj1, String sj2) {
        SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
        long day = 0;
        try {
            java.util.Date date = myFormatter.parse(sj1);
            java.util.Date mydate = myFormatter.parse(sj2);
            day = (date.getTime() - mydate.getTime()) / (24 * 60 * 60 * 1000);
        } catch (Exception e) {
            return "";
        }
        return day + "";
    }

    /**
     * ����һ�����ڣ����������ڼ����ַ���
     */
    public static String getWeek(String sdate) {
// ��ת��Ϊʱ��
        Date date = TimeTest.strToDate(sdate);
        Calendar c = Calendar.getInstance();
        c.setTime(date);
// int hour=c.get(Calendar.DAY_OF_WEEK);
// hour �д�ľ������ڼ��ˣ��䷶Χ 1~7
// 1=������ 7=����������������
        return new SimpleDateFormat("EEEE").format(c.getTime());
    }

    /**
     * ����ʱ���ʽ�ַ���ת��Ϊʱ�� yyyy-MM-dd
     */
    public static Date strToDate(String strDate) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        ParsePosition pos = new ParsePosition(0);
        Date strtodate = formatter.parse(strDate, pos);
        return strtodate;
    }

    /**
     * ����ʱ��֮�������
     *
     * @param date1
     * @param date2
     * @return
     */
    public static long getDays(String date1, String date2) {
        if (date1 == null || date1.equals(""))
            return 0;
        if (date2 == null || date2.equals(""))
            return 0;
// ת��Ϊ��׼ʱ��
        SimpleDateFormat myFormatter = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date date = null;
        java.util.Date mydate = null;
        try {
            date = myFormatter.parse(date1);
            mydate = myFormatter.parse(date2);
        } catch (Exception e) {
        }
        long day = (date.getTime() - mydate.getTime()) / (24 * 60 * 60 * 1000);
        return day;
    }

    // ���㵱�����һ��,�����ַ���
    public String getDefaultDay() {
        String str = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar lastDate = Calendar.getInstance();
        lastDate.set(Calendar.DATE, 1);//��Ϊ��ǰ�µ�1 ��
        lastDate.add(Calendar.MONTH, 1);//��һ���£���Ϊ���µ�1 ��
        lastDate.add(Calendar.DATE, -1);//��ȥһ�죬��Ϊ�������һ��
        str = sdf.format(lastDate.getTime());
        return str;
    }

    // ���µ�һ��
    public String getPreviousMonthFirst() {
        String str = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar lastDate = Calendar.getInstance();
        lastDate.set(Calendar.DATE, 1);//��Ϊ��ǰ�µ�1 ��
        lastDate.add(Calendar.MONTH, -1);//��һ���£���Ϊ���µ�1 ��
//lastDate.add(Calendar.DATE,-1);//��ȥһ�죬��Ϊ�������һ��
        str = sdf.format(lastDate.getTime());
        return str;
    }

    //��ȡ���µ�һ��
    public String getFirstDayOfMonth() {
        String str = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar lastDate = Calendar.getInstance();
        lastDate.set(Calendar.DATE, 1);//��Ϊ��ǰ�µ�1 ��
        str = sdf.format(lastDate.getTime());
        return str;
    }

    // ��ñ��������յ�����
    public String getCurrentWeekday() {
        weeks = 0;
        int mondayPlus = this.getMondayPlus();
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.add(GregorianCalendar.DATE, mondayPlus + 6);
        Date monday = currentDate.getTime();
        DateFormat df = DateFormat.getDateInstance();
        String preMonday = df.format(monday);
        return preMonday;
    }

    //��ȡ����ʱ��
    public String getNowTime(String dateformat) {
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat(dateformat);//���Է�����޸����ڸ�ʽ
        String hehe = dateFormat.format(now);
        return hehe;
    }

    // ��õ�ǰ�����뱾������������
    private int getMondayPlus() {
        Calendar cd = Calendar.getInstance();
// ��ý�����һ�ܵĵڼ��죬�������ǵ�һ�죬���ڶ��ǵڶ���......
        int dayOfWeek = cd.get(Calendar.DAY_OF_WEEK) - 1; //��Ϊ���й����һ��Ϊ��һ�����������1
        if (dayOfWeek == 1) {
            return 0;
        } else {
            return 1 - dayOfWeek;
        }
    }

    //��ñ���һ������
    public String getMondayOFWeek() {
        weeks = 0;
        int mondayPlus = this.getMondayPlus();
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.add(GregorianCalendar.DATE, mondayPlus);
        Date monday = currentDate.getTime();
        DateFormat df = DateFormat.getDateInstance();
        String preMonday = df.format(monday);
        return preMonday;
    }

    //�����Ӧ�ܵ�����������
    public String getSaturday() {
        int mondayPlus = this.getMondayPlus();
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.add(GregorianCalendar.DATE, mondayPlus + 7 * weeks + 6);
        Date monday = currentDate.getTime();
        DateFormat df = DateFormat.getDateInstance();
        String preMonday = df.format(monday);
        return preMonday;
    }

    // ������������յ�����
    public String getPreviousWeekSunday() {
        weeks = 0;
        weeks--;
        int mondayPlus = this.getMondayPlus();
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.add(GregorianCalendar.DATE, mondayPlus + weeks);
        Date monday = currentDate.getTime();
        DateFormat df = DateFormat.getDateInstance();
        String preMonday = df.format(monday);
        return preMonday;
    }

    // �����������һ������
    public String getPreviousWeekday() {
        weeks--;
        int mondayPlus = this.getMondayPlus();
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.add(GregorianCalendar.DATE, mondayPlus + 7 * weeks);
        Date monday = currentDate.getTime();
        DateFormat df = DateFormat.getDateInstance();
        String preMonday = df.format(monday);
        return preMonday;
    }

    // �����������һ������
    public String getNextMonday() {
        weeks++;
        int mondayPlus = this.getMondayPlus();
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.add(GregorianCalendar.DATE, mondayPlus + 7);
        Date monday = currentDate.getTime();
        DateFormat df = DateFormat.getDateInstance();
        String preMonday = df.format(monday);
        return preMonday;
    }

    // ������������յ�����
    public String getNextSunday() {
        int mondayPlus = this.getMondayPlus();
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.add(GregorianCalendar.DATE, mondayPlus + 7 + 6);
        Date monday = currentDate.getTime();
        DateFormat df = DateFormat.getDateInstance();
        String preMonday = df.format(monday);
        return preMonday;
    }

    private int getMonthPlus() {
        Calendar cd = Calendar.getInstance();
        int monthOfNumber = cd.get(Calendar.DAY_OF_MONTH);
        cd.set(Calendar.DATE, 1);//����������Ϊ���µ�һ��
        cd.roll(Calendar.DATE, -1);//���ڻع�һ�죬Ҳ�������һ��
        MaxDate = cd.get(Calendar.DATE);
        if (monthOfNumber == 1) {
            return -MaxDate;
        } else {
            return 1 - monthOfNumber;
        }
    }

    //����������һ�������
    public String getPreviousMonthEnd() {
        String str = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar lastDate = Calendar.getInstance();
        lastDate.add(Calendar.MONTH, -1);//��һ����
        lastDate.set(Calendar.DATE, 1);//����������Ϊ���µ�һ��
        lastDate.roll(Calendar.DATE, -1);//���ڻع�һ�죬Ҳ���Ǳ������һ��
        str = sdf.format(lastDate.getTime());
        return str;
    }

    //����¸��µ�һ�������
    public String getNextMonthFirst() {
        String str = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar lastDate = Calendar.getInstance();
        lastDate.add(Calendar.MONTH, 1);//��һ����
        lastDate.set(Calendar.DATE, 1);//����������Ϊ���µ�һ��
        str = sdf.format(lastDate.getTime());
        return str;
    }

    //����¸������һ�������
    public String getNextMonthEnd() {
        String str = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar lastDate = Calendar.getInstance();
        lastDate.add(Calendar.MONTH, 1);//��һ����
        lastDate.set(Calendar.DATE, 1);//����������Ϊ���µ�һ��
        lastDate.roll(Calendar.DATE, -1);//���ڻع�һ�죬Ҳ���Ǳ������һ��
        str = sdf.format(lastDate.getTime());
        return str;
    }

    //����������һ�������
    public String getNextYearEnd() {
        String str = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar lastDate = Calendar.getInstance();
        lastDate.add(Calendar.YEAR, 1);//��һ����
        lastDate.set(Calendar.DAY_OF_YEAR, 1);
        lastDate.roll(Calendar.DAY_OF_YEAR, -1);
        str = sdf.format(lastDate.getTime());
        return str;
    }

    //��������һ�������
    public String getNextYearFirst() {
        String str = "";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar lastDate = Calendar.getInstance();
        lastDate.add(Calendar.YEAR, 1);//��һ����
        lastDate.set(Calendar.DAY_OF_YEAR, 1);
        str = sdf.format(lastDate.getTime());
        return str;
    }

    //��ñ����ж�����
    private int getMaxYear() {
        Calendar cd = Calendar.getInstance();
        cd.set(Calendar.DAY_OF_YEAR, 1);//��������Ϊ�����һ��
        cd.roll(Calendar.DAY_OF_YEAR, -1);//�����ڻع�һ�졣
        int MaxYear = cd.get(Calendar.DAY_OF_YEAR);
        return MaxYear;
    }

    private int getYearPlus() {
        Calendar cd = Calendar.getInstance();
        int yearOfNumber = cd.get(Calendar.DAY_OF_YEAR);//��õ�����һ���еĵڼ���
        cd.set(Calendar.DAY_OF_YEAR, 1);//��������Ϊ�����һ��
        cd.roll(Calendar.DAY_OF_YEAR, -1);//�����ڻع�һ�졣
        int MaxYear = cd.get(Calendar.DAY_OF_YEAR);
        if (yearOfNumber == 1) {
            return -MaxYear;
        } else {
            return 1 - yearOfNumber;
        }
    }

    //��ñ����һ�������
    public String getCurrentYearFirst() {
        int yearPlus = this.getYearPlus();
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.add(GregorianCalendar.DATE, yearPlus);
        Date yearDay = currentDate.getTime();
        DateFormat df = DateFormat.getDateInstance();
        String preYearDay = df.format(yearDay);
        return preYearDay;
    }

    //��ñ������һ������� *
    public String getCurrentYearEnd() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");//���Է�����޸����ڸ�ʽ
        String years = dateFormat.format(date);
        return years + "-12-31 00:00:00";
    }

    //��������һ������� *
    public String getPreviousYearFirst() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");//���Է�����޸����ڸ�ʽ
        String years = dateFormat.format(date);
        int years_value = Integer.parseInt
                (years);
        years_value--;
        return years_value + "-1-1";
    }

    //����������һ�������
    public String getPreviousYearEnd() {
        weeks--;
        int yearPlus = this.getYearPlus();
        GregorianCalendar currentDate = new GregorianCalendar();
        currentDate.add(GregorianCalendar.DATE, yearPlus + MaxYear * weeks + (MaxYear - 1));
        Date yearDay = currentDate.getTime();
        DateFormat df = DateFormat.getDateInstance();
        String preYearDay = df.format(yearDay);
        getThisSeasonTime(11);
        return preYearDay;
    }

    //��ñ�����
    public String getThisSeasonTime(int month) {
        int array[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
        int season = 1;
        if (month >= 1 && month <= 3) {
            season = 1;
        }
        if (month >= 4 && month <= 6) {
            season = 2;
        }
        if (month >= 7 && month <= 9) {
            season = 3;
        }
        if (month >= 10 && month <= 12) {
            season = 4;
        }
        int start_month = array[season - 1][0];
        int end_month = array[season - 1][2];
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");//���Է�����޸����ڸ�ʽ
        String years = dateFormat.format(date);
        int years_value = Integer.parseInt(years);
        int start_days = 1;//years+"-"+String.valueOf(start_month)+"-";//getLastDayOfMonth(years_value,start_month);
        int end_days = getLastDayOfMonth(years_value, end_month);
        String seasonDate =
                years_value + "-" + start_month + "-" + start_days + ";" + years_value + "-" + end_month + "-" + end_days;
        return seasonDate;
    }

    /**
     * ��ȡĳ��ĳ�µ����һ��
     *
     * @param year  ��
     * @param month ��
     * @return ���һ��
     */
    private int getLastDayOfMonth(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
                || month == 10 || month == 12) {
            return 31;
        }
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        if (month == 2) {
            if (isLeapYear(year)) {
                return 29;
            } else {
                return 28;
            }
        }
        return 0;
    }

    /**
     * �Ƿ�����
     *
     * @param year ��
     * @return
     */
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}