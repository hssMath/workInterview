package DDesignModel.AProxy.AJdkStaticProxy.proxy;

import DDesignModel.AProxy.AJdkStaticProxy.bo.SmsService;

/**
 * 3. ���������ಢͬ��ʵ�ַ��Ͷ��ŵĽӿ�
 */
public class SmsProxy implements SmsService {
    // ������������ڴ������ж���һ���������������ã������ڴ����෽���е��øö���ķ�����
    private final SmsService smsService;

    public SmsProxy(SmsService smsService) {
        this.smsService = smsService;
    }

    @Override
    public String send(String message) {
        //���÷���֮ǰ�����ǿ�������Լ��Ĳ���
        System.out.println("��̬���� before method send()");
        //�����౾��ʵ�ַ��񣬶���ͨ�����ñ��������еķ������ṩ����
        this.smsService.send(message);
        //���÷���֮������ͬ����������Լ��Ĳ���
        System.out.println("��̬���� after method send()");
        return message;
    }
}
