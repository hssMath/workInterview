package DDesignModel.AProxy.AJdkStaticProxy.proxy;

import DDesignModel.AProxy.AJdkStaticProxy.bo.SmsService;
import DDesignModel.AProxy.AJdkStaticProxy.bolmpl.SmsServiceByYdImpl;

//代理类 SmsProxyByYd
public class SmsProxyByYd implements SmsService {
    // 被代理类为 SmsServiceByYdImpl
    private SmsServiceByYdImpl smsServiceByYdImpl = new SmsServiceByYdImpl();

    @Override
    public String send(String message) {
        //调用方法之前，我们可以添加自己的操作
        System.out.println("静态代理 before method send()");

        //代理类本身不重写函数功能，而是通过调用被代理类中的方法来实现函数功能。
        smsServiceByYdImpl.send(message);

        //调用方法之后，我们同样可以添加自己的操作
        System.out.println("静态代理 after method send()");
        return message;
    }
}
