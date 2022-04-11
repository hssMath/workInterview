package DDesignModel.FProxyModel;


import DDesignModel.FProxyModel.Impl.RealObject;
import DDesignModel.FProxyModel.bo.AbstractObject;

/**
 * 
 * @decription:代理对象也是实现接口方法，只不过是代理对象的实现方法调用的是原对象方法：
 * 			区别：其实可以直接new原对象，调用实现方法
 * @class_name：ProxyObject
 * @author 何拴拴
 * @author：heshuanshuan 
 * @date 2019年7月30日
 */
public class ProxyObject implements AbstractObject {

	RealObject realObject = new RealObject();
	
	@Override
	public void AAA() {
		realObject.AAA();
	}

}
