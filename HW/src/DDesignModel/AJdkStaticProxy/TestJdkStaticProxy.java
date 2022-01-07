package DDesignModel.AJdkStaticProxy;

import DDesignModel.AJdkStaticProxy.proxy.GoodByeProxyImpl;
import DDesignModel.AJdkStaticProxy.proxy.HelloProxyImpl;

/**
 * ���������ֶ������ģ�Ŀ�����ǹ̶��ġ�
 * ���ǿ��Կ�����ʹ��JDK��̬��������׾�����˶�һ����Ĵ��������
 *  ����JDK��̬�����ȱ��Ҳ��¶�˳��������ڴ���ֻ��Ϊһ������������Ҫ�������ܶ࣬��ô����Ҫ��д�����Ĵ����࣬�ȽϷ�����
 */
public class TestJdkStaticProxy {
    public static void main(String[] args) {
        HelloProxyImpl helloProxy = new HelloProxyImpl();
        helloProxy.sayHello();
        GoodByeProxyImpl goodByeProxy = new GoodByeProxyImpl();
        goodByeProxy.sayGoodBye();
    }
}
