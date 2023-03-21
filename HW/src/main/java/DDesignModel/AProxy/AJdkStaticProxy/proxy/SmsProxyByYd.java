package DDesignModel.AProxy.AJdkStaticProxy.proxy;

import DDesignModel.AProxy.AJdkStaticProxy.bo.SmsService;
import DDesignModel.AProxy.AJdkStaticProxy.bolmpl.SmsServiceByYdImpl;

//������ SmsProxyByYd
public class SmsProxyByYd implements SmsService {
    // ��������Ϊ SmsServiceByYdImpl
    private SmsServiceByYdImpl smsServiceByYdImpl = new SmsServiceByYdImpl();

    @Override
    public String send(String message) {
        //���÷���֮ǰ�����ǿ�������Լ��Ĳ���
        System.out.println("��̬���� before method send()");

        //�����౾����д�������ܣ�����ͨ�����ñ��������еķ�����ʵ�ֺ������ܡ�
        smsServiceByYdImpl.send(message);

        //���÷���֮������ͬ����������Լ��Ĳ���
        System.out.println("��̬���� after method send()");
        return message;
    }
}
