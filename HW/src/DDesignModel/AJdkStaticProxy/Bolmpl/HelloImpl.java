package DDesignModel.AJdkStaticProxy.Bolmpl;

import DDesignModel.AJdkStaticProxy.Bo.HelloBo;

/**
 * Ŀ�����ĳ������
 */
public class HelloImpl implements HelloBo {
    @Override
    public void sayHello() {
        System.out.println("hello Java");
    }
}
