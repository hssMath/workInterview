package DDesignModel.DFactorModel;


import DDesignModel.DFactorModel.bo.Impl.General_Impl_1;
import DDesignModel.DFactorModel.bo.Impl.General_Impl_2;
import DDesignModel.DFactorModel.entity.G_XiaoMing;

public class General_method_test {
	/**
	 *
	 * @Description:���ù���ģʽ
	 * 	  1.�򵥹���ģʽ����Υ���ˡ�����ԭ�򡱣�������չ���ɴ˲����˹�������ģʽ��
	 *    2.��������ģʽ�ǶԼ򵥹���ģʽ�����˳��󻯣����ϡ�����ԭ�򡱣�ʵ���˿���չ��
	 *    3.��������ģʽ�������Ƕ���һ�����������ӿڣ���ʵ�ʴ��������Ƴٵ����൱�С�
	 * @author:heshuanshuan
	 * @date:2019��5��28��
	 * @return:void 
	 */
     public static void main(String[] args) {
    	 G_XiaoMing G_XiaoMing = new G_XiaoMing();
    	 
    	 General_Impl_2 motorcycleGarage = new General_Impl_2();
    	 General_Impl_1 carGaraget = new General_Impl_1();
    	 
    	 G_XiaoMing.goToSchool(motorcycleGarage);//С����Ħ�г�ȥѧУ
    	 G_XiaoMing.travel(carGaraget);// С��������ȥ����
	}
}
