package DDesignModel.HIteratorModel;


import DDesignModel.HIteratorModel.bo.Iterator;

public class Client {

    public void operation(){
        Object[] objArray = {"One","Two","Three","Four","Five","Six"};
        Aggregate agg = new AggregateCrete(objArray);//创建聚合对象
        
        Iterator it = agg.createIterator();//循环输出聚合对象中的值
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
     * 1.迭代子模式又叫游标(Cursor)模式：
     * 		对象的行为模式，迭代子模式可以顺序地访问一个聚集中的元素而不必暴露聚集的内部表象（internal representation）。
     * 2.迭代子模式涉及到以下几个角色：
　　　　		抽象迭代子(Iterator)角色：此抽象角色定义出遍历元素所需的接口。
　　　　		具体迭代子(ConcreteIterator)角色：此角色实现了Iterator接口，并保持迭代过程中的游标位置。
　　　　		聚集(Aggregate)角色：此抽象角色给出创建迭代子(Iterator)对象的接口。
　　　　		具体聚集(ConcreteAggregate)角色：实现了创建迭代子(Iterator)对象的接口，返回一个合适的具体迭代子实例。
　　　　		客户端(Client)角色：持有对聚集及其迭代子对象的引用，调用迭代子对象的迭代接口，也有可能通过迭代子操作聚集元素的增加和删除。
	   3.聚集和JAVA聚集
　　			多个对象聚在一起形成的总体称之为聚集(Aggregate)，聚集对象是能够包容一组对象的容器对象。聚集依赖于聚集结构的抽象化，具有复杂化和多样性。数组就是最基本的聚集，也是其他的JAVA聚集对象的设计基础。
　　			JAVA聚集对象是实现了共同的java.util.Collection接口的对象，是JAVA语言对聚集概念的直接支持。从1.2版开始，JAVA语言提供了很多种聚集，包括Vector、ArrayList、HashSet、HashMap、Hashtable等，这些都是JAVA聚集的例子。
     * 
     * 
     */

}