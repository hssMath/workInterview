package DDesignModel.AProxy.AJdkStaticProxy.Bolmpl;

import DDesignModel.AProxy.AJdkStaticProxy.Bo.HelloBo;

/**
 * Ŀ�����ĳ������
 */
public class HelloImpl implements HelloBo {
    @Override
    public void sayHello() {
        System.out.println("Ŀ�����sayHello����");
    }
}
