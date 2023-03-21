package DDesignModel.AProxy.AJdkStaticProxy.proxy;

import DDesignModel.AProxy.AJdkStaticProxy.bo.SmsService;

/**
 * 3. ���������ಢͬ��ʵ�ַ��Ͷ��ŵĽӿ�
 *     �������飺
 *      1�����ñ�������ķ���
 *      2��������ǿ
 */
public class SmsProxyByDx implements SmsService {
    // �˴�����������Ĵ������(ͬһ���ӿڵ�ʵ����������ж�����˴���ʾ�ӿڵ����඼����)���ڴ������ж���һ���������������ã������ڴ����෽���е��øö���ķ�����
    private final SmsService smsService;

    public SmsProxyByDx(SmsService smsService) {
        this.smsService = smsService;
    }

    @Override
    public String send(String message) {
        //���÷���֮ǰ�����ǿ�������Լ��Ĳ���
        System.out.println("��̬���� before method send()");

        //�����౾����д�������ܣ�����ͨ�����ñ��������еķ�����ʵ�ֺ������ܡ�
        smsService.send(message);

        //���÷���֮������ͬ����������Լ��Ĳ���
        System.out.println("��̬���� after method send()");

        return message;
    }
}
