package GDeepandshallowcopy.bdeepCopy;

/**
 * ���:
 *   1�������ʵ�������������Ҫ�Ը���һ��ε�������Major�����죬����Ҳʵ��Cloneable�ӿڲ���дclone()������
 *   2��������ǻ���Ҫ�ڶ���ĵ���������д clone ���������������������ֶε�clone()����ʵ����ȿ�������Ӧ�������Ǿ���Student�ࣺ
 *
 * �����ԣ���ʱ��student1��student2�����������ȫ�����ˣ����ܻ���ĸ��š�
 */
public class TestDeepCopyByImplementCloneableInterface {
    public static void main(String[] args) throws CloneNotSupportedException {
        Major major = new Major("�������ѧ�뼼��",666666);
        Student student1 = new Student( "CodeSheep", 18, major );

        // �� student1 �����õ� student2
        Student student2 = (Student) student1.clone();

        System.out.println( student1 == student2 );
        System.out.println( student1 );
        System.out.println( student2 );
        System.out.println( "\n" );

        // �޸�student1��ֵ�����ֶ�
        student1.setAge( 35 );
        // �޸�student1�����������ֶ�
        major.setMajorName( "������Ϣ����" );
        major.setMajorId( 888888 );
        System.out.println( student1 );
        System.out.println( student2 );
    }
}
