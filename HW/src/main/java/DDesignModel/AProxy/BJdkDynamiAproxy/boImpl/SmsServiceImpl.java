package DDesignModel.AProxy.BJdkDynamiAproxy.boImpl;

import DDesignModel.AProxy.BJdkDynamiAproxy.bo.SmsService;

/**
 * 2. ʵ�ַ��Ͷ��ŵĽӿ�
 */
public class SmsServiceImpl implements SmsService {
    public String send(String message) {
        System.out.println("��ʵ�� send message : " + message);
        return message;
    }
}