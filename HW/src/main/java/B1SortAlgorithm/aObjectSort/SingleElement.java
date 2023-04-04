package B1SortAlgorithm.aObjectSort;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 对象单字段排序：
 * 我不停奔跑只为追赶当年被寄予厚望的自己。
 * 错的每个题都是为了遇见对的人，对的每道题，都是为了遇见更好的自己。
 * 低头是题海，抬头是前途。
 * 我虽摘不下星星，但在我的宇宙里，你已然是我的—片银河系。
 * 再苦一会儿，未来会很甜!
 * 生活不可能像你想象得那么好但也不会像你想象得那么糟
 * 很奇怪，我们不屑与他人为伍，却害怕自己与众不同。
 * 我要悄无声息，成为你的遥不可及。
 * 今日长缨在手，何时缚住苍龙。
 * 真正的秘密不在黑夜之中，也不在巧妙的陷井里，而是藏在人的内心深处。
 */
public class SingleElement {
    public static void main(String[] args) {
        List<People> peopleList = new ArrayList<>();
        peopleList.add(new People(1, "小王", 5));
        peopleList.add(new People(1, "小李", 4));
        peopleList.add(new People(2, "小张", 3));
        peopleList.add(new People(2, "小皇", 2));
        peopleList.add(new People(2, "小刘", 1));

        //单字段排序,默认升序
        peopleList =  peopleList.stream().sorted(Comparator.comparing(People::getAge)).collect(Collectors.toList());
        System.out.println(peopleList.toString());
        //这里是根据 userId 进行排序——降序排序  reversed()
        peopleList =  peopleList.stream().sorted(Comparator.comparing(People::getAge).reversed()).collect(Collectors.toList());
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
