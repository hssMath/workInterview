package DDesignModel.AProxy.BJdkDynamiAproxy.proxyClass;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 3. ����һ��JDK��̬������
 *
 * �����ࣺ����ʵ�� InvocationHandler �ӿڣ���ɴ�����Ҫ���Ĺ���(1.����Ŀ�귽����2.������ǿ)��
 *
 * ʹ�ò���
 *    1������һ���ӿڼ���ʵ���ࣻ
 *    2�����������࣬ʵ��java.lang.reflect.InvocationHandler�ӿڣ�����д invoke �������� invoke �����е���ԭ��������������
 *        ��ķ��������Զ���һЩ�����߼���
 *    3��ͨ�� Proxy.newProxyInstance(ClassLoader loader,Class<?>[] interfaces,InvocationHandler h) ���������������
 *        ���ѷ���ֵתΪ�ӿ����͡�
 */
public class DynamicAProxyClass implements InvocationHandler {
    // �������е���ʵ����Ŀ������ǿ��Զ�̬�޸ĵģ����ǹ̶��ģ���Ҫ���������������˭���͸�˭��������
    private final Object target;

    public DynamicAProxyClass(Object target) {
        this.target = target;
    }

    /**
     * invoke() ��������������������
     * @param proxy ��̬���ɵĴ�����
     * @param method ������������õķ������Ӧ
     * @param args ��ǰ method �����Ĳ���
     * @return
     * @throws InvocationTargetException
     * @throws IllegalAccessException
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws InvocationTargetException, IllegalAccessException {
        //���÷���֮ǰ�����ǿ�������Լ��Ĳ���
        System.out.println("JDK��̬���� before method " + method.getName());

        // ������ǿ���ڲ��ı�ԭ������Ļ���֮�ϣ������ڴ�������ǿ�Լ��Ĵ��빦��
        Object result = method.invoke(target, args);

        //���÷���֮������ͬ����������Լ��Ĳ���
        System.out.println("JDK��̬���� after method " + method.getName());
        return result;
    }
}
