package DDesignModel.DFactorModel;


import DDesignModel.DFactorModel.bo.Impl.Simpleness_Impl_1;
import DDesignModel.DFactorModel.bo.Impl.Simpleness_Impl_2;
import DDesignModel.DFactorModel.bo.Simpleness_method;

public class Smpleness_GarageFactory {
	/**
	 * @Description:简单工厂
	 * @param:@param type
	 * @param:@return
	 * @author:heshuanshuan
	 * @date:2019年5月28日
	 * @return:IVehicle
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	public static Simpleness_method getVehicle(String type) {
        if ("Simpleness_Impl_1".equals(type)) {
            return new Simpleness_Impl_1();
        }else if ("Simpleness_Impl_2".equals(type)) {
            return new Simpleness_Impl_2();
        }
        throw new IllegalArgumentException("请输入车类型");
    }
	
	 public static void main(String[] args) {
		/**
		  * 简单工厂模式属于类的创新型模式，又叫静态工厂方法模式（Static FactoryMethod Pattern）
		  * 是通过专门定义一个类来负责创建其他类的实例，被创建的实例通常都具有共同的父类。
		  * 简单工厂模式
		  * 	解决的问题:如何去实例化一个合适的对象。
		  * 	核心思想:有一个专门的类来负责创建实例的过程。
		  * 
		  * 总结：
	   		1.简单工厂有利于软件系统结构的优化；但是由于一切逻辑都集中在一个工厂类中，导致了没有很高的内聚性，同时也违背了“开放封闭原则”。
			2.简单工厂模式的方法一般都是静态的，而静态工厂方法是无法让子类继承的，因此，简单工厂模式无法形成基于基类的继承树结构。
		*/
        Simpleness_method Simpleness_Impl_1 = Smpleness_GarageFactory.getVehicle("Simpleness_Impl_1");
        Simpleness_method Simpleness_Impl_2 = Smpleness_GarageFactory.getVehicle("Simpleness_Impl_2");
        
        if (null!=Simpleness_Impl_1) {
        	Simpleness_Impl_1.A();//小明骑摩托车去学校
		}
		if (null!=Simpleness_Impl_2) {
			Simpleness_Impl_2.A();// 小明开汽车去旅游
		}
	 }
}
