package DDesignModel.AJdkStaticProxy.proxy;

import DDesignModel.AJdkStaticProxy.Bo.HelloBo;
import DDesignModel.AJdkStaticProxy.Bolmpl.GoodByeBoImpl;
import DDesignModel.AJdkStaticProxy.Bolmpl.HelloImpl;
import org.junit.Test;

/**
 * 1.����һ���ӿڣ�����һ����������ʾĿ��ʹ�����Ҫ�������顣
 * 2.����ʵ����ʵ��Ŀ��ӿڵķ�����
 * 3.���������࣬ʵ��Ŀ��ӿڵķ�����
 * 4.�����������࣬���ô�����ķ�����
 */

/**
 * JDK��̬����
 *      ����һ���ӿڣ�Ȼ�󴴽����������ʵ�ָýӿڲ���ʵ�ָýӿ��еĳ��󷽷���
 *      ֮���ٴ���һ�������࣬ͬʱʹ��Ҳʵ������ӿڡ��ڴ������г���һ���������������ã������ڴ����෽���е��øö���ķ�����
 */
public class HelloProxyImpl implements HelloBo {
    //��������ĸ�����:�ڴ������г���һ���������������ã������ڴ����෽���е��øö���ķ�����
    private final HelloImpl helloBo = new HelloImpl();
    private final GoodByeBoImpl goodByeBo = new GoodByeBoImpl();

    @Override
    @Test
    public void sayHello() {//Ŀ�귽���ĵ��ã����ܵ���ǿ��
        /**
         * �����౾��ʵ�ַ��񣬶���ͨ�����ñ��������еķ������ṩ����
         */
        helloBo.sayHello();
        goodByeBo.sayGoodBye();
    }
}
