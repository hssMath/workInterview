package GDeepandshallowcopy.bdeepCopy;

/**
 * 深拷贝:
 *   1、如果想实现深拷贝，首先需要对更深一层次的引用类Major做改造，让其也实现Cloneable接口并重写clone()方法：
 *   2、其次我们还需要在顶层的调用类中重写 clone 方法，来调用引用类型字段的clone()方法实现深度拷贝，对应到本文那就是Student类：
 *
 * 很明显，这时候student1和student2两个对象就完全独立了，不受互相的干扰。
 */
public class TestDeepCopyByImplementCloneableInterface {
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
