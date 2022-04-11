package DDesignModel.GStrategyModel.Impl;

import DDesignModel.GStrategyModel.bo.Strategy;

public class StrategyBImpl implements Strategy {

	@Override
	public double method(double price) {
		return price*0.2;
	}
}