package AAARtQuestionTest.bStrinigRollback;

import java.util.Scanner;

/**
 * 字符串逆序输出：
 *  1、String 转 字符数组
 *  2、数据从后往前取数
 */
public class StringToCharArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        for(int i = 0;i < ch.length;i++){
            int count = 0;
            while(i < ch.length - 1 && ch[i] == ch[i+1]){
                count++;
                i++;
            }
            if(count != 0){
                System.out.print(count);
            }
            System.out.print(ch[i]);
        }
        System.out.println();
    }
}