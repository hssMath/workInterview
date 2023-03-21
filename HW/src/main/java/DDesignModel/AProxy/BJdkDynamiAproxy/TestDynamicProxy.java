package DDesignModel.AProxy.BJdkDynamiAproxy;

import DDesignModel.AProxy.BJdkDynamiAproxy.bo.SmsService;
import DDesignModel.AProxy.BJdkDynamiAproxy.boImpl.SmsServiceByDxImpl;
import DDesignModel.AProxy.BJdkDynamiAproxy.getProxyObject.JdkProxyFactory;
/**
 * JDK动态代理：
 *      使用jdk的反射机制，创建对象的能力，创建的是代理类的对象，而不是创建类文件。
 *      动态代理：在程序执行时，调用jdk的提供的方法动态创建class文件，创建代理类的对象。
 * 特点：
 *      不用创建类文件，代理的目标类是活动的，可设置的；可以随时给不同的目标创建代理。
 *
 * 使用步骤
 *    1、 新建一个接口,定义目标类要完成的功能。
 *    2、 创建目标类，实现接口
 *    3、 创建 动态代理类，实现 java.lang.reflect.InvocationHandler 接口：调用目标方法，增强方法功能。
 *    4、 使用 proxy 类的静态方法，创建代理对象，并把返回值转为接口类型。
 *
 * 可看到
 *    1、代理类继承了 Proxy 类并且实现了要代理的接口，由于java不支持多继承，所以JDK动态代理不能代理类，只能代理接口。
 *    2、代理类：重写了 equals、hashCode、toString；有一个静态代码块，通过反射或者代理类的所有方法。
 *    4、通过 invoke 执行代理类中的目标方法 doSomething()。
 *
 * java中动态代理主要有 JDK 和 CGLIB 两种方式:
 *    区别主要是jdk是代理接口（目标类必须实现接口，没有接口的话使用cglib），而cglib是代理类。
 *    jdk的动态代理调用了Proxy.newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h) 方法。
 *    通过该方法生成字节码，动态的创建了一个代理类，interfaces 参数是该动态类所继承的所有接口，而继承InvocationHandler 接口的类则是实现在调用代理接口方法前后的具体逻辑
 */
public class TestDynamicProxy {
    public static void main(String[] args) {
        // 保存生成的代理类的字节码文件
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        SmsService smsServiceByDxImpl  = new SmsServiceByDxImpl();
        // 动态代理类更加灵活，不需要必须实现接口，可以直接代理实现类
        SmsService smsServiceByDx = (SmsService) JdkProxyFactory.getProxy(smsServiceByDxImpl);
        smsServiceByDx.send("Java!");
        smsServiceByDx.send222("Java!");

//        SmsService smsServiceByYdImpl = new SmsServiceByYdImpl();
//        SmsService smsServiceByYd = (SmsService) JdkProxyFactory.getProxy(smsServiceByYdImpl);
//        smsServiceByYd.send("Java!");
//        smsServiceByYd.send222("Java!");
    }
}