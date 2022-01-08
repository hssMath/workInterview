package DDesignModel.AProxy.AJdkStaticProxy.Bolmpl;

import DDesignModel.AProxy.AJdkStaticProxy.Bo.HelloBo;

/**
 * 目标类的某个方法
 */
public class HelloImpl implements HelloBo {
    @Override
    public void sayHello() {
        System.out.println("目标类的sayHello方法");
    }
}
