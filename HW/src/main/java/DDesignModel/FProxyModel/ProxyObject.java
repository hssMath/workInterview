package DDesignModel.FProxyModel;


import DDesignModel.FProxyModel.Impl.RealObject;
import DDesignModel.FProxyModel.bo.AbstractObject;

/**
 * 
 * @decription:�������Ҳ��ʵ�ֽӿڷ�����ֻ�����Ǵ�������ʵ�ַ������õ���ԭ���󷽷���
 * 			������ʵ����ֱ��newԭ���󣬵���ʵ�ַ���
 * @class_name��ProxyObject
 * @author ��˩˩
 * @author��heshuanshuan 
 * @date 2019��7��30��
 */
public class ProxyObject implements AbstractObject {

	RealObject realObject = new RealObject();
	
	@Override
	public void AAA() {
		realObject.AAA();
	}

}
