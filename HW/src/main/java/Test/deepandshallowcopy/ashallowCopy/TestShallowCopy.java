package Test.deepandshallowcopy.ashallowCopy;

/**
 * 浅拷贝：值类型的字段会复制一份，而引用类型的字段拷贝的仅仅是引用地址，而该引用地址指向的实际对象空间其实只有一份。
 * 实现浅拷贝（通过 student1 拷贝得到 student2 ）典型实现方式是:只需要让被复制对象的类实现 Cloneable 接口，并重写 clone() 方法即可。
 *
 * 从结果可以看出：
 *    1、student1==student2打印false，说明clone()方法的确克隆出了一个新对象；
 *    2、修改值类型字段并不影响克隆出来的新对象，符合预期；
 *    3、而修改了 student1 内部的引用对象，克隆对象 student2 也受到了波及，说明内部还是关联在一起的
 */
public class TestShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Major major = new Major("计算机科学与技术",666666);
        Student student1 = new Student( "CodeSheep", 18, major );

        // 由 student1 拷贝得到 student2
        Student student2 = (Student) student1.clone();

        System.out.println( student1 == student2 );
        System.out.println( student1 );
        System.out.println( student2 );
        System.out.println( "\n" );

        // 修改student1的值类型字段
        student1.setAge( 35 );
        // 修改student1的引用类型字段
        major.setMajorName( "电子信息工程" );
        major.setMajorId( 888888 );
        System.out.println( student1 );
        System.out.println( student2 );
    }
}
