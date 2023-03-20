package DDesignModel.AProxy.AJdkStaticProxy;

import DDesignModel.AProxy.AJdkStaticProxy.bo.SmsService;
import DDesignModel.AProxy.AJdkStaticProxy.bolmpl.SmsServiceImpl;
import DDesignModel.AProxy.AJdkStaticProxy.proxy.SmsProxy;

/**
 *  静态代理：
 *      静态代理中，我们对目标对象的每个方法的增强都是手动完成的（后面会具体演示代码），非常不灵活（比如接口一旦新增加方法，目标对象和代理
 *      对象都要进行修改）且麻烦(需要对每个目标类都单独写一个代理类)。
 *      上面我们是从实现和应用角度来说的静态代理。从 JVM 层面来说，静态代理在编译时就将接口、实现类、代理类这些都变成了一个个实际的 class 文件。
 *
 * JDK静态代理的流程：
 *      创建一个接口；
 *      然后创建实现该接口的类并且实现该接口中的抽象方法；
 *      之后再创建一个代理类，同时使其也实现这个接口，在代理类中持有一个被代理对象的引用
 *      而后在代理类方法中调用该对象的方法。
 *
 * 代理类是手动创建的 java 文件，目标类是一个固定的接口。在 spring 中，手动创建代理类，接口及接口方法已经定义好了。
 * 我们可以看出，使用JDK静态代理很容易就完成了对一个类的代理操作：
 * 但是JDK静态代理的缺点：
 *      1.由于代理只能为一个类服务，如果需要代理的类很多，那么就需要编写大量的代理类，比较繁琐。
 *      2.目标类的方法调整的时候,需要动态调整代理类的实现方法。
 */
public class TestSmsService {
    public static void main(String[] args) {
        // 静态代理
        SmsService smsService = new SmsServiceImpl();
        SmsProxy smsProxy = new SmsProxy(smsService);
        smsProxy.send("java");
    }
}
