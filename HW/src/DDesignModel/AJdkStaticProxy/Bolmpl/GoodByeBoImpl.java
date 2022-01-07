package DDesignModel.AJdkStaticProxy.Bolmpl;

import DDesignModel.AJdkStaticProxy.Bo.GoodByeBo;

public class GoodByeBoImpl implements GoodByeBo {

    @Override
    public void sayGoodBye() {
        System.out.println("目标类的sayGoodBye方法");
    }
}
