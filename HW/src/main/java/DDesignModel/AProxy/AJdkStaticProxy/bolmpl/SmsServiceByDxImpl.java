package DDesignModel.AProxy.AJdkStaticProxy.bolmpl;

import DDesignModel.AProxy.AJdkStaticProxy.bo.SmsService;

/**
 * 2. 中国电信实现发送短信的接口
 */
public class SmsServiceByDxImpl implements SmsService {
    public String send(String message) {
        System.out.println("中国电信的 send message : " + message);
        return message;
    }
}