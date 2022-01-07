package DDesignModel.AJdkStaticProxy;

import DDesignModel.AJdkStaticProxy.proxy.GoodByeProxyImpl;
import DDesignModel.AJdkStaticProxy.proxy.HelloProxyImpl;

/**
 * 代理类是手动创建的，目标类是固定的。
 * 我们可以看出，使用JDK静态代理很容易就完成了对一个类的代理操作。
 *  但是JDK静态代理的缺点也暴露了出来：由于代理只能为一个类服务，如果需要代理的类很多，那么就需要编写大量的代理类，比较繁琐。
 */
public class TestJdkStaticProxy {
    public static void main(String[] args) {
        HelloProxyImpl helloProxy = new HelloProxyImpl();
        helloProxy.sayHello();
        GoodByeProxyImpl goodByeProxy = new GoodByeProxyImpl();
        goodByeProxy.sayGoodBye();
    }
}
