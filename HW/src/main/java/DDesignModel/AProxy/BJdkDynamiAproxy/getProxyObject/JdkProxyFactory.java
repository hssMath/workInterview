package DDesignModel.AProxy.BJdkDynamiAproxy.getProxyObject;

import DDesignModel.AProxy.BJdkDynamiAproxy.proxyClass.DynamicAProxyClass;

import java.lang.reflect.Proxy;

/**
 * 4. 获取代理对象的工厂类：使用 Proxy 类的静态方法 newProxyInstance，创建代理对象，并把返回值转为接口类型
 * 创建代理对象;并把返回值转为接口类型(可以强转是因为目标对象实现了这个接口)
 */
public class JdkProxyFactory {
    public static Object getProxy(Object target) {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(), // 目标类的类加载
                target.getClass().getInterfaces(),  // 代理需要实现的接口，可指定多个
                new DynamicAProxyClass(target)              // 代理对象对应的自定义 InvocationHandler
        );
    }
}
