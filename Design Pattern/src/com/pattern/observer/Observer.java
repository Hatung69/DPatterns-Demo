package com.pattern.observer;

public abstract class Observer {
	protected Subject subject;

	protected void notifyChanges(Subject subject) {
	};
}
