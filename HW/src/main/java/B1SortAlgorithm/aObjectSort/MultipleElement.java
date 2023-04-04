package B1SortAlgorithm.aObjectSort;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ������ֶ�����
 */
public class MultipleElement {
    public static void main(String[] args) {
        List<People> peopleList = new ArrayList<>();
        peopleList.add(new People(1, "С��", 5));
        peopleList.add(new People(1, "С��", 4));
        peopleList.add(new People(2, "С��", 3));
        peopleList.add(new People(2, "С��", 2));
        peopleList.add(new People(2, "С��", 1));
        //�����Ǹ���Id��age����������������
        List<People> peopleList1 = peopleList.stream().sorted(Comparator.comparing(People::getId).thenComparing(People::getAge)).collect(Collectors.toList());

        /**
         * �����������������Id����age��������Ľ�������ǲ�ѯ��ʽ��ͬ
         */
        //����id����,����������id����,�ٽ���age����
        List<People> peopleList2 = peopleList.stream().sorted(Comparator.comparing(People::getId).reversed().thenComparing(People::getAge)).collect(Collectors.toList());
        //����id����,�ٽ���age���� **�Ƽ�ʹ�ø��ַ�ʽ**
        List<People> peopleList3 = peopleList.stream().sorted(Comparator.comparing(People::getId, Comparator.reverseOrder()).thenComparing(People::getAge)).collect(Collectors.toList());
        //����id����,�ٽ���age����
        List<People> peopleList4 = peopleList.stream().sorted(Comparator.comparing(People::getId).thenComparing(People::getAge, Comparator.reverseOrder())).collect(Collectors.toList());
        //����id����,�ٽ���age����
        List<People> peopleList5 = peopleList.stream().sorted(Comparator.comparing(People::getId, Comparator.reverseOrder()).thenComparing(People::getAge, Comparator.reverseOrder())).collect(Collectors.toList());

    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class People {
        private int id;
        private String name;
        private int age;
    }
}
