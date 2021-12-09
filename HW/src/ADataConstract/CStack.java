package ADataConstract;
/**
 * @decription:ջ
 * @class_name��Stack
 * @author hss
 * @author��heshuanshuan 
 * @date 2019��11��12��
 */
public class CStack {
	int[] elementArray;//ջ�ĵײ�ʹ���������洢
	public CStack() {
		elementArray = new int[0];
	}
	/**
	 * 
	 * @Description:ѹ��Ԫ�أ�
	 * 		ÿ�����Ԫ��ʱ��������ĳ�����Ҫ+1��ͬʱԭ����Ԫ�ظ��Ƶ������飬����������һλԪ��ֵʹ��ָ��ֵ
	 * @param:   
	 * @author:heshuanshuan
	 * @date:2019��11��12��
	 * @return:void 
	 * @history �޶���ʷ�������޶����ݡ��޶��ˡ��޶�ʱ��ȣ�
	 */
	public void push(int value) {
		int[] arr = new int[elementArray.length+1];
		for (int i = 0; i < elementArray.length; i++) {//ѭ��ʱ���Գ�����С���鳤�ȵ���ѭ������
			arr[i]=elementArray[i];
		}
		arr[elementArray.length]=value;
		elementArray = arr;
	}
	/**
	 * 
	 * @Description:ȡ��ջ��Ԫ��:ȡһ�����鳤�ȼ���1����λ
	 * 		�������г������һ��Ԫ�ص�����Ԫ�ض������µ�������
	 * @param:   ջ��Ԫ��
	 * @author:heshuanshuan
	 * @return 
	 * @date:2019��11��12��
	 * @return:void 
	 * @history �޶���ʷ�������޶����ݡ��޶��ˡ��޶�ʱ��ȣ�
	 */
	public int pop() {
		if (elementArray.length==0) {
			throw new RuntimeException("stact is empty");
		}
		
		int value = elementArray[elementArray.length-1];//��ȡջ��Ԫ���ٴ�������
		
		int[] arr = new int[elementArray.length-1];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=elementArray[i];
		}
		elementArray = arr;
		return value;
	}
	/**
	 * 
	 * @Description:ȡ��ջ��Ԫ��
	 * @param:@return   
	 * @author:heshuanshuan
	 * @date:2019��11��12��
	 * @return:int 
	 * @history �޶���ʷ�������޶����ݡ��޶��ˡ��޶�ʱ��ȣ�
	 */
	public int peak() {
		if (elementArray.length==0) {
			throw new RuntimeException("stact is empty");
		}
		return elementArray[elementArray.length-1];
	}
	/**
	 * 
	 * @Description:�鿴ջ��Ԫ���Ƿ�Ϊ��
	 * @param:@return   
	 * @author:heshuanshuan
	 * @date:2019��11��12��
	 * @return:boolean 
	 * @history �޶���ʷ�������޶����ݡ��޶��ˡ��޶�ʱ��ȣ�
	 */
	public boolean isempy() {
		if (elementArray.length==0) {
			throw new RuntimeException("stact is empty");
		}
		return elementArray.length==0;
	}
	
	/**
	 * 
	 * @Description:��ӡ����(ʹ��jdk��Arrays.toString(elementArrayArray))
	 * @param:@return   
	 * @author:heshuanshuan
	 * @date:2019��10��30��
	 * @return:String 
	 * @history �޶���ʷ�������޶����ݡ��޶��ˡ��޶�ʱ��ȣ�
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
		//ѹ������
		cStack.push(1);
		cStack.push(2);
		cStack.push(3);
		//��ӡ����
		System.out.println(cStack.show());
		//ȡ��ջ��Ԫ��
		System.out.println(cStack.pop());
		//��ӡȡ��ջ��Ԫ�ص�����
		System.out.println(cStack.show());
		//�鿴ջ��Ԫ��
		System.out.println(cStack.peak());
		//�鿴�Ƿ�Ϊ��
		System.out.println(cStack.isempy());
	}
}
