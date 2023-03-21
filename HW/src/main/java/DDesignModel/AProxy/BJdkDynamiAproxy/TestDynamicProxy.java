package DDesignModel.AProxy.BJdkDynamiAproxy;

import DDesignModel.AProxy.BJdkDynamiAproxy.bo.SmsService;
import DDesignModel.AProxy.BJdkDynamiAproxy.boImpl.SmsServiceByDxImpl;
import DDesignModel.AProxy.BJdkDynamiAproxy.getProxyObject.JdkProxyFactory;
/**
 * JDK��̬����
 *      ʹ��jdk�ķ�����ƣ�����������������������Ǵ�����Ķ��󣬶����Ǵ������ļ���
 *      ��̬�����ڳ���ִ��ʱ������jdk���ṩ�ķ�����̬����class�ļ�������������Ķ���
 * �ص㣺
 *      ���ô������ļ��������Ŀ�����ǻ�ģ������õģ�������ʱ����ͬ��Ŀ�괴������
 *
 * ʹ�ò���
 *    1�� �½�һ���ӿ�,����Ŀ����Ҫ��ɵĹ��ܡ�
 *    2�� ����Ŀ���࣬ʵ�ֽӿ�
 *    3�� ���� ��̬�����࣬ʵ�� java.lang.reflect.InvocationHandler �ӿڣ�����Ŀ�귽������ǿ�������ܡ�
 *    4�� ʹ�� proxy ��ľ�̬����������������󣬲��ѷ���ֵתΪ�ӿ����͡�
 *
 * �ɿ���
 *    1��������̳��� Proxy �ಢ��ʵ����Ҫ����Ľӿڣ�����java��֧�ֶ�̳У�����JDK��̬�����ܴ����ֻ࣬�ܴ���ӿڡ�
 *    2�������ࣺ��д�� equals��hashCode��toString����һ����̬����飬ͨ��������ߴ���������з�����
 *    4��ͨ�� invoke ִ�д������е�Ŀ�귽�� doSomething()��
 *
 * java�ж�̬������Ҫ�� JDK �� CGLIB ���ַ�ʽ:
 *    ������Ҫ��jdk�Ǵ���ӿڣ�Ŀ�������ʵ�ֽӿڣ�û�нӿڵĻ�ʹ��cglib������cglib�Ǵ����ࡣ
 *    jdk�Ķ�̬���������Proxy.newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h) ������
 *    ͨ���÷��������ֽ��룬��̬�Ĵ�����һ�������࣬interfaces �����Ǹö�̬�����̳е����нӿڣ����̳�InvocationHandler �ӿڵ�������ʵ���ڵ��ô���ӿڷ���ǰ��ľ����߼�
 */
public class TestDynamicProxy {
    public static void main(String[] args) {
        // �������ɵĴ�������ֽ����ļ�
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        SmsService smsServiceByDxImpl  = new SmsServiceByDxImpl();
        // ��̬���������������Ҫ����ʵ�ֽӿڣ�����ֱ�Ӵ���ʵ����
        SmsService smsServiceByDx = (SmsService) JdkProxyFactory.getProxy(smsServiceByDxImpl);
        smsServiceByDx.send("Java!");
        smsServiceByDx.send222("Java!");

//        SmsService smsServiceByYdImpl = new SmsServiceByYdImpl();
//        SmsService smsServiceByYd = (SmsService) JdkProxyFactory.getProxy(smsServiceByYdImpl);
//        smsServiceByYd.send("Java!");
//        smsServiceByYd.send222("Java!");
    }
}