package DDesignModel.BJdkDynamiAproxy;


import DDesignModel.BJdkDynamiAproxy.Bo.Subject;
import DDesignModel.BJdkDynamiAproxy.BoImpl.Subjectlmpl;

/**
 * JDK��̬����ʹ��jdk�ķ�����ƣ�����������������������Ǵ�����Ķ��󣬶����Ǵ������ļ���
 *            ��̬�����ڳ���ִ��ʱ������jdk���ṩ�ķ�����̬����class�ļ�������������Ķ���
 *    �ص㣺���ô������ļ��������Ŀ�����ǻ�ģ������õģ�������ʱ����ͬ��Ŀ�괴������
 *
 * ʹ�ò���
 *    1�� �½�һ���ӿ�
 *    2�� Ϊ�ӿڴ���һ��ʵ����
 *    3�� ����������ʵ��java.lang.reflect.InvocationHandler�ӿ�
 *    4�� ����
 *
 * �ɿ���
 *    1��������̳���Proxy�ಢ��ʵ����Ҫ����Ľӿڣ�����java��֧�ֶ�̳У�����JDK��̬�����ܴ�����
 *    2����д��equals��hashCode��toString
 *    3����һ����̬����飬ͨ��������ߴ���������з���
 *    4��ͨ��invokeִ�д������е�Ŀ�귽��doSomething
 *
 * java�ж�̬������Ҫ��JDK��CGLIB���ַ�ʽ��
 *    ������Ҫ��jdk�Ǵ���ӿڣ���cglib�Ǵ����ࡣ
 *    jdk�Ķ�̬���������Proxy.newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h) ������
 *    ͨ���÷��������ֽ��룬��̬�Ĵ�����һ�������࣬interfaces�����Ǹö�̬�����̳е����нӿڣ����̳�InvocationHandler �ӿڵ�������ʵ���ڵ��ô���ӿڷ���ǰ��ľ����߼�
 */
public class TestJdkDynamicProxy {
    public static void main(String[] args) {
        // �������ɵĴ�������ֽ����ļ�
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        // jdk��̬�������
        Subject subject = new JDKDynamicProxy(new Subjectlmpl()).getProxy();
        subject.doSomething();
    }
}
