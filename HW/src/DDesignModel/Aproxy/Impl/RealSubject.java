package DDesignModel.Aproxy.Impl;

import DDesignModel.Aproxy.Bo.Subject;

/**
 * RealSubject
 * ��ʵ������
 *
 * @author
 * @create 2018-03-29 14:21
 **/
public class RealSubject implements Subject {
    @Override
    public void doSomething() {
        System.out.println("RealSubject do something");
    }
}