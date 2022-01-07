package DDesignModel.BJdkDynamiAproxy.BoImpl;

import DDesignModel.BJdkDynamiAproxy.Bo.Subject;

/**
 * Subjectlmpl
 * 真实主题类
 *
 * @author
 * @create 2018-03-29 14:21
 **/
public class Subjectlmpl implements Subject {
    @Override
    public void doSomething() {
        System.out.println("Subjectlmpl do something");
    }
}