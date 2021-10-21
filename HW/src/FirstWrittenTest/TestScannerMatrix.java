package FirstWrittenTest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestScannerMatrix{
    /**
     * 从键盘中读取一个对称矩阵
     * @return
     */
    public static int [][] ReadMatrix(){
        Scanner sc = new Scanner(System.in);
        List<List<String>> list = new ArrayList<>();//用一个List将原始数据以字符串存储
        String Line=null;
        while((Line=sc.nextLine()).length()!=0){
          list.add(Arrays.asList(Line.trim().split(" ")));
        }
        sc.close();
        int m = list.size();
        int n = list.get(0).size();//对称矩阵的行列数
        int [][] matrix = new int[m][n];
        //将字符串变为int类型
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]= Integer.parseInt(list.get(i).get(j));
            }
        }
        return matrix;
    }
    /**
     * 打印验证
     * @param args
     */
    public static void main(String[] args) {
	    int [][] matrix = ReadMatrix();
	    for(int i=0;i<matrix.length;i++){
	        for(int j=0;j<matrix[0].length;j++){
	            System.out.print(matrix[i][j]);
	        }
	        System.out.println("\n");
	    }   
	}
}