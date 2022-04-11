package DDesignModel.HIteratorModel;

import DDesignModel.HIteratorModel.Impl.IteratorImpl;
import DDesignModel.HIteratorModel.bo.Iterator;

public class AggregateCrete extends Aggregate {
    
    private Object[] objArray = null;
    /**
     * ���췽��������ۺ϶���ľ�������
     */
    public AggregateCrete(Object[] objArray){
        this.objArray = objArray;
    }
    
    @Override
    public Iterator createIterator() {
        return new IteratorImpl(this);
    }
    /**
     * ȡֵ������������ṩ�ۼ�Ԫ��
     */
    public Object getElement(int index){
        if(index < objArray.length){
            return objArray[index];
        }else{
            return null;
        }
    }
    /**
     * ȡֵ������������ṩ�ۼ��Ĵ�С
     */
    public int size(){
        return objArray.length;
    }
}