package AAHwQuestionsTest.HWThird;


import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        Integer[] arr = Arrays.stream(str.split(" ")).map(Integer::parseInt).toArray(Integer[]::new);
        System.out.println(getResult(arr));
    }

    private static String getResult(Integer[] arr) {
        HashMap<Integer, Integer> card = new HashMap<>();
        // 统计各种排的数量
        for (Integer num : arr) {
            if (card.containsKey(num)) {
                int val = card.get(num);
                card.put(num, ++val);
            } else {
                card.put(num, 1);
            }
        }

        //统计组合：4表示炸弹；3+2代表葫芦；3代表三张；2代表对子；1代表单张
        HashMap<String, LinkedList<Integer[]>> zuhe = new HashMap<>();
        zuhe.put("4", new LinkedList<>());
        zuhe.put("3+2", new LinkedList<>());
        zuhe.put("3", new LinkedList<>());
        zuhe.put("2", new LinkedList<>());
        zuhe.put("1", new LinkedList<>());

        // 首先将初始组合统计出来
        Set<Integer> cardKeys = card.keySet();
        for (Integer num : cardKeys) {
            switch (card.get(num)) {
                case 3:
                    zuhe.get("3").add(new Integer[]{num});
                    break;
                case 2:
                    zuhe.get("2").add(new Integer[]{num});
                    break;
                case 1:
                    zuhe.get("1").add(new Integer[]{num});
                    break;
                default:
                    zuhe.get("4").add(new Integer[]{num, card.get(num)});
            }
        }

        // 5种排序
        zuhe.get("4").sort(
                (a, b) -> !Objects.equals(a[1], b[1]) ? b[1] - a[1] : b[0] - a[0]);
        zuhe.get("3").sort(
                (a, b) -> b[0] - a[0]);
        zuhe.get("2").sort(
                (a, b) -> b[0] - a[0]);
        while (zuhe.get("3").size() > 0) {
            if (zuhe.get("2").size() == 0 && zuhe.get("3").size() == 1) {
                break;
            }
            Integer san_top = zuhe.get("3").removeFirst()[0];
            Integer tmp;
            if (zuhe.get("2").size() == 0
                    || (zuhe.get("3").size() > 0
                    && zuhe.get("3").get(0)[0] > zuhe.get("2").get(0)[0])
            ) {
                tmp = zuhe.get("3").removeFirst()[0];
                zuhe.get("1").add(new Integer[]{tmp});
            } else {
                tmp = zuhe.get("2").removeFirst()[0];
            }
            zuhe.get("3+2").add(new Integer[]{san_top, tmp});
        }
        zuhe.get("1").sort(
                (a, b) -> b[0] - a[0]);

        // 存放题解：先放炸弹，再放葫芦，再放三张，再放对子，再防单张
        ArrayList<Integer> answer = new ArrayList<>();
        for (Integer[] vals : zuhe.get("4")) {
            int score = vals[0];
            int count = vals[1];
            for (int i = 0; i < count; i++) {
                answer.add(score);
            }
        }

        for (Integer[] vals : zuhe.get("3+2")) {
            int san = vals[0];
            int er = vals[1];
            for (int i = 0; i < 3; i++) {
                answer.add(san);
            }
            for (int i = 0; i < 2; i++) {
                answer.add(er);
            }
        }

        for (Integer[] vals : zuhe.get("3")) {
            for (int i = 0; i < 3; i++) {
                answer.add(vals[0]);
            }
        }

        for (Integer[] vals : zuhe.get("2")) {
            for (int i = 0; i < 2; i++) {
                answer.add(vals[0]);
            }
        }

        for (Integer[] vals : zuhe.get("1")) {
            answer.add(vals[0]);
        }

        StringJoiner joiner = new StringJoiner(" ");
        for (Integer an : answer) {
            joiner.add(an + "");
        }
        return joiner.toString();
    }
}
