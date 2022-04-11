package DDesignModel.AProxy.AJdkStaticProxy.bolmpl;

import DDesignModel.AProxy.AJdkStaticProxy.bo.HelloBo;

/**
 * 目标类的某个方法
 */
public class HelloImpl implements HelloBo {
    @Override
    public void sayHello() {
        System.out.println("目标类的sayHello方法");
    }
}
