package com.pattern.singleton;

public class MainTest {
	public static void main(String arg[]) {
		
		//-----Just one instance in program
//		JustOneInstance.getInstance().helloWorld();
//		JustOneInstance.getInstance().helloWorld();
//		JustOneInstance.getInstance().helloWorld();
		
		
		//----- Multi threads, fix with synchronized keyword
		new Thread() {
			@Override
			public void run() {
				JustOneInstance.getInstance().helloWorld();
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				JustOneInstance.getInstance().helloWorld();
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				JustOneInstance.getInstance().helloWorld();
			}
		}.start();
		
		new Thread() {
			@Override
			public void run() {
				JustOneInstance.getInstance().helloWorld();
			}
		}.start();
	}
}
