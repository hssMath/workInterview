package DDesignModel.HIteratorModel;


import DDesignModel.HIteratorModel.bo.Iterator;

public class Client {

    public void operation(){
        Object[] objArray = {"One","Two","Three","Four","Five","Six"};
        Aggregate agg = new AggregateCrete(objArray);//�����ۺ϶���
        
        Iterator it = agg.createIterator();//ѭ������ۺ϶����е�ֵ
        while(!it.isDone()){
            System.out.println(it.currentItem());
            it.next();
        }
    }
    public static void main(String[] args) {
        Client client = new Client();
        client.operation();
    }
    
    
    /**
     * 1.������ģʽ�ֽ��α�(Cursor)ģʽ��
     * 		�������Ϊģʽ��������ģʽ����˳��ط���һ���ۼ��е�Ԫ�ض����ر�¶�ۼ����ڲ�����internal representation����
     * 2.������ģʽ�漰�����¼�����ɫ��
��������		���������(Iterator)��ɫ���˳����ɫ���������Ԫ������Ľӿڡ�
��������		���������(ConcreteIterator)��ɫ���˽�ɫʵ����Iterator�ӿڣ������ֵ��������е��α�λ�á�
��������		�ۼ�(Aggregate)��ɫ���˳����ɫ��������������(Iterator)����Ľӿڡ�
��������		����ۼ�(ConcreteAggregate)��ɫ��ʵ���˴���������(Iterator)����Ľӿڣ�����һ�����ʵľ��������ʵ����
��������		�ͻ���(Client)��ɫ�����жԾۼ���������Ӷ�������ã����õ����Ӷ���ĵ����ӿڣ�Ҳ�п���ͨ�������Ӳ����ۼ�Ԫ�ص����Ӻ�ɾ����
	   3.�ۼ���JAVA�ۼ�
����			����������һ���γɵ������֮Ϊ�ۼ�(Aggregate)���ۼ��������ܹ�����һ�������������󡣾ۼ������ھۼ��ṹ�ĳ��󻯣����и��ӻ��Ͷ����ԡ��������������ľۼ���Ҳ��������JAVA�ۼ��������ƻ�����
����			JAVA�ۼ�������ʵ���˹�ͬ��java.util.Collection�ӿڵĶ�����JAVA���ԶԾۼ������ֱ��֧�֡���1.2�濪ʼ��JAVA�����ṩ�˺ܶ��־ۼ�������Vector��ArrayList��HashSet��HashMap��Hashtable�ȣ���Щ����JAVA�ۼ������ӡ�
     * 
     * 
     */

}