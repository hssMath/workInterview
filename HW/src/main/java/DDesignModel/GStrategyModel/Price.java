package DDesignModel.GStrategyModel;


import DDesignModel.GStrategyModel.bo.Strategy;

public class Price {
    
    private Strategy strategy;//持有一个具体策略的对象
    /**
     * 构造函数，传入一个具体策略对象
     * @param strategy    具体策略对象
     */
    public Price(Strategy strategy){
        this.strategy = strategy;
    }
    /**
     * 策略方法
     */
    double finalPrice(Double privice) {
    	return this.strategy.method(privice);
    }
}