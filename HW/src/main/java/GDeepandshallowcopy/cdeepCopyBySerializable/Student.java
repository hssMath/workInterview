package GDeepandshallowcopy.cdeepCopyBySerializable;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.*;

/**
 * 实现浅拷贝：只需要通过 student1 拷贝得到 student2 ，浅拷贝的典型实现方式是：让被复制对象的类实现 Cloneable 接口，并重写 clone() 方法即可。
 */
@Data
@NoArgsConstructor
public class Student implements Serializable {
    private String name;  // 姓名
    private int age;      // 年龄
    private Major major;  // 所学专业

    public Student(String name, int age, Major major) {
        this.name =name;
        this.age =age;
        this.major =major;
    }

    public Student clone() {
        try {
            // 将对象本身序列化到字节流
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream( byteArrayOutputStream );
            objectOutputStream.writeObject( this );
            // 再将字节流通过反序列化方式得到对象副本
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
