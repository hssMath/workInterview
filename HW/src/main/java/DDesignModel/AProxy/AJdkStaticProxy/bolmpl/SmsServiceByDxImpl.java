package DDesignModel.AProxy.AJdkStaticProxy.bolmpl;

import DDesignModel.AProxy.AJdkStaticProxy.bo.SmsService;

/**
 * 2. �й�����ʵ�ַ��Ͷ��ŵĽӿ�
 */
public class SmsServiceByDxImpl implements SmsService {
    public String send(String message) {
        System.out.println("�й����ŵ� send message : " + message);
        return message;
    }
}