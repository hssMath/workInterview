package DDesignModel.BDynamicAproxy;


import DDesignModel.BDynamicAproxy.Bo.Subject;
import DDesignModel.BDynamicAproxy.Impl.JDKDynamicProxy;
import DDesignModel.BDynamicAproxy.Impl.Subjectlmpl;

/**
 * JDK��̬�����Ǵ���ģʽ��һ��ʵ�ַ�ʽ����ֻ�ܴ���ӿڡ�
 * ʹ�ò���
 *    1�� �½�һ���ӿ�
 *    2�� Ϊ�ӿڴ���һ��ʵ����
 *    3�� ����������ʵ��java.lang.reflect.InvocationHandler�ӿ�
 *    4�� ����
 *
 * �ɿ���
 *    1��������̳���Proxy�ಢ��ʵ����Ҫ����Ľӿڣ�����java��֧�ֶ�̳У�����JDK��̬�����ܴ�����
 *    2����д��equals��hashCode��toString
 *    3����һ����̬����飬ͨ��������ߴ���������з���
 *    4��ͨ��invokeִ�д������е�Ŀ�귽��doSomething
 */
public class TestClient {
    public static void main(String[] args) {
        // �������ɵĴ�������ֽ����ļ�
//        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        // jdk��̬�������
        Subject subject = new JDKDynamicProxy(new Subjectlmpl()).getProxy();
        subject.doSomething();
    }
}
