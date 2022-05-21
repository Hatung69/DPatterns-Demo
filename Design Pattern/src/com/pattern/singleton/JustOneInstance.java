package com.pattern.singleton;

import java.util.Random;

public class JustOneInstance {
	private int index;
	private static volatile JustOneInstance uniqueInstance;

	private JustOneInstance(int index) {
		this.index = index;
		System.err.println("Number init..............." + this.index);
	}

	public static JustOneInstance getInstance() {
		synchronized (JustOneInstance.class) {
			if (uniqueInstance == null) {
				Random random = new Random();
				uniqueInstance = new JustOneInstance(random.nextInt(1, 4));
			}
		}
		return uniqueInstance;
	}

	public void helloWorld() {
		System.out.println("Hello Wrold I'm the UNIQUE Instance numer: " + index);
	}

}
