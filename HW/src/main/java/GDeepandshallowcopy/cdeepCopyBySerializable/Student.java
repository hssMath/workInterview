package GDeepandshallowcopy.cdeepCopyBySerializable;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

/**
 * ʵ��ǳ������ֻ��Ҫͨ�� student1 �����õ� student2 ��ǳ�����ĵ���ʵ�ַ�ʽ�ǣ��ñ����ƶ������ʵ�� Cloneable �ӿڣ�����д clone() �������ɡ�
 */
@Data
@NoArgsConstructor
public class Student implements Serializable {
    private String name;  // ����
    private int age;      // ����
    private Major major;  // ��ѧרҵ

    public Student(String name, int age, Major major) {
        this.name =name;
        this.age =age;
        this.major =major;
    }

    public Student clone() {
        try {
            // �����������л����ֽ���
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream( byteArrayOutputStream );
            objectOutputStream.writeObject( this );
            // �ٽ��ֽ���ͨ�������л���ʽ�õ����󸱱�
            ObjectInputStream objectInputStream = new ObjectInputStream( new ByteArrayInputStream( byteArrayOutputStream.toByteArray() ) );
            return (Student) objectInputStream.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
