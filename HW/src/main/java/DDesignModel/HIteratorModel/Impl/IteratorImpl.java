package DDesignModel.HIteratorModel.Impl;

import DDesignModel.HIteratorModel.AggregateCrete;
import DDesignModel.HIteratorModel.bo.Iterator;


public class IteratorImpl implements Iterator {
    
    private AggregateCrete aggregateCrete;//���б������ľ���ľۺ϶���
    private int index = 0;//�ڲ���������¼��ǰ������������λ��
    private int size = 0;//��¼��ǰ�ۼ�����Ĵ�С
    
    public IteratorImpl(AggregateCrete aggregateCrete){
        this.aggregateCrete = aggregateCrete;
        this.size = aggregateCrete.size();
        index = 0;
    }

    
    /**
     * �����������ƶ�����һ��Ԫ��
     */
    @Override
    public void first() {
        index = 0;
    }
    /**
     * �����������ƶ�����һ��Ԫ��
     */
    @Override
    public void next() {
    	if(index < size){
    		index ++;
    	}
    }
    /**
     * �����������Ƿ�Ϊ���һ��Ԫ��
     */
    @Override
    public boolean isDone() {
        return (index >= size);
    }
    /**
     * ����������������ǰԪ��
     */
    @Override
    public Object currentItem() {
        return aggregateCrete.getElement(index);
    }
}