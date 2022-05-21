package com.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private List<Observer> lisObservers = new ArrayList<Observer>();

	public void addObserver(Observer observer) {
		lisObservers.add(observer);
	}

	public void deleteObserver(Observer observer) {
		lisObservers.remove(observer);
	}

	public void notifyObservers(Subject subject) {
		lisObservers.forEach(e -> {
			e.notifyChanges(subject);
		});
	}
}
