package DDesignModel.AProxy.AJdkStaticProxy.proxy;

import DDesignModel.AProxy.AJdkStaticProxy.bo.SmsService;

/**
 * 3. 创建代理类并同样实现发送短信的接口
 *     做的事情：
 *      1、调用被代理类的方法
 *      2、功能增强
 */
public class SmsProxyByDx implements SmsService {
    // 此处声明代理类的代理对象(同一个接口的实现子类可能有多个，此处表示接口的子类都可以)：在代理类中定义一个被代理对象的引用，而后在代理类方法中调用该对象的方法。
    private final SmsService smsService;

    public SmsProxyByDx(SmsService smsService) {
        this.smsService = smsService;
    }

    @Override
    public String send(String message) {
        //调用方法之前，我们可以添加自己的操作
        System.out.println("静态代理 before method send()");

        //代理类本身不重写函数功能，而是通过调用被代理类中的方法来实现函数功能。
        smsService.send(message);

        //调用方法之后，我们同样可以添加自己的操作
        System.out.println("静态代理 after method send()");

        return message;
    }
}
