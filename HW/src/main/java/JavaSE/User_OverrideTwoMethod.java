package JavaSE;

import lombok.Data;

import java.util.HashMap;
import java.util.Objects;

/**
 * �����HashMap�д�ŵ�key���Զ�������ʱ������һ��Ҫ��дhashCode0������equals0����?
 *     1��hashCode0������Ҫ������λԪ���������е��±�λ��;
 *     2��equals0������Ҫ���ڷ���hash��ͻʱ���������������Ƚ�Ԫ��ʱ���ж�����Ԫ���Ƿ����;
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
     * equals()������Ҫ���ڷ���hash��ͻʱ���������������Ƚ�Ԫ��ʱ���ж����������Ԫ��ֵ�Ƿ����;
     * ����˵����
     * "==" ����Ӧ�ó������·�Ϊ�����࣬
     * 1����һ���������Ƚϻ����������͵ģ�Java�а˴�����������ͣ�byte,short,int,float,long,double,char,boolean�����ڻ�����������֮��������ֱ�ӱȽ�ֵ�ġ�
     * 2���ڶ����������Ƚ϶���ģ�����ֱ�ӱȽ�����������ڴ��ַ��Ҳ����˵��������������ָ��ͬһ����ַ������ʼ����false��
     * 3��equals()������Object�����еķ����������κ��඼��̳����������ֻ����Щ����д������������ͱ���String�ࡣ
     * @param o
     * @return
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof User_OverrideTwoMethod)) // instanceof �ж���߶����Ƿ�Ϊ���ұ����ʵ��
            return false;
        User_OverrideTwoMethod user = (User_OverrideTwoMethod) o;
        return getUserId().equals(user.getUserId());
    }

    /**
     * hashCode������Ҫ������λԪ���������е��±�λ��;
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(getUserId());
    }
}
