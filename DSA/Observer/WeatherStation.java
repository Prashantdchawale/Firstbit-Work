package com.phoenix.demos;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable{

	List<Observer> observers=new ArrayList();
	private float temp;
	
	public WeatherStation() {
		
	}
	
	@Override
	public void subscribeObserver(Observer ref) {
		observers.add(ref);
	}

	@Override
	public void unSubscribeObserver(Observer ref) {
		if(observers.contains(ref))
		{
			int index=observers.indexOf(ref);
			observers.remove(index);
		}
		else
		{
			System.out.println("Suggested Observer does not exist");
		}
	}

	@Override
	public void notifyAllObservers() {
		for(Observer ref:observers)
		{
			ref.update(temp);
		}
	}

	public void tempChanged()
	{
		notifyAllObservers();
	}
	
	public void changeTemp(float temp)
	{
		this.temp=temp; //State changed
		tempChanged();
	}
}
