package DDesignModel.AProxy.AJdkStaticProxy.proxy;

import DDesignModel.AProxy.AJdkStaticProxy.Bo.GoodByeBo;
import DDesignModel.AProxy.AJdkStaticProxy.Bolmpl.GoodByeBoImpl;

/**
 * 1.创建一个接口，定义一个方法。表示目标和代理类要做的事情。
 * 2.创建实现类实现目标接口的方法，
 * 3.创建代理类，实现目标接口的方法。
 * 4.创建被代理类，调用代理类的方法。
 */

/**
 * JDK静态代理：
 *      创建一个接口，然后创建被代理的类实现该接口并且实现该接口中的抽象方法。
 *      之后再创建一个代理类，同时使其也实现这个接口。在代理类中持有一个被代理对象的引用，而后在代理类方法中调用该对象的方法。
 */
public class GoodByeProxyImpl implements GoodByeBo {
    //代理的是哪个对象:在代理类中持有一个被代理对象的引用，而后在代理类方法中调用该对象的方法。
    private final GoodByeBoImpl goodByeBo = new GoodByeBoImpl();

    @Override
    public void sayGoodBye() {//目标方法的调用；功能的增强。
        /**
         * 代理类本身不实现服务，而是通过调用被代理类中的方法来提供服务。
         */
        goodByeBo.sayGoodBye();
    }
}
