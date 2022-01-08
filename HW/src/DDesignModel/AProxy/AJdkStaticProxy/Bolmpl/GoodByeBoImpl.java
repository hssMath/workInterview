package DDesignModel.AProxy.AJdkStaticProxy.Bolmpl;

import DDesignModel.AProxy.AJdkStaticProxy.Bo.GoodByeBo;

public class GoodByeBoImpl implements GoodByeBo {

    @Override
    public void sayGoodBye() {
        System.out.println("目标类的sayGoodBye方法");
    }
}
