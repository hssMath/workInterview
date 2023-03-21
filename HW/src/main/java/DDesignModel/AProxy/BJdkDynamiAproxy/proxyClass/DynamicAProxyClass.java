package DDesignModel.AProxy.BJdkDynamiAproxy.proxyClass;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 3. 定义一个JDK动态代理类
 *
 * 代理类：必须实现 InvocationHandler 接口，完成代理类要做的功能(1.调用目标方法；2.功能增强)。
 *
 * 使用步骤
 *    1、定义一个接口及其实现类；
 *    2、创建代理类，实现java.lang.reflect.InvocationHandler接口，并重写 invoke 方法，在 invoke 方法中调用原生方法（被代理
 *        类的方法）并自定义一些处理逻辑；
 *    3、通过 Proxy.newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h) 方法创建代理对象，
 *        并把返回值转为接口类型。
 */
public class DynamicAProxyClass implements InvocationHandler {
    // 代理类中的真实对象：目标对象是可以动态修改的，不是固定的，需要传入进来；传入是谁，就给谁创建代理。
    private final Object target;

    public DynamicAProxyClass(Object target) {
        this.target = target;
    }

    /**
     * invoke() 方法有下面三个参数：
     * @param proxy 动态生成的代理类
     * @param method 与代理类对象调用的方法相对应
     * @param args 当前 method 方法的参数
     * @return
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        //调用方法之前，我们可以添加自己的操作
        System.out.println("JDK动态代理 before method " + method.getName());

        // 方法增强：在不改变原来代码的基础之上，可以在代理中增强自己的代码功能
        Object result = method.invoke(target, args);

        //调用方法之后，我们同样可以添加自己的操作
        System.out.println("JDK动态代理 after method " + method.getName());
        return result;
    }
}
