package DDesignModel.Aproxy.Impl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * JDKDynamicProxy
 * jdkd动态代理
 *
 * @author
 * @create 2018-03-29 16:17
 **/
public class JDKDynamicProxy implements InvocationHandler {

    private final Object object;

    public JDKDynamicProxy(Object object) {
        this.object = object;
    }

    /**
     * 获取被代理接口实例对象
     *
     * @param <T>
     * @return
     */
    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Do something before");
        Object result = method.invoke(object, args);
        System.out.println("Do something after");
        return result;
    }
}