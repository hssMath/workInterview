package Test.deepandshallowcopy.ashallowCopy;

/**
 * ǳ������ֵ���͵��ֶλḴ��һ�ݣ����������͵��ֶο����Ľ��������õ�ַ���������õ�ַָ���ʵ�ʶ���ռ���ʵֻ��һ�ݡ�
 * ʵ��ǳ������ͨ�� student1 �����õ� student2 ������ʵ�ַ�ʽ��:ֻ��Ҫ�ñ����ƶ������ʵ�� Cloneable �ӿڣ�����д clone() �������ɡ�
 *
 * �ӽ�����Կ�����
 *    1��student1==student2��ӡfalse��˵��clone()������ȷ��¡����һ���¶���
 *    2���޸�ֵ�����ֶβ���Ӱ���¡�������¶��󣬷���Ԥ�ڣ�
 *    3�����޸��� student1 �ڲ������ö��󣬿�¡���� student2 Ҳ�ܵ��˲�����˵���ڲ����ǹ�����һ���
 */
public class TestShallowCopy {
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
