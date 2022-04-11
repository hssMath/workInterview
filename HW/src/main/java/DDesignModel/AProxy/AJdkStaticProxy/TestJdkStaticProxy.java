package DDesignModel.AProxy.AJdkStaticProxy;

import DDesignModel.AProxy.AJdkStaticProxy.proxy.GoodByeProxyImpl;
import DDesignModel.AProxy.AJdkStaticProxy.proxy.HelloProxyImpl;

/**
 * ���������ֶ������� java �ļ���Ŀ�����ǹ̶��ġ��� sprong �У��ֶ����������࣬Ŀ����Ľӿڼ��ӿڷ����Ѿ�������ˡ�
 * ���ǿ��Կ�����ʹ��JDK��̬��������׾�����˶�һ����Ĵ��������
 *  ����JDK��̬�����ȱ�㣺
 *      1.���ڴ���ֻ��Ϊһ������������Ҫ�������ܶ࣬��ô����Ҫ��д�����Ĵ����࣬�ȽϷ�����
 *      2.Ŀ����ķ���������ʱ��,��Ҫ��̬�����������ʵ�ַ�����
 */
public class TestJdkStaticProxy {
    public static void main(String[] args) {
        HelloProxyImpl helloProxy = new HelloProxyImpl();
        helloProxy.sayHello();

        GoodByeProxyImpl goodByeProxy = new GoodByeProxyImpl();
        goodByeProxy.sayGoodBye();
    }
}
