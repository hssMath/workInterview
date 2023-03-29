package AAHwQuestionsTest.HWThird;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringJoiner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dayCount = new int[30];
        for (int i = 0; i < 30; i++) {
            dayCount[i] = sc.nextInt();
        }

        int[][] dayIds = new int[30][];
        for (int i = 0; i < 30; i++) {
            int m = dayCount[i];
            dayIds[i] = new int[m];
            for (int j = 0; j < m; j++) {
                dayIds[i][j] = sc.nextInt();
            }
        }
        System.out.println(getExcellentStudent(dayIds));
    }

    private static String getExcellentStudent(int[][] dayIds) {
        HashMap<Integer, Integer[]> employees = new HashMap<>();
        for (int i = 0; i < dayIds.length; i++) {
            int[] ids = dayIds[i];
            for (int id : ids) {
                if (employees.containsKey(id)) {
                    employees.get(id)[0]++;
                } else {
                    employees.put(id, new Integer[]{1, i});
                }
            }
        }
        ArrayList<Integer[]> list = new ArrayList<>();
        for (Integer id : employees.keySet()) {
            Integer[] employee = employees.get(id);
            int count = employee[0];
            int firstDay = employee[1];
            list.add(new Integer[]{id, count, firstDay});
        }
        list.sort(
                (a, b) -> a[1].equals(b[1]) ? (a[2].equals(b[2])
                        ? a[0] - b[0] : a[2] - b[2]) : b[1] - a[1]);
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = 0; i < Math.min(5, list.size()); i++) {
            joiner.add(list.get(i)[0] + "");
        }
        return joiner.toString();
    }
}