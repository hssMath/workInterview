package ADataConstract;
/**
 * @decription:栈
 * @class_name：Stack
 * @author hss
 * @author：heshuanshuan 
 * @date 2019年11月12日
 */
public class CStack {
	int[] elementArray;//栈的底层使用数组来存储
	public CStack() {
		elementArray = new int[0];
	}
	/**
	 * 
	 * @Description:压入元素：
	 * 		每次添加元素时，新数组的长度需要+1，同时原数组元素复制到新数组，新数组的最后一位元素值使用指定值
	 * @param:   
	 * @author:heshuanshuan
	 * @date:2019年11月12日
	 * @return:void 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	public void push(int value) {
		int[] arr = new int[elementArray.length+1];
		for (int i = 0; i < elementArray.length; i++) {//循环时，以长度最小数组长度的做循环次数
			arr[i]=elementArray[i];
		}
		arr[elementArray.length]=value;
		elementArray = arr;
	}
	/**
	 * 
	 * @Description:取出栈顶元素:取一次数组长度减少1个单位
	 * 		将数组中除了最后一个元素的其他元素都放入新的数组中
	 * @param:   栈顶元素
	 * @author:heshuanshuan
	 * @return 
	 * @date:2019年11月12日
	 * @return:void 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	public int pop() {
		if (elementArray.length==0) {
			throw new RuntimeException("stact is empty");
		}
		
		int value = elementArray[elementArray.length-1];//先取栈顶元素再处理数组
		
		int[] arr = new int[elementArray.length-1];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=elementArray[i];
		}
		elementArray = arr;
		return value;
	}
	/**
	 * 
	 * @Description:取出栈顶元素
	 * @param:@return   
	 * @author:heshuanshuan
	 * @date:2019年11月12日
	 * @return:int 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	public int peak() {
		if (elementArray.length==0) {
			throw new RuntimeException("stact is empty");
		}
		return elementArray[elementArray.length-1];
	}
	/**
	 * 
	 * @Description:查看栈顶元素是否为空
	 * @param:@return   
	 * @author:heshuanshuan
	 * @date:2019年11月12日
	 * @return:boolean 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	public boolean isempy() {
		if (elementArray.length==0) {
			throw new RuntimeException("stact is empty");
		}
		return elementArray.length==0;
	}
	
	/**
	 * 
	 * @Description:打印数组(使用jdk的Arrays.toString(elementArrayArray))
	 * @param:@return   
	 * @author:heshuanshuan
	 * @date:2019年10月30日
	 * @return:String 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
	 */
	public String show() {
//		System.out.println(Arrays.toString(elementArrayArray));
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
	
	
	public static void main(String[] args) {
		CStack cStack = new CStack();
		//压入数字
		cStack.push(1);
		cStack.push(2);
		cStack.push(3);
		//打印数组
		System.out.println(cStack.show());
		//取出栈顶元素
		System.out.println(cStack.pop());
		//打印取出栈顶元素的数组
		System.out.println(cStack.show());
		//查看栈顶元素
		System.out.println(cStack.peak());
		//查看是否为空
		System.out.println(cStack.isempy());
	}
}
