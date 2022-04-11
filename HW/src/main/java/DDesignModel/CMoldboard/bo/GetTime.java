package DDesignModel.CMoldboard.bo;

public abstract class GetTime {
    /**
     * ģ�巽�����ģʽ
     *
     * @name������������е�ʱ��
     * @description ���õ��Ǽ̳е����ģʽ��������дһ�����󷽷����������ж�����д��ʵ�ִ���ĸ���
     * @time 2017-3-16����04:39:16
     */
    public final void getTime() {
        long start = System.currentTimeMillis();
        run();
        long end = System.currentTimeMillis();
        System.out.println("��ʱ����" + (end - start));
    }

    public abstract void run();
}
