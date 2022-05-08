package GDeepandshallowcopy.bdeepCopy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 实现浅拷贝：只需要通过 student1 拷贝得到 student2 ，浅拷贝的典型实现方式是：让被复制对象的类实现 Cloneable 接口，并重写 clone() 方法即可。
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student implements Cloneable{
    private String name;  // 姓名
    private int age;      // 年龄
    private Major major;  // 所学专业

    @Override
    public Object clone() throws CloneNotSupportedException {
        Student student = (Student) super.clone();
        student.major = (Major) major.clone(); // 重要！！！
        return student;
    }
}
