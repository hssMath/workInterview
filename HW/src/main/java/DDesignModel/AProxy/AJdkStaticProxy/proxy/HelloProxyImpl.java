package DDesignModel.AProxy.AJdkStaticProxy.proxy;

import DDesignModel.AProxy.AJdkStaticProxy.bo.HelloBo;
import DDesignModel.AProxy.AJdkStaticProxy.bolmpl.GoodByeBoImpl;
import DDesignModel.AProxy.AJdkStaticProxy.bolmpl.HelloImpl;

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
    public void sayHello() {//Ŀ�귽���ĵ��ã����ܵ���ǿ��
        /**
         * �����౾��ʵ�ַ��񣬶���ͨ�����ñ��������еķ������ṩ����
         */
        helloBo.sayHello();
        goodByeBo.sayGoodBye();
    }
}
