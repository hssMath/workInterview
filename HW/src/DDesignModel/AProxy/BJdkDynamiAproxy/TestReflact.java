package DDesignModel.AProxy.BJdkDynamiAproxy;

import DDesignModel.AProxy.BJdkDynamiAproxy.BoImpl.Subjectlmpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflact {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException,IllegalAccessException {
        Subjectlmpl target = new Subjectlmpl();
        Method method = new Subjectlmpl().getClass().getMethod("doSomething", String.class);
        //ͨ��Method��invoke����ִ��ָ�������ĵ��á�invoke��Method���е�һ���������ã���ʾ������ִ�С�
        method.invoke(target, "lisi");//ִ��target�����doSomething�����������ǣ�lisi��
    }
}
