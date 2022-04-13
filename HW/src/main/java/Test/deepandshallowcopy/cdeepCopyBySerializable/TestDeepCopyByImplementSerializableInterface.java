package Test.deepandshallowcopy.cdeepCopyBySerializable;

/**
 * ���÷����л�����������Ҳ���Դ�һ�������������һ�����ƶ��󣬶�������ڽ���������ʽ���������ʱЧ������ĺá�
 * ���������������һ�� Student�࣬���� clone()����ͨ�����л��ͷ����л��ķ�ʽ������һ��ԭ��������������
 *
 *  �����ԣ���ʱ��student1��student2��������Ҳ����ȫ�����ģ����ܻ���ĸ��ţ������ɡ�
 */
public class TestDeepCopyByImplementSerializableInterface {
    public static void main(String[] args) throws CloneNotSupportedException {
        Major major = new Major("�������ѧ�뼼��",666666);
        Student student1 = new Student( "CodeSheep", 18, major );

        // �� student1 �����õ� student2
        Student student2 = (Student) student1.clone();

        System.out.println( student1 == student2 );
        System.out.println( student1 );
        System.out.println( student2 );

        System.out.println();

        // �޸�student1��ֵ�����ֶ�
        student1.setAge( 35 );
        // �޸�student1�����������ֶ�
        major.setMajorName( "������Ϣ����" );
        major.setMajorId( 888888 );

        System.out.println( student1 );
        System.out.println( student2 );
    }

}
