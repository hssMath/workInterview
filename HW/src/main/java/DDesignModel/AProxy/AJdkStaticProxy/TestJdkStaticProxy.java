package DDesignModel.AProxy.AJdkStaticProxy;

import DDesignModel.AProxy.AJdkStaticProxy.proxy.GoodByeProxyImpl;
import DDesignModel.AProxy.AJdkStaticProxy.proxy.HelloProxyImpl;

/**
 * 代理类是手动创建的 java 文件，目标类是固定的。在 sprong 中，手动创建代理类，目标类的接口及接口方法已经定义好了。
 * 我们可以看出，使用JDK静态代理很容易就完成了对一个类的代理操作。
 *  但是JDK静态代理的缺点：
 *      1.由于代理只能为一个类服务，如果需要代理的类很多，那么就需要编写大量的代理类，比较繁琐。
 *      2.目标类的方法调整的时候,需要动态调整代理类的实现方法。
 */
public class TestJdkStaticProxy {
    public static void main(String[] args) {
        HelloProxyImpl helloProxy = new HelloProxyImpl();
        helloProxy.sayHello();

        GoodByeProxyImpl goodByeProxy = new GoodByeProxyImpl();
        goodByeProxy.sayGoodBye();
    }
}
