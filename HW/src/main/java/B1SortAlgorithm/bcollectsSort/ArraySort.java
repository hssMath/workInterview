package B1SortAlgorithm.bcollectsSort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ���������Լ�List<Integer>�����Ȱ�����ת����List�����ٽ�������
 */
public class ArraySort {
    public static void main(String[] args) {
        Integer[] integers = {2, 3, 5, 1, 4};
        List<Integer> integerList = Arrays.stream(integers).sorted(Comparator.comparing(Integer::intValue, Comparator.reverseOrder())).collect(Collectors.toList());
        for (Integer integer : integerList) {
            System.out.println(integer);
        }
    }
}
