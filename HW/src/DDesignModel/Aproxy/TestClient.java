package DDesignModel.Aproxy;


import DDesignModel.Aproxy.Bo.Subject;
import DDesignModel.Aproxy.Impl.JDKDynamicProxy;
import DDesignModel.Aproxy.Impl.RealSubject;

/**
 * JDK动态代理是代理模式的一种实现方式，其只能代理接口。
 * 使用步骤
 *    1、 新建一个接口
 *    2、 为接口创建一个实现类
 *    3、 创建代理类实现java.lang.reflect.InvocationHandler接口
 *    4、 测试
 */
public class TestClient {
    public static void main(String[] args) {
        // 保存生成的代理类的字节码文件
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        // jdk动态代理测试
        Subject subject = new JDKDynamicProxy(new RealSubject()).getProxy();
        subject.doSomething();
    }
}
