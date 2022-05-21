package com.pattern.decorator;

public abstract class MilkTeaDecorator implements MilkTea {
	@SuppressWarnings("unused")
	private MilkTea milktea;

	protected MilkTeaDecorator(MilkTea innerMilk) {
		this.milktea = innerMilk;
	}

	public double Cost() {
		// TODO Auto-generated method stub
		return 5;
	}

}
