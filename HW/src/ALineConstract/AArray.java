package ALineConstract;
/**
 * 
 * @decription:数组
 * @class_name：Array
 * @author hss
 * @author：heshuanshuan 
 * @date 2019年12月29日
 */
public class AArray {
	private int[] elementArray;//属性
	
	public AArray() {
		elementArray = new int[0];
	}
	public int getArraySize() {
		return elementArray.length;
	}
	
	/**
	 * 
	 * @Description:指定index位置插入value 
	 * @param:@param index
	 * @param:@param value   
	 * @author:heshuanshuan
	 * @date:2019年10月30日
	 * @return:void 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	public void addIndexValue(int index,int value) {
		
		int[] newArray = new int[elementArray.length+1];//创建一个新数组:此数组比原数组的长度多一个
		for (int i = 0; i < newArray.length; i++) {
			if (i<index) {//指定位置之前的不变
				newArray[i]=elementArray[i];
			}else if (i==index) {//指定位置添加指定元素
				newArray[i]=value;
			}else {//指定位置之后，添加原数组的i-1元素
				newArray[i]=elementArray[i-1];
			}
		}
		elementArray = newArray;
	}
	
	/**
	 * 
	 * @Description:数组中添加新元素
	 * 		因为每次都是一个一个的新增，所以在再下一次添加之前，数组的长度都会被+1
	 * @param:@param element   
	 * @author:heshuanshuan
	 * @date:2019年10月30日
	 * @return:void 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	public void addElement(int element) {
		int[] newArray = new int[elementArray.length+1];//创建一个新数组:此数组比原数组的长度多一个
		for (int i = 0; i < elementArray.length; i++) {//把原数组元素复制到新数组
			newArray[i]=elementArray[i];
		}
		newArray[elementArray.length]= element;//把指定元素加到数组的末尾:新数组的最后一位下标是原数组的长度
		elementArray = newArray;//使用新数组替代原数组：能被替换是因为声明后没有初始化，此时才可以直接给数组
	}
	
	/**
	 * 
	 * @Description:删除数组中的第几个元素
	 * @param:@param index   
	 * @author:heshuanshuan
	 * @date:2019年10月30日
	 * @return:void 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	public void deleteElement(int index) {
		//创建新数组
		int[] newArray = new int[elementArray.length-1];
		//删除指定下标之前的元素不变，之后的取原数组的下一个
		if (index<0 || index>elementArray.length) {
			throw new RuntimeException("下标越界");
		}
		for (int i = 0; i < newArray.length; i++) {
			if (i<index) {
				newArray[i]=elementArray[i];
			}else {
				newArray[i]=elementArray[i+1];
			}
		}
		elementArray = newArray;
	}
	
	/**
	 * 
	 * @Description:打印数组(使用jdk的Arrays.toString(elementArray))
	 * @param:@return   
	 * @author:heshuanshuan
	 * @date:2019年10月30日
	 * @return:String 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	public String show() {
//		System.out.println(Arrays.toString(elementArray));
    	int[] a =elementArray;
        if (a == null)
            return "null";
        int iMax = a.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(a[i]);
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }
	}
	
	/***
	 * 
	 * @Description:替换指定位置的元素
	 * @param:@param index
	 * @param:@param value   
	 * @author:heshuanshuan
	 * @date:2019年11月2日
	 * @return:void 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	public void replaceValue(int index,int value) {
		elementArray[index] = value;
	}
	
	/**
	 * 
	 * @Description:线性查找元素:一个一个查找
	 * @param:   
	 * @author:heshuanshuan
	 * @date:2019年11月12日
	 * @return:void 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	public int getValueByIndex(int index) {
		for (int i = 0; i < elementArray.length; i++) {
			if (elementArray[i]==index) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		AArray aArray = new AArray();
		aArray.addElement(97);//添加元素
		aArray.addElement(100);
		aArray.addElement(96);
		aArray.addElement(98);
		aArray.addElement(95);
		System.out.println(aArray.show());
		aArray.deleteElement(2);//删除指定下标的元素
		System.out.println(aArray.show());              
		aArray.addIndexValue(2, 33);//指定位置添加元素
		System.out.println(aArray.show());
		aArray.replaceValue(2, 44);//替换指定位置的元素
		System.out.println(aArray.show());
		
		System.out.println(aArray.getValueByIndex(44));//获取元的下标
	}
}
