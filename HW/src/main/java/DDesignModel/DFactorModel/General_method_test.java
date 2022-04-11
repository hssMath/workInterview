package DDesignModel.DFactorModel;


import DDesignModel.DFactorModel.bo.Impl.General_Impl_1;
import DDesignModel.DFactorModel.bo.Impl.General_Impl_2;
import DDesignModel.DFactorModel.entity.G_XiaoMing;

public class General_method_test {
	/**
	 *
	 * @Description:常用工厂模式
	 * 	  1.简单工厂模式严重违背了“开闭原则”，难以拓展，由此产生了工厂方法模式。
	 *    2.工厂方法模式是对简单工厂模式进行了抽象化，符合“开闭原则”，实现了可扩展。
	 *    3.工厂方法模式的意义是定义一个创建工厂接口，将实际创建工作推迟到子类当中。
	 * @author:heshuanshuan
	 * @date:2019年5月28日
	 * @return:void 
	 */
     public static void main(String[] args) {
    	 G_XiaoMing G_XiaoMing = new G_XiaoMing();
    	 
    	 General_Impl_2 motorcycleGarage = new General_Impl_2();
    	 General_Impl_1 carGaraget = new General_Impl_1();
    	 
    	 G_XiaoMing.goToSchool(motorcycleGarage);//小明骑摩托车去学校
    	 G_XiaoMing.travel(carGaraget);// 小明开汽车去旅游
	}
}
