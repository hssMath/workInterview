package DDesignModel.DFactorModel;


import DDesignModel.DFactorModel.bo.Impl.Simpleness_Impl_1;
import DDesignModel.DFactorModel.bo.Impl.Simpleness_Impl_2;
import DDesignModel.DFactorModel.bo.Simpleness_method;

public class Smpleness_GarageFactory {
	/**
	 * @Description:�򵥹���
	 * @param:@param type
	 * @param:@return
	 * @author:heshuanshuan
	 * @date:2019��5��28��
	 * @return:IVehicle
	 * @history �޶���ʷ�������޶����ݡ��޶��ˡ��޶�ʱ��ȣ�
	 */
	public static Simpleness_method getVehicle(String type) {
        if ("Simpleness_Impl_1".equals(type)) {
            return new Simpleness_Impl_1();
        }else if ("Simpleness_Impl_2".equals(type)) {
            return new Simpleness_Impl_2();
        }
        throw new IllegalArgumentException("�����복����");
    }
	
	 public static void main(String[] args) {
		/**
		  * �򵥹���ģʽ������Ĵ�����ģʽ���ֽо�̬��������ģʽ��Static FactoryMethod Pattern��
		  * ��ͨ��ר�Ŷ���һ���������𴴽��������ʵ������������ʵ��ͨ�������й�ͬ�ĸ��ࡣ
		  * �򵥹���ģʽ
		  * 	���������:���ȥʵ����һ�����ʵĶ���
		  * 	����˼��:��һ��ר�ŵ��������𴴽�ʵ���Ĺ��̡�
		  * 
		  * �ܽ᣺
	   		1.�򵥹������������ϵͳ�ṹ���Ż�����������һ���߼���������һ���������У�������û�кܸߵ��ھ��ԣ�ͬʱҲΥ���ˡ����ŷ��ԭ�򡱡�
			2.�򵥹���ģʽ�ķ���һ�㶼�Ǿ�̬�ģ�����̬�����������޷�������̳еģ���ˣ��򵥹���ģʽ�޷��γɻ��ڻ���ļ̳����ṹ��
		*/
        Simpleness_method Simpleness_Impl_1 = Smpleness_GarageFactory.getVehicle("Simpleness_Impl_1");
        Simpleness_method Simpleness_Impl_2 = Smpleness_GarageFactory.getVehicle("Simpleness_Impl_2");
        
        if (null!=Simpleness_Impl_1) {
        	Simpleness_Impl_1.A();//С����Ħ�г�ȥѧУ
		}
		if (null!=Simpleness_Impl_2) {
			Simpleness_Impl_2.A();// С��������ȥ����
		}
	 }
}
