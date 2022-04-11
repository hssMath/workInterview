package DDesignModel.HIteratorModel.Impl;

import DDesignModel.HIteratorModel.AggregateCrete;
import DDesignModel.HIteratorModel.bo.Iterator;


public class IteratorImpl implements Iterator {
    
    private AggregateCrete aggregateCrete;//持有被迭代的具体的聚合对象
    private int index = 0;//内部索引，记录当前迭代到的索引位置
    private int size = 0;//记录当前聚集对象的大小
    
    public IteratorImpl(AggregateCrete aggregateCrete){
        this.aggregateCrete = aggregateCrete;
        this.size = aggregateCrete.size();
        index = 0;
    }

    
    /**
     * 迭代方法：移动到第一个元素
     */
    @Override
    public void first() {
        index = 0;
    }
    /**
     * 迭代方法：移动到下一个元素
     */
    @Override
    public void next() {
    	if(index < size){
    		index ++;
    	}
    }
    /**
     * 迭代方法：是否为最后一个元素
     */
    @Override
    public boolean isDone() {
        return (index >= size);
    }
    /**
     * 迭代方法：返还当前元素
     */
    @Override
    public Object currentItem() {
        return aggregateCrete.getElement(index);
    }
}