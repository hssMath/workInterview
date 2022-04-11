package DDesignModel.EAdapterModel;

/**
 * 对象适配器
 */
public class Object_Adapter {
    private Object_Adaptee object_Adaptee;

    public Object_Adapter(Object_Adaptee object_Adaptee) {
    	this.object_Adaptee = object_Adaptee;
    }

    /**
     * 源类Adaptee有方法A
     * 因此适配器类直接委派即可
     */
    public void A() {
    	this.object_Adaptee.A();
    }

    /**
     * 源类Adaptee没有方法B
     * 因此由适配器类需要补充此方法
     */
    public void B() {
        System.out.println("适配器新增的B方法");
    }
    
    
	public static void main(String[] args) {
		Object_Adapter object_Adapter = new Object_Adapter(new Object_Adaptee());
		object_Adapter.A();//通过传递对象，进行调用源类的方法。
		object_Adapter.B();
		
		
/*		
		1.结构型模式二:对象适配器模式
			从类图中可以看出，Adaptee类并没有B()方法，而客户端则希望使用这个方法。
			为使客户端能够使用Adaptee类的B方法，提供一个包装了一个Adaptee的实例的包装类AdapterWrapper。
			从而此包装类能够把Adaptee的API与Target类的API衔接起来。
			Adapter与Adaptee是委派关系，这决定了适配器模式是对象适配器模式
		2.目的：将一个类的接口转换成客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
		3.角色：
			目标(Target)角色： 这就是所期待得到的接口，也就是这类的接口是符合我们要求的。
			源(Adapee)角色： 我们要使用的接口，但是这个接口不符合我们的要求，也就是现在需要适配的接口。
			适配器(Adaper)角色：适配器类是适配器模式的核心。适配器把源接口转换成目标接口。很显然，这一角色不可以是接口，而必须是具体类。
		
		说明：
		1.目标接口声明了两个方法：A()和B()。而源角色Adaptee是一个具体类，它只有一个A()方法，但是没有B()方法，又不能通过修改源角色Adaptee添加B()方法。
			故而，新建适配器角色Adapter，使其产生一个源类的实例，进而调用源类的A方法。
			
		2.实现：适配器中实例化源类，用这个实例调用源类的方法；同时，再添加一些别的同类的新方法（不选择新写一个类调用新的方法，目的是这2个方法很可能属于同一类，需要写在一起）。
		
		
		区别：
		1、实现方式不同
			类适配器使用对象继承的方式，是类似于静态的定义方式；而对象适配器使用对象组合的方式，是动态组合的方式。
		2、源类Adaptee的子类处理问题
			对于类适配器，由于适配器直接继承了Adaptee，使得适配器不能和Adaptee的子类一起工作，因为继承是静态的关系，当适配器继承了Adaptee后，就不可能再去处理 Adaptee的子类了。
			对于对象适配器，一个适配器可以把多种不同的源适配到同一个目标。换言之，同一个适配器可以把源类和它的子类都适配到目标接口。因为对象适配器采用的是对象组合的关系，只要对象类型正确，是不是子类都无所谓。
		3、源类Adaptee行为重定义问题
			对于类适配器，适配器可以重定义Adaptee的部分行为，相当于子类覆盖父类的部分实现方法。
			对于对象适配器，要重定义Adaptee的行为比较困难，这种情况下，需要定义Adaptee的子类来实现重定义，然后让适配器组合子类。虽然重定义Adaptee的行为比较困难，但是想要增加一些新的行为则方便的很，而且新增加的行为可同时适用于所有的源。
		4、对象引用问题
			对于类适配器，仅仅引入了一个对象，并不需要额外的引用来间接得到Adaptee。
			对于对象适配器，需要额外的引用来间接得到Adaptee。

		适配器模式优点：
			1.复用性:系统需要使用现有的类，而此类的接口不符合系统的需要。那么通过适配器模式就可以让这些功能得到更好的复用。
			2.扩展性:在实现适配器功能的时候，可以自由调用自己开发的功能，从而自然地扩展系统的功能

		适配器模式缺点：
			1、过多地使用适配器，会让系统非常零乱，不易整体进行把握。比如，明明看到调用的是A接口，其实内部被适配成了B接口的实现，一个系统如果太多出现这种情况，无异于一场灾难。因此如果不是很有必要，可以不使用适配器，而是直接对系统进行重构
			2、由于 JAVA 至多继承一个类，所以至多只能适配一个适配者类，而且目标类必须是抽象类。
*/
	}
}
