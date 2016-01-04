package observerFramework;

import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable{
	/*Converting original example to use java builtin support
	 * There is no longer a need to keep track of the observers
	 * anymore or manage their registration and removal. Because
	 * the super class will handle this functionality The code
	 * for these processes have been removed
	 * */
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData(){}
	
	public float getTemperature(){
		return this.temperature;
	}
	
	public float getHumidity(){
		return this.humidity;
	}
	
	public float getPreasure(){
		return this.pressure;
	}
	
	public void measurementsChanged(){
		/*Notify the observers when we get updated measurements
		 * from the runner. 
		 * setChanged() is being called from java Observable to indicate 
		 * that the state has changed before calling notifyObservers().
		 * */
		setChanged();
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity,
			float pressure){
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
