package DDesignModel.AProxy.BJdkDynamiAproxy;

import DDesignModel.AProxy.BJdkDynamiAproxy.Bo.Subject;
import DDesignModel.AProxy.BJdkDynamiAproxy.BoImpl.Subjectlmpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * JDK��̬����ʹ��jdk�ķ�����ƣ�����������������������Ǵ�����Ķ��󣬶����Ǵ������ļ���
 *            ��̬�����ڳ���ִ��ʱ������jdk���ṩ�ķ�����̬����class�ļ�������������Ķ���
 *    �ص㣺���ô������ļ��������Ŀ�����ǻ�ģ������õģ�������ʱ����ͬ��Ŀ�괴������
 *
 * ʹ�ò���
 *    1�� �½�һ���ӿ�,����Ŀ����Ҫ��ɵĹ��ܡ�
 *    2�� ����Ŀ���࣬ʵ�ֽӿ�
 *    3�� ���������࣬ʵ��java.lang.reflect.InvocationHandler�ӿڣ�����Ŀ�귽������ǿ�������ܡ�
 *    4�� ʹ��proxy��ľ�̬����������������󣬲��ѷ���ֵתΪ�ӿ����͡�
 *
 * �ɿ���
 *    1��������̳���Proxy�ಢ��ʵ����Ҫ����Ľӿڣ�����java��֧�ֶ�̳У�����JDK��̬�����ܴ����ֻ࣬�ܴ���ӿڡ�
 *    2�������ࣺ��д��equals��hashCode��toString����һ����̬����飬ͨ��������ߴ���������з�����
 *    4��ͨ��invokeִ�д������е�Ŀ�귽��doSomething��
 *
 * java�ж�̬������Ҫ��JDK��CGLIB���ַ�ʽ��
 *    ������Ҫ��jdk�Ǵ���ӿڣ�Ŀ�������ʵ�ֽӿڣ�û�нӿڵĻ�ʹ��cglib������cglib�Ǵ����ࡣ
 *    jdk�Ķ�̬���������Proxy.newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h) ������
 *    ͨ���÷��������ֽ��룬��̬�Ĵ�����һ�������࣬interfaces�����Ǹö�̬�����̳е����нӿڣ����̳�InvocationHandler �ӿڵ�������ʵ���ڵ��ô���ӿڷ���ǰ��ľ����߼�
 */
public class JdkDynamicProxyHandlerTest {
    public static void main(String[] args) {
//        �������ɵĴ�������ֽ����ļ�
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        /**
         *   �����������ʹ��Proxy
         */
        //1������Ŀ�����
         Subject factory = new Subjectlmpl();//�ӿڵ�����ָ�����������
        //2������InvocationHandler����:
         InvocationHandler handler  = new JdkDynamicProxyHandler(factory);//�ӿڵ�����ָ�����������
        //3.�����������;���ѷ���ֵתΪ�ӿ�����(����ǿת����ΪĿ�����ʵ��������ӿ�)
        Subject proxySubject = (Subject) Proxy.newProxyInstance(factory.getClass().getClassLoader(), factory.getClass().getInterfaces(),handler);

        System.out.println("�������proxySubject��name:"+ proxySubject.getClass().getName());

        //4.ͨ����̬�������ִ�з���
        proxySubject.doSomething("zhangsan");
        proxySubject.wirte("lisi");
    }
}
