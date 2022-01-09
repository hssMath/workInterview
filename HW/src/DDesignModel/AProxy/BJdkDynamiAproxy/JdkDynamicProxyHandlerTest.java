package DDesignModel.AProxy.BJdkDynamiAproxy;

import DDesignModel.AProxy.BJdkDynamiAproxy.bo.Subject;
import DDesignModel.AProxy.BJdkDynamiAproxy.boImpl.Subjectlmpl;
import DDesignModel.AProxy.BJdkDynamiAproxy.proxyHandlerClass.JdkDynamicProxyHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理：使用jdk的反射机制，创建对象的能力，创建的是代理类的对象，而不是创建类文件。
 *            动态代理：在程序执行时，调用jdk的提供的方法动态创建class文件，创建代理类的对象。
 *    特点：不用创建类文件，代理的目标类是活动的，可设置的；可以随时给不同的目标创建代理。
 *
 * 使用步骤
 *    1、 新建一个接口,定义目标类要完成的功能。
 *    2、 创建目标类，实现接口
 *    3、 创建代理类，实现java.lang.reflect.InvocationHandler接口：调用目标方法，增强方法功能。
 *    4、 使用proxy类的静态方法，创建代理对象，并把返回值转为接口类型。
 *
 * 可看到
 *    1、代理类继承了Proxy类并且实现了要代理的接口，由于java不支持多继承，所以JDK动态代理不能代理类，只能代理接口。
 *    2、代理类：重写了equals、hashCode、toString；有一个静态代码块，通过反射或者代理类的所有方法。
 *    4、通过invoke执行代理类中的目标方法doSomething。
 *
 * java中动态代理主要有JDK和CGLIB两种方式。
 *    区别主要是jdk是代理接口（目标类必须实现接口，没有接口的话使用cglib），而cglib是代理类。
 *    jdk的动态代理调用了Proxy.newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h) 方法。
 *    通过该方法生成字节码，动态的创建了一个代理类，interfaces参数是该动态类所继承的所有接口，而继承InvocationHandler 接口的类则是实现在调用代理接口方法前后的具体逻辑
 */
public class JdkDynamicProxyHandlerTest {
    public static void main(String[] args) {
//        保存生成的代理类的字节码文件
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        //1。创建目标对象：使用Proxy
         Subject target = new Subjectlmpl();//接口的引用指向子类的声明
        //2。创建InvocationHandler对象:
         InvocationHandler handler  = new JdkDynamicProxyHandler(target);//接口的引用指向子类的声明
        //3.创建代理对象;并把返回值转为接口类型(可以强转是因为目标对象实现了这个接口)
        Subject proxyTargetObject = (Subject) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),handler);

        System.out.println("动态代理对象获取到的的代理对象名称:"+ proxyTargetObject.getClass().getName());

        //4.通过动态代理对象执行方法
        proxyTargetObject.doSomething("zhangsan");
        proxyTargetObject.wirte("lisi");
    }
}
