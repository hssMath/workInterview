package DDesignModel.BDynamicAproxy;


import DDesignModel.BDynamicAproxy.Bo.Subject;
import DDesignModel.BDynamicAproxy.Impl.JDKDynamicProxy;
import DDesignModel.BDynamicAproxy.Impl.Subjectlmpl;

/**
 * JDK动态代理是代理模式的一种实现方式，其只能代理接口。
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
 */
public class TestClient {
    public static void main(String[] args) {
        // 保存生成的代理类的字节码文件
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        // jdk动态代理测试
        Subject subject = new JDKDynamicProxy(new Subjectlmpl()).getProxy();
        subject.doSomething();
    }
}
