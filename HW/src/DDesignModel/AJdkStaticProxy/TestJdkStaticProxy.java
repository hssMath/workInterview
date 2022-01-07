package DDesignModel.AJdkStaticProxy;

import DDesignModel.AJdkStaticProxy.Bolmpl.HelloProxyImpl;

/**
 * 代理类是手动创建的，目标类是固定的。
 */
public class TestJdkStaticProxy {
    public static void main(String[] args) {
        HelloProxyImpl helloProxy = new HelloProxyImpl();
        helloProxy.sayHello();
    }
}
