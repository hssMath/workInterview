package DDesignModel.AProxy.BJdkDynamiAproxy.boImpl;

import DDesignModel.AProxy.BJdkDynamiAproxy.bo.SmsService;

/**
 * 2. ʵ�ַ��Ͷ��ŵĽӿ�
 */
public class SmsServiceByYdImpl implements SmsService {
    public String send(String message) {
        System.out.println("��ʵ�� send message : " + message);
        return message;
    }

    @Override
    public String send222(String message) {
        System.out.println("send222������ send message : " + message);
        return message;
    }
}