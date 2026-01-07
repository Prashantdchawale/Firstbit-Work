package com.phoenix.demos;

public interface Observable {
	void subscribeObserver(Observer ref);
	void unSubscribeObserver(Observer ref);
	void notifyAllObservers();
}
