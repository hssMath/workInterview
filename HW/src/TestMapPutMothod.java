import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author hss
 */
public class TestMapPutMothod {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("111", "2222");
        map.put("111", "3333");
        map.put("123", "2222");
        map.put("234", "2222");
        map.put("456", "2222");
        System.out.println(map.entrySet());
//1.在for-each循环中使用entries来遍历
        for (Map.Entry entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

//2.   遍历map中的键
        for (String key : map.keySet()) {
            System.out.println("Key = " + key);
        }
        //遍历map中的值
        for (String value : map.values()) {
            System.out.println("Value = " + value);
        }

//3.使用Iterator遍历
        Iterator entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry entry = (Map.Entry) entries.next();
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            System.out.println("Key = " + key + ", Value = " + value);
        }

//4.通过键找值遍历
        System.out.println("-----------------");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println("Key = " + key + ", Value = " + value);
        }
        System.out.println("-----------------");
        System.out.println(map.get("111"));
    }
}
