package DDesignModel.BJdkDynamiAproxy;


import DDesignModel.BJdkDynamiAproxy.Bo.Subject;
import DDesignModel.BJdkDynamiAproxy.BoImpl.Subjectlmpl;

/**
 * JDK动态代理：使用jdk的反射机制，创建对象的能力，创建的是代理类的对象，而不是创建类文件。
 *            动态代理：在程序执行时，调用jdk的提供的方法动态创建class文件，创建代理类的对象。
 *    特点：不用创建类文件，代理的目标类是活动的，可设置的；可以随时给不同的目标创建代理。
 *
 * 使用步骤
 *    1、 新建一个接口
 *    2、 为接口创建一个实现类
 *    3、 创建代理类实现java.lang.reflect.InvocationHandler接口
 *    4、 测试
 *
 * 可看到
 *    1、代理类继承了Proxy类并且实现了要代理的接口，由于java不支持多继承，所以JDK动态代理不能代理类
 *    2、重写了equals、hashCode、toString
 *    3、有一个静态代码块，通过反射或者代理类的所有方法
 *    4、通过invoke执行代理类中的目标方法doSomething
 *
 * java中动态代理主要有JDK和CGLIB两种方式。
 *    区别主要是jdk是代理接口，而cglib是代理类。
 *    jdk的动态代理调用了Proxy.newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h) 方法。
 *    通过该方法生成字节码，动态的创建了一个代理类，interfaces参数是该动态类所继承的所有接口，而继承InvocationHandler 接口的类则是实现在调用代理接口方法前后的具体逻辑
 */
public class TestJdkDynamicProxy {
    public static void main(String[] args) {
        // 保存生成的代理类的字节码文件
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        // jdk动态代理测试
        Subject subject = new JDKDynamicProxy(new Subjectlmpl()).getProxy();
        subject.doSomething();
    }
}
