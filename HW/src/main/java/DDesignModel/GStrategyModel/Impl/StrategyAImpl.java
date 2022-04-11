package DDesignModel.GStrategyModel.Impl;


import DDesignModel.GStrategyModel.bo.Strategy;

public class StrategyAImpl implements Strategy {

	@Override
	public double method(double price) {
		return price*1;
	}

}