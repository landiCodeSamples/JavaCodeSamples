package observerFramework;

import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
	Observable observable;
	private float temperature;
	private float humidity;
	
	public StatisticsDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}
	public void update(Observable obs, Object arg){
		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData)obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
	public void display(){
		System.out.println("current conditions: " + temperature + "F degrees and " +
	humidity + "% humidity");
	}

}
