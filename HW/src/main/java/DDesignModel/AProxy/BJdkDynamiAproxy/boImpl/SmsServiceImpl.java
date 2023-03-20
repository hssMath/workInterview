package DDesignModel.AProxy.BJdkDynamiAproxy.boImpl;

import DDesignModel.AProxy.BJdkDynamiAproxy.bo.SmsService;

/**
 * 2. 实现发送短信的接口
 */
public class SmsServiceImpl implements SmsService {
    public String send(String message) {
        System.out.println("真实的 send message : " + message);
        return message;
    }
}