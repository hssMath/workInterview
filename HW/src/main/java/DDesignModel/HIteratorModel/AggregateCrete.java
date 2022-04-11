package DDesignModel.HIteratorModel;

import DDesignModel.HIteratorModel.Impl.IteratorImpl;
import DDesignModel.HIteratorModel.bo.Iterator;

public class AggregateCrete extends Aggregate {
    
    private Object[] objArray = null;
    /**
     * 构造方法，传入聚合对象的具体内容
     */
    public AggregateCrete(Object[] objArray){
        this.objArray = objArray;
    }
    
    @Override
    public Iterator createIterator() {
        return new IteratorImpl(this);
    }
    /**
     * 取值方法：向外界提供聚集元素
     */
    public Object getElement(int index){
        if(index < objArray.length){
            return objArray[index];
        }else{
            return null;
        }
    }
    /**
     * 取值方法：向外界提供聚集的大小
     */
    public int size(){
        return objArray.length;
    }
}