package DDesignModel.AProxy.AJdkStaticProxy;

import DDesignModel.AProxy.AJdkStaticProxy.bo.SmsService;
import DDesignModel.AProxy.AJdkStaticProxy.bolmpl.SmsServiceByDxImpl;
import DDesignModel.AProxy.AJdkStaticProxy.proxy.SmsProxyByYd;
import DDesignModel.AProxy.AJdkStaticProxy.proxy.SmsProxyByDx;

/**
 *  ��̬������
 *      ��̬�����У����Ƕ�Ŀ������ÿ����������ǿ�����ֶ���ɵģ�����������ʾ���룩���ǳ���������ӿ�һ�������ӷ�����Ŀ�����ʹ���
 *      ����Ҫ�����޸ģ����鷳(��Ҫ��ÿ��Ŀ���඼����дһ��������)��
 *      ���������Ǵ�ʵ�ֺ�Ӧ�ýǶ���˵�ľ�̬�������� JVM ������˵����̬�����ڱ���ʱ�ͽ��ӿڡ�ʵ���ࡢ��������Щ�������һ����ʵ�ʵ� class �ļ���
 *
 * JDK��̬���������̣�
 *      ����һ���ӿڣ�Ȼ�󴴽�ʵ�ָýӿڵ��ಢ��ʵ�ָýӿ��еķ�����
 *      ֮���ٴ���һ�������࣬ͬʱʹ��Ҳʵ������ӿڣ��ڴ������г���һ�����������������
 *      ������ô������еĸ÷�����
 *
 * ���������ֶ������� java �ļ���Ŀ������һ���̶��Ľӿڡ��� spring �У��ֶ����������࣬�ӿڼ��ӿڷ����Ѿ�������ˡ�
 * ���ǿ��Կ�����ʹ��JDK��̬���������׾�����˶�һ����Ĵ���������
 * ����JDK��̬������ȱ�㣺
 *      1.���ڴ���ֻ��Ϊһ������������Ҫ��������ܶ࣬��ô����Ҫ��д�����Ĵ����࣬�ȽϷ�����
 *      2.Ŀ����ķ���������ʱ��,��Ҫ��̬�����������ʵ�ַ�����
 */
public class TestSmsService {
    public static void main(String[] args) {
        // ��̬������SmsProxyByDx ���� SmsServiceByDxImpl
        SmsService smsService = new SmsServiceByDxImpl();
        SmsProxyByDx smsProxyByDx = new SmsProxyByDx(smsService);
        smsProxyByDx.send("java");

        // ��̬������SmsProxyByYd ���� SmsServiceByYdImpl
        SmsProxyByYd smsProxyByYd = new SmsProxyByYd();
        smsProxyByYd.send("shell");
    }
}