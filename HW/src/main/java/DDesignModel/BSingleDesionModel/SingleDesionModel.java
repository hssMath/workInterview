package DDesignModel.BSingleDesionModel;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SingleDesionModel {
	private int age;
	private String name;

	/**
	 * ����ʽ
	 * 1.Ϊ�˱������������Ľ���������Private���ι��캯������ֹ��������������
	 * @constructor ���췽��
	 */
	private SingleDesionModel() {
	}
	/**
	 * 2.Ϊ������������ʸ������ֻ���ڱ����Զ���һ������
	 * @description 3.1���˵��������ʽ(Singleһ���ڴ棬������Ѵ��ڣ�)
	 * @time ����ʱ��:2017-3-15����11:12:59
	 * @return ����һ�������͵Ķ���s;
	 */
	private static SingleDesionModel singleDesionModel = new SingleDesionModel();
	public static SingleDesionModel getInterface_ehs() {
		return singleDesionModel;
	}

	
	/**
	 * @name ����ʽ
	 * @description 3.2���˵��������ʽ(Singleһ���ڴ棬����û�д��ڣ�ֻ�е���getIterface����ʱ���ŻὨ������)
	 * @time ����ʱ��:2017-3-15����11:12:59
	 * @return ����һ�������͵Ķ���ss;
	 * @author ��˩˩
	 * @history �޶���ʷ�������޶����ݡ��޶��ˡ��޶�ʱ��ȣ�
	 */
	private static SingleDesionModel las = null;
	public static synchronized SingleDesionModel getInterfacelas_lhz() {
		if (las == null) {
			synchronized (SingleDesionModel.class) {
				if (las == null) {
					las = new SingleDesionModel();
				}
			}
		}
		return las;
	}

	public static void main(String[] args) {
		/* ����ʽ���� */
		SingleDesionModel s1 = SingleDesionModel.getInterfacelas_lhz();
		SingleDesionModel s2 = SingleDesionModel.getInterfacelas_lhz();
		SingleDesionModel s3 = SingleDesionModel.getInterfacelas_lhz();
		System.out.println("����ʽ��������s1��"+s1);
		System.out.println("����ʽ��������s2��"+s2);
		System.out.println("����ʽ��������s2��"+s3);
		s1.setName("zhangsan");
		s2.setAge(18);
		/**
		 * ���ڴ�����ģʽ������new���Σ���ʵ����һ���������ԣ�ֻҪ������һ��setֵ�����������setֵ��
		 */
		System.out.println(s3.getName() + " " + s3.getAge());/**

		/* ����ʽ���� */
		SingleDesionModel ss1 = SingleDesionModel.getInterface_ehs();
		SingleDesionModel ss2 = SingleDesionModel.getInterface_ehs();
		ss1.setName("wangwu");
		ss2.setAge(20);
		System.out.println(ss2.getName() + " " + ss1.getAge());
	}
}
