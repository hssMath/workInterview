package DDesignModel.HIteratorModel;


import DDesignModel.HIteratorModel.bo.Iterator;

public abstract class Aggregate {
    /**
     * 工厂方法，创建相应迭代子对象的接口
     */
    public abstract Iterator createIterator();
}