package FirstWrittenTest;
import java.util.Scanner;

public class GetMatrix {
    private String getHL;
    private String[] HLs;
    private int[] HL;

    public int[][] get(){
        /**
         * ��������������
         */
        HL = new int[2];
        Scanner get = new Scanner(System.in);
        System.out.println("�������������Ĺ���ǣ�(�����ʽ����x��,����5x5)");
        getHL =get.nextLine();
        HLs =getHL.split("x");
        for (int i = 0;i <2;i++){
            HL[i] = Integer.valueOf(HLs[i]);
        }
        int[][] array = new int[HL[0]][HL[1]];

        /**
         * ��ʼ������
         */
        for (int i = 0;i < HL[0];i++){
            String temp = get.nextLine();
            String[] temps = temp.split(" +");
            for (int j = 0;j < HL[1];j++){
                array[i][j]=Integer.valueOf(temps[j]);
            }
        }
        return array;
    }
}


