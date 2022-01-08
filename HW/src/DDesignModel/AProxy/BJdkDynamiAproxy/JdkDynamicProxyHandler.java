package DDesignModel.AProxy.BJdkDynamiAproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *  �����ࣺ����ʵ��InvocationHandler�ӿڣ���ɴ�����Ҫ���Ĺ���(1.����Ŀ�귽����2.������ǿ)��
 *
 * ʹ�ò���
 *    1�� �½�һ���ӿ�,����Ŀ����Ҫ��ɵĹ��ܡ�
 *    2�� ����Ŀ���࣬ʵ�ֽӿ�
 *    3�� ���������࣬ʵ��java.lang.reflect.InvocationHandler�ӿڣ�����Ŀ�귽������ǿ�������ܡ�
 *    4�� ʹ��proxy��ľ�̬����������������󣬲��ѷ���ֵתΪ�ӿ����͡�
 */
public class JdkDynamicProxyHandler implements InvocationHandler {
    private Object target = null;

    //1.��̬����Ŀ������ǻ�ģ����ǹ̶��ģ���Ҫ���������������˭���͸�˭��������
    public JdkDynamicProxyHandler(Object object){
        //��Ŀ�����ֵ
        this.target = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = method.invoke(target, args);//2.ִ��Ŀ�귽��
        //3.������ǿ���ڲ��ı�ԭ������Ļ���֮�ϣ������ڴ�������ǿ�Լ��Ĵ��빦�ܡ�eg����Ŀ�У��и�������������д�õģ��Լ����Ե��á�ĳ�췢�����������Ҫ�ٸĽ���Ȼ�������ӵĴ��룬�Ϳ���ʹ�ö�̬���������µĹ��ܡ�
        if (object != null) {
            System.out.println("�õ�Ŀ�����Ĵ��������");
        }
        return object;
    }
}
