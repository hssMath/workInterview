package DDesignModel.AProxy.AJdkStaticProxy.bolmpl;

import DDesignModel.AProxy.AJdkStaticProxy.bo.GoodByeBo;

public class GoodByeBoImpl implements GoodByeBo {

    @Override
    public void sayGoodBye() {
        System.out.println("目标类的sayGoodBye方法");
    }
}
