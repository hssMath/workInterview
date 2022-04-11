package DDesignModel.GStrategyModel;


import DDesignModel.GStrategyModel.bo.Strategy;

public class Price {
    
    private Strategy strategy;//����һ��������ԵĶ���
    /**
     * ���캯��������һ��������Զ���
     * @param strategy    ������Զ���
     */
    public Price(Strategy strategy){
        this.strategy = strategy;
    }
    /**
     * ���Է���
     */
    double finalPrice(Double privice) {
    	return this.strategy.method(privice);
    }
}