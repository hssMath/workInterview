package DDesignModel.Aproxy.Impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDKDynamicProxy
 * jdkd��̬����
 *
 * @author
 * @create 2018-03-29 16:17
 **/
public class JDKDynamicProxy implements InvocationHandler {

    private final Object target;

    public JDKDynamicProxy(Object target) {
        this.target = target;
    }

    /**
     * ��ȡ������ӿ�ʵ������
     *
     * @param <T>
     * @return
     */
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Do something before");
        Object result = method.invoke(target, args);
        System.out.println("Do something after");
        return result;
    }
}