package DDesignModel.AProxy.BJdkDynamiAproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 *  代理类：必须实现InvocationHandler接口，完成代理类要做的功能(1.调用目标方法；2.功能增强)。
 *
 * 使用步骤
 *    1、 新建一个接口,定义目标类要完成的功能。
 *    2、 创建目标类，实现接口
 *    3、 创建代理类，实现java.lang.reflect.InvocationHandler接口：调用目标方法，增强方法功能。
 *    4、 使用proxy类的静态方法，创建代理对象，并把返回值转为接口类型。
 */
public class JdkDynamicProxyHandler implements InvocationHandler {
    private Object target = null;

    //1.动态代理：目标对象是活动的，不是固定的，需要传入进来；传入是谁，就给谁创建代理。
    public JdkDynamicProxyHandler(Object object){
        //给目标对象赋值
        this.target = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = method.invoke(target, args);//2.执行目标方法
        //3.方法增强：在不改变原来代码的基础之上，可以在代理中增强自己的代码功能。eg：项目中，有个功能是其他人写好的，自己可以调用。某天发现这个功能需要再改进，然后增加子的代码，就可以使用动态代理增加新的功能。
        if (object != null) {
            System.out.println("得到目标对象的代理对象了");
        }
        return object;
    }
}
