package ADataConstract;
/**
 * 
 * @decription:����
 * @class_name��Queue
 * @author hss
 * @author��heshuanshuan 
 * @date 2019��12��29��
 */
public class BQueue {
	int[] elementArray;//���еĵײ�ʹ���������洢
	public BQueue() {
		elementArray = new int[0];
	}
	/**
	 * 
	 * @Description:���
	 * @param:   
	 * @author:heshuanshuan
	 * @date:2019��11��12��
	 * @return:void 
	 * @history �޶���ʷ�������޶����ݡ��޶��ˡ��޶�ʱ��ȣ�
	 */
	public void add(int value) {
		int []newarray  = new int[elementArray.length+1];
		for (int i = 0; i < elementArray.length; i++) {
			newarray[i] = elementArray[i];
		}
		newarray[newarray.length-1] = value;
		elementArray = newarray;
	}
	
	/**
	 * 
	 * @Description:����
	 * @param:   
	 * @author:heshuanshuan
	 * @date:2019��11��12��
	 * @return:void 
	 * @history �޶���ʷ�������޶����ݡ��޶��ˡ��޶�ʱ��ȣ�
	 */
	public int poll() {
		if (elementArray.length==0) {
			throw new RuntimeException("queue is empty");
		}
		int []newarray  = new int[elementArray.length-1];
		int value = elementArray[0];
		for (int i = 0; i < newarray.length; i++) {
			newarray[i]=elementArray[i+1];
		}
		elementArray = newarray;
		return value;
	}
	
	public static void main(String[] args) {
		BQueue bQueue = new BQueue();
		bQueue.add(1);
		bQueue.add(2);
		bQueue.add(3);
		System.out.println(bQueue.poll());
		System.out.println(bQueue.poll());
		System.out.println(bQueue.poll());
	}
}
