package DDesignModel.AProxy.BJdkDynamiAproxy.boImpl;

import DDesignModel.AProxy.BJdkDynamiAproxy.bo.SmsService;

/**
 * 2. 实现发送短信的接口
 */
public class SmsServiceByYdImpl implements SmsService {
    public String send(String message) {
        System.out.println("真实的 send message : " + message);
        return message;
    }

    @Override
    public String send222(String message) {
        System.out.println("send222方法的 send message : " + message);
        return message;
    }
}