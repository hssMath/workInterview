package DDesignModel.AJdkStaticProxy;

import DDesignModel.AJdkStaticProxy.Bolmpl.HelloProxyImpl;

/**
 * ���������ֶ������ģ�Ŀ�����ǹ̶��ġ�
 */
public class TestJdkStaticProxy {
    public static void main(String[] args) {
        HelloProxyImpl helloProxy = new HelloProxyImpl();
        helloProxy.sayHello();
    }
}
