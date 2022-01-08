package DDesignModel.AProxy.BJdkDynamiAproxy.BoImpl;

import DDesignModel.AProxy.BJdkDynamiAproxy.Bo.Subject;

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
        System.out.println("Subjectlmpl do something:"+str);
    }

    @Override
    public void wirte(String str) {
        System.out.println("wirte do something:"+str);
    }
}