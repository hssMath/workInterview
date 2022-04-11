package DDesignModel.CMoldboard.bo;

public abstract class GetTime {
    /**
     * 模板方法设计模式
     *
     * @name：计算程序运行的时间
     * @description ：用的是继承的设计模式。本类中写一个抽象方法。在子类中对其重写，实现代码的复用
     * @time 2017-3-16下午04:39:16
     */
    public final void getTime() {
        long start = System.currentTimeMillis();
        run();
        long end = System.currentTimeMillis();
        System.out.println("耗时毫秒" + (end - start));
    }

    public abstract void run();
}
