package DDesignModel.AProxy.AJdkStaticProxy.bolmpl;

import DDesignModel.AProxy.AJdkStaticProxy.bo.SmsService;
/**
 * 2. 中国移动实现发送短信的接口
 */
public class SmsServiceByYdImpl implements SmsService {
    @Override
    public String send(String message) {
        System.out.println("中国移动的 send message : " + message);
        return message;
    }
}
