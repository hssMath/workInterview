package DDesignModel.AProxy.AJdkStaticProxy.bolmpl;

import DDesignModel.AProxy.AJdkStaticProxy.bo.HelloBo;

/**
 * Ŀ�����ĳ������
 */
public class HelloImpl implements HelloBo {
    @Override
    public void sayHello() {
        System.out.println("Ŀ�����sayHello����");
    }
}
