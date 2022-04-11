package DDesignModel.EAdapterModel;


import DDesignModel.EAdapterModel.bo.Class_Target;
import DDesignModel.EAdapterModel.bo.Impl.Class_Adaptee;

public class Class_Adapter extends Class_Adaptee implements Class_Target {

	/**
	 * 由于源类没有B()方法，但是还要使用源类的A()方法。所以新建一个类（适配器类），用此适配器补充上这个方法
	 */
	public void B() {
		System.out.println("适配器补充的B()方法");
	}
	/**
	 * 
	 * @Description:	继承源类，实现接口，从而用通过目标类的实例化对象调用方法。
	 * @param:@param args   
	 * @author:heshuanshuan
	 * @date:2019年7月29日
	 * @return:void 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	
	public static void main(String[] args) {
/*
		1.结构型模式一:类适配器模式
		2.目的：将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
		3.角色：
			目标(Target)角色： 这就是所期待得到的接口，也就是这类的接口是符合我们要求的。
			源(Adapee)角色： 我们要使用的接口，但是这个接口不符合我们的要求，也就是现在需要适配的接口。
			适配器(Adaper)角色： 适配器类是适配器模式的核心。适配器把源接口转换成目标接口。很显然，这一角色不可以是接口，而必须是具体类。
		4.类的适配器模式把适配的类的API转换成为目标类的API。
			从类图中我们可以看出，Adaptee类并没有B()方法，而客户端则希望使用这个方法。
			为使客户端能够使用Adaptee类，提供一个中间环节，即类Adapter，把Adaptee的API与Target类的API衔接起来。
			Adapter与Adaptee是 【++继承关系++】 ，这决定了这个适配器模式是类适配器模式
		5.Adapter与Adaptee是 【++继承关系++】 ，这决定了这个适配器模式是类适配器模式
		说明：
		1.目标接口声明了两个方法：A()和B()。而源角色Adaptee是一个具体类，它只有一个A()方法，但是没有B()方法，
				又不能通过修改源角色Adaptee添加B()方法。
			故而，新建适配器角色Adapter，使其继承了Adaptee,同时又实现了目标(Target)接口。
			由于Adaptee没有提供B()方法，而目标接口又要求有这个方法。因此适配器角色Adapter实现了这个方法。
			
		2.实现：抽取源类的方法作为新建接口中的部分方法，再添加一些别的同类的新方法（不选择新写一个类调用新的方法，目的是这2个方法很可能属于同一类，需要写在一起），
			使得适配器继承源类并且实现目标接口，那么适配器类中就会有源类方法和新添加的方法
*/		
		Class_Adapter class_Adapter = new Class_Adapter();
		class_Adapter.A();
		class_Adapter.B();
	}
}
