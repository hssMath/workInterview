package Test.deepandshallowcopy.ashallowCopy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * ʵ��ǳ������ֻ��Ҫͨ�� student1 �����õ� student2 ��ǳ�����ĵ���ʵ�ַ�ʽ�ǣ��ñ����ƶ������ʵ�� Cloneable �ӿڣ�����д clone() �������ɡ�
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Cloneable{
    private String name;  // ����
    private int age;      // ����
    private Major major;  // ��ѧרҵ

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}