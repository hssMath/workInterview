package DDesignModel.AProxy.AJdkStaticProxy.bolmpl;

import DDesignModel.AProxy.AJdkStaticProxy.bo.SmsService;
/**
 * 2. �й��ƶ�ʵ�ַ��Ͷ��ŵĽӿ�
 */
public class SmsServiceByYdImpl implements SmsService {
    @Override
    public String send(String message) {
        System.out.println("�й��ƶ��� send message : " + message);
        return message;
    }
}
