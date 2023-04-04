package B1SortAlgorithm.aObjectSort;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * �����ֶ�����
 * �Ҳ�ͣ����ֻΪ׷�ϵ��걻����������Լ���
 * ���ÿ���ⶼ��Ϊ�������Ե��ˣ��Ե�ÿ���⣬����Ϊ���������õ��Լ���
 * ��ͷ���⺣��̧ͷ��ǰ;��
 * ����ժ�������ǣ������ҵ����������Ȼ���ҵġ�Ƭ����ϵ��
 * �ٿ�һ�����δ�������!
 * ������������������ô�õ�Ҳ���������������ô��
 * ����֣����ǲ�м������Ϊ�飬ȴ�����Լ����ڲ�ͬ��
 * ��Ҫ������Ϣ����Ϊ���ң���ɼ���
 * ���ճ�ӧ���֣���ʱ��ס������
 * ���������ܲ��ں�ҹ֮�У�Ҳ����������ݾ�����ǲ����˵��������
 */
public class SingleElement {
    public static void main(String[] args) {
        List<People> peopleList = new ArrayList<>();
        peopleList.add(new People(1, "С��", 5));
        peopleList.add(new People(1, "С��", 4));
        peopleList.add(new People(2, "С��", 3));
        peopleList.add(new People(2, "С��", 2));
        peopleList.add(new People(2, "С��", 1));

        //���ֶ�����,Ĭ������
        peopleList =  peopleList.stream().sorted(Comparator.comparing(People::getAge)).collect(Collectors.toList());
        System.out.println(peopleList.toString());
        //�����Ǹ��� userId �������򡪡���������  reversed()
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
