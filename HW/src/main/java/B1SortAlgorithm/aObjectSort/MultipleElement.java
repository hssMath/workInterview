package B1SortAlgorithm.aObjectSort;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 对象多字段排序
 */
public class MultipleElement {
    public static void main(String[] args) {
        List<People> peopleList = new ArrayList<>();
        peopleList.add(new People(1, "小王", 5));
        peopleList.add(new People(1, "小李", 4));
        peopleList.add(new People(2, "小张", 3));
        peopleList.add(new People(2, "小皇", 2));
        peopleList.add(new People(2, "小刘", 1));
        //这里是根据Id及age进行联合升序排序
        List<People> peopleList1 = peopleList.stream().sorted(Comparator.comparing(People::getId).thenComparing(People::getAge)).collect(Collectors.toList());

        /**
         * 下面两个结果都是以Id降序age升序排序的结果，但是查询方式不同
         */
        //先以id升序,升序结果进行id降序,再进行age升序
        List<People> peopleList2 = peopleList.stream().sorted(Comparator.comparing(People::getId).reversed().thenComparing(People::getAge)).collect(Collectors.toList());
        //先以id降序,再进行age升序 **推荐使用该种方式**
        List<People> peopleList3 = peopleList.stream().sorted(Comparator.comparing(People::getId, Comparator.reverseOrder()).thenComparing(People::getAge)).collect(Collectors.toList());
        //先以id升序,再进行age降序
        List<People> peopleList4 = peopleList.stream().sorted(Comparator.comparing(People::getId).thenComparing(People::getAge, Comparator.reverseOrder())).collect(Collectors.toList());
        //先以id降序,再进行age降序
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
