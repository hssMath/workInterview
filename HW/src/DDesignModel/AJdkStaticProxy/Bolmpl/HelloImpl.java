package DDesignModel.AJdkStaticProxy.Bolmpl;

import DDesignModel.AJdkStaticProxy.Bo.HelloBo;

/**
 * 目标类的某个方法
 */
public class HelloImpl implements HelloBo {
    @Override
    public void sayHello() {
        System.out.println("hello Java");
    }
}
