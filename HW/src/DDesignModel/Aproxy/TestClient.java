package DDesignModel.Aproxy;


import DDesignModel.Aproxy.Bo.Subject;
import DDesignModel.Aproxy.Impl.JDKDynamicProxy;
import DDesignModel.Aproxy.Impl.RealSubject;

/**
 * JDK��̬�����Ǵ���ģʽ��һ��ʵ�ַ�ʽ����ֻ�ܴ���ӿڡ�
 * ʹ�ò���
 *    1�� �½�һ���ӿ�
 *    2�� Ϊ�ӿڴ���һ��ʵ����
 *    3�� ����������ʵ��java.lang.reflect.InvocationHandler�ӿ�
 *    4�� ����
 */
public class TestClient {
    public static void main(String[] args) {
        // �������ɵĴ�������ֽ����ļ�
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        // jdk��̬�������
        Subject subject = new JDKDynamicProxy(new RealSubject()).getProxy();
        subject.doSomething();
    }
}
