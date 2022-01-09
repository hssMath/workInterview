package DDesignModel.AProxy.BJdkDynamiAproxy;

import DDesignModel.AProxy.BJdkDynamiAproxy.bo.Subject;
import DDesignModel.AProxy.BJdkDynamiAproxy.boImpl.Subjectlmpl;
import DDesignModel.AProxy.BJdkDynamiAproxy.proxyHandlerClass.JdkDynamicProxyHandler;

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

        //1������Ŀ�����ʹ��Proxy
         Subject target = new Subjectlmpl();//�ӿڵ�����ָ�����������
        //2������InvocationHandler����:
         InvocationHandler handler  = new JdkDynamicProxyHandler(target);//�ӿڵ�����ָ�����������
        //3.�����������;���ѷ���ֵתΪ�ӿ�����(����ǿת����ΪĿ�����ʵ��������ӿ�)
        Subject proxyTargetObject = (Subject) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),handler);

        System.out.println("��̬��������ȡ���ĵĴ����������:"+ proxyTargetObject.getClass().getName());

        //4.ͨ����̬�������ִ�з���
        proxyTargetObject.doSomething("zhangsan");
        proxyTargetObject.wirte("lisi");
    }
}
