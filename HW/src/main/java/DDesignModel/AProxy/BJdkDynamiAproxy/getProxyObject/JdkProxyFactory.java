package DDesignModel.AProxy.BJdkDynamiAproxy.getProxyObject;

import DDesignModel.AProxy.BJdkDynamiAproxy.proxyHandlerClass.ProxyClass;

import java.lang.reflect.Proxy;

/**
 * 4. ��ȡ�������Ĺ����ࣺʹ�� Proxy ��ľ�̬���� newProxyInstance������������󣬲��ѷ���ֵתΪ�ӿ�����
 * �����������;���ѷ���ֵתΪ�ӿ�����(����ǿת����ΪĿ�����ʵ��������ӿ�)
 */
public class JdkProxyFactory {
    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(), // Ŀ����������
                target.getClass().getInterfaces(),  // ������Ҫʵ�ֵĽӿڣ���ָ�����
                new ProxyClass(target)              // ��������Ӧ���Զ��� InvocationHandler
        );
    }
}
