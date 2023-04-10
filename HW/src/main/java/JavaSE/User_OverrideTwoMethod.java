package JavaSE;

import lombok.Data;

import java.util.HashMap;
import java.util.Objects;

/**
 * 如果往HashMap中存放的key是自定义对象的时候，我们一定要重写hashCode0方法和equals0方法?
 *     1、hashCode0方法主要用来定位元素在数组中的下标位置;
 *     2、equals0方法主要是在发生hash冲突时，遍历链表，挨个比较元素时，判断两个元素是否相等;
 */
@Data
public class User_OverrideTwoMethod extends Object{

    private Integer userId;

    public User_OverrideTwoMethod(Integer userId) {
        this.userId = userId;
    }

    public static void main(String[] args) {
        User_OverrideTwoMethod user1 = new User_OverrideTwoMethod(1);
        User_OverrideTwoMethod user2 = new User_OverrideTwoMethod(1);
        HashMap<User_OverrideTwoMethod, String> hashMap = new HashMap<>();
        hashMap.put(user1,"123");
//        hashMap.put(user2,"234");
        System.out.println(hashMap.get(user1));
        System.out.println(hashMap.get(user2));
    }

    /**
     * equals()方法主要是在发生hash冲突时，遍历链表，挨个比较元素时，判断两个对象的元素值是否相等;
     * 问题说明：
     * "==" 它的应用场景大致分为两大类，
     * 1、第一类是用来比较基本数据类型的（Java中八大基本数据类型：byte,short,int,float,long,double,char,boolean），在基础数据类型之间他们是直接比较值的。
     * 2、第二类是用来比较对象的，它会直接比较两个对象的内存地址，也就是说，除非两个对象指向同一个地址，否则始终是false。
     * 3、equals()方法是Object基类中的方法，所以任何类都会继承这个方法，只是有些类重写了这个方法，就比如String类。
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof User_OverrideTwoMethod)) // instanceof 判断左边对象是否为其右边类的实例
            return false;
        User_OverrideTwoMethod user = (User_OverrideTwoMethod) o;
        return getUserId().equals(user.getUserId());
    }

    /**
     * hashCode方法主要用来定位元素在数组中的下标位置;
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(getUserId());
    }
}
