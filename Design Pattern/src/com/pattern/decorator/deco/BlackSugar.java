package com.pattern.decorator.deco;

import com.pattern.decorator.MilkTea;
import com.pattern.decorator.MilkTeaDecorator;

public class BlackSugar extends MilkTeaDecorator {

	public BlackSugar(MilkTea innerMilk) {
		super(innerMilk);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double Cost() {
		return super.Cost() + 3;
	}

}
