package ADataConstract;
/**
 * 
 * @decription:队列
 * @class_name：Queue
 * @author hss
 * @author：heshuanshuan 
 * @date 2019年12月29日
 */
public class BQueue {
	int[] elementArray;//队列的底层使用数组来存储
	public BQueue() {
		elementArray = new int[0];
	}
	/**
	 * 
	 * @Description:入队
	 * @param:   
	 * @author:heshuanshuan
	 * @date:2019年11月12日
	 * @return:void 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
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
	 * @Description:出队
	 * @param:   
	 * @author:heshuanshuan
	 * @date:2019年11月12日
	 * @return:void 
	 * @history 修订历史（历次修订内容、修订人、修订时间等）
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
