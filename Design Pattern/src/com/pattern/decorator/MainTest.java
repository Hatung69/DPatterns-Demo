package com.pattern.decorator;

import com.pattern.decorator.deco.BlackSugar;
import com.pattern.decorator.deco.Bubble;

public class MainTest {
	public static void main(String arg[]) {
		MilkTeaDecorator mlik = new BlackSugar(new Bubble(new MilkTeaImpl()));
	}
}
