package DDesignModel.BSingleDesionModel;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SingleDesionModel {
	private int age;
	private String name;

	/**
	 * 饿汉式
	 * 1.为了避免其他类过多的建立对象，用Private修饰构造函数，禁止其他程序建立对象
	 * @constructor 构造方法
	 */
	private SingleDesionModel() {
	}
	/**
	 * 2.为了让其他类访问该类对象，只好在本类自定义一个对象。
	 * @description 3.1相关说明：饿汉式(Single一进内存，对象就已存在，)
	 * @time 创建时间:2017-3-15上午11:12:59
	 * @return 返回一个类类型的对象s;
	 */
	private static SingleDesionModel singleDesionModel = new SingleDesionModel();
	public static SingleDesionModel getInterface_ehs() {
		return singleDesionModel;
	}

	
	/**
	 * @name 懒汉式
	 * @description 3.2相关说明：懒汉式(Single一进内存，对象还没有存在，只有调用getIterface方法时，才会建立对象)
	 * @time 创建时间:2017-3-15上午11:12:59
	 * @return 返回一个类类型的对象ss;
	 * @author 何拴拴
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
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
		/* 懒汉式调用 */
		SingleDesionModel s1 = SingleDesionModel.getInterfacelas_lhz();
		SingleDesionModel s2 = SingleDesionModel.getInterfacelas_lhz();
		SingleDesionModel s3 = SingleDesionModel.getInterfacelas_lhz();
		System.out.println("饿汉式创建对象s1："+s1);
		System.out.println("饿汉式创建对象s2："+s2);
		System.out.println("饿汉式创建对象s2："+s3);
		s1.setName("zhangsan");
		s2.setAge(18);
		/**
		 * 属于创建型模式：不管new几次，其实都是一个对象；所以，只要给其中一个set值后，其余对象共享set值。
		 */
		System.out.println(s3.getName() + " " + s3.getAge());/**

		/* 饿汉式调用 */
		SingleDesionModel ss1 = SingleDesionModel.getInterface_ehs();
		SingleDesionModel ss2 = SingleDesionModel.getInterface_ehs();
		ss1.setName("wangwu");
		ss2.setAge(20);
		System.out.println(ss2.getName() + " " + ss1.getAge());
	}
}
