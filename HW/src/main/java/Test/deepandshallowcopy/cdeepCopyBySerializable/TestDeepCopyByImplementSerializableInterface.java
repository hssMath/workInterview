package Test.deepandshallowcopy.cdeepCopyBySerializable;

/**
 * 利用反序列化技术，我们也可以从一个对象深拷贝出另一个复制对象，而且这货在解决多层套娃式的深拷贝问题时效果出奇的好。
 * 所以我们这里改造一下 Student类，让其 clone()方法通过序列化和反序列化的方式来生成一个原对象的深拷贝副本：
 *
 *  很明显，这时候student1和student2两个对象也是完全独立的，不受互相的干扰，深拷贝完成。
 */
public class TestDeepCopyByImplementSerializableInterface {
    public static void main(String[] args) throws CloneNotSupportedException {
        Major major = new Major("计算机科学与技术",666666);
        Student student1 = new Student( "CodeSheep", 18, major );

        // 由 student1 拷贝得到 student2
        Student student2 = (Student) student1.clone();

        System.out.println( student1 == student2 );
        System.out.println( student1 );
        System.out.println( student2 );

        System.out.println();

        // 修改student1的值类型字段
        student1.setAge( 35 );
        // 修改student1的引用类型字段
        major.setMajorName( "电子信息工程" );
        major.setMajorId( 888888 );

        System.out.println( student1 );
        System.out.println( student2 );
    }

}
