package DDesignModel.AProxy.BJdkDynamiAproxy;

import DDesignModel.AProxy.BJdkDynamiAproxy.BoImpl.Subjectlmpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflact {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException,IllegalAccessException {
        Subjectlmpl target = new Subjectlmpl();
        Method method = new Subjectlmpl().getClass().getMethod("doSomething", String.class);
        //通过Method的invoke可以执行指定参数的调用。invoke是Method类中的一个方法调用，表示方法的执行。
        method.invoke(target, "lisi");//执行target对象的doSomething方法，参数是：lisi。
    }
}
