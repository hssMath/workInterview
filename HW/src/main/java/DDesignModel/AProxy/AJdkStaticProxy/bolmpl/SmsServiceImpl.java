package DDesignModel.AProxy.AJdkStaticProxy.bolmpl;

import DDesignModel.AProxy.AJdkStaticProxy.bo.SmsService;

/**
 * 2. ʵ�ַ��Ͷ��ŵĽӿ�
 */
public class SmsServiceImpl implements SmsService {
    public String send(String message) {
        System.out.println("��ʵ�� send message : " + message);
        return message;
    }
}