package DDesignModel.AProxy.BJdkDynamiAproxy.boImpl;

import DDesignModel.AProxy.BJdkDynamiAproxy.bo.Subject;

/**
 * Subjectlmpl
 * ��ʵ������
 *
 * @author
 * @create 2018-03-29 14:21
 **/
public class Subjectlmpl implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("Ŀ�����doSomething������target dosomething:"+str);
    }

    @Override
    public void wirte(String str) {
        System.out.println("Ŀ�����wirte������target wirte:"+str);
    }
}