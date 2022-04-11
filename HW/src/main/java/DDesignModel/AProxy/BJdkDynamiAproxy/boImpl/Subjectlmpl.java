package DDesignModel.AProxy.BJdkDynamiAproxy.boImpl;

import DDesignModel.AProxy.BJdkDynamiAproxy.bo.Subject;

/**
 * Subjectlmpl
 * 真实主题类
 *
 * @author
 * @create 2018-03-29 14:21
 **/
public class Subjectlmpl implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("目标类的doSomething方法：target dosomething:"+str);
    }

    @Override
    public void wirte(String str) {
        System.out.println("目标类的wirte方法：target wirte:"+str);
    }
}