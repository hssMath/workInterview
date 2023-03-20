package DDesignModel.AProxy.AJdkStaticProxy.proxy;

import DDesignModel.AProxy.AJdkStaticProxy.bo.SmsService;

/**
 * 3. 创建代理类并同样实现发送短信的接口
 */
public class SmsProxy implements SmsService {
    // 声明代理对象：在代理类中定义一个被代理对象的引用，而后在代理类方法中调用该对象的方法。
    private final SmsService smsService;

    public SmsProxy(SmsService smsService) {
        this.smsService = smsService;
    }

    @Override
    public String send(String message) {
        //调用方法之前，我们可以添加自己的操作
        System.out.println("静态代理 before method send()");
        //代理类本身不实现服务，而是通过调用被代理类中的方法来提供服务。
        this.smsService.send(message);
        //调用方法之后，我们同样可以添加自己的操作
        System.out.println("静态代理 after method send()");
        return message;
    }
}
