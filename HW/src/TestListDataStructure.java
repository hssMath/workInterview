import java.util.*;

/**
 * 常见的数据结构：Array,line List,Stack，List，Linked List，Queue，Tree,Graph,Hash,Heap.
 * List的底层原理：
 *      给了一个长度默认为10的object数组来进行元素的添加、插入、删除操作。
 */
public class TestListDataStructure {
    public static void main(String[] args) {
        //public class ArrayList<E>     extends AbstractList<E>     implements List<E>, RandomAccess, Cloneable, java.io.Serializable
        List<String> list = new ArrayList<>();
        list.add("123");
        list.add("456");
        System.out.println(list);

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }

        for (final String s:list){
            System.out.println(s);
        }

        for(Iterator iter = list.iterator();iter.hasNext();){
            System.out.println(iter.next());
        }

        //public class ArrayList<E>     extends AbstractList<E>     implements List<E>, RandomAccess, Cloneable, java.io.Serializable
        List<String> listNew = new ArrayList<>();

        //public class Vector<E>    extends AbstractList<E>  implements List<E>, RandomAccess, Cloneable, java.io.Serializable
        List<String> vector = new Vector<>();

        //public class LinkedList<E>    extends AbstractSequentialList<E>  implements List<E>, Deque<E>, Cloneable, java.io.Serializable
        List<String> linkedList = new LinkedList<>();
    }
}
