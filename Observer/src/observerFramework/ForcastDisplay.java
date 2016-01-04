package observerFramework;

import java.util.Observable;
import java.util.Observer;

public class ForcastDisplay implements Observer, DisplayElement{
	Observable observable;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public ForcastDisplay(Observable observable){
		this.observable = observable;
		observable.addObserver(this);
	}
	public void update(Observable obs, Object arg){
		if(obs instanceof WeatherData){
			WeatherData weatherData = (WeatherData)obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			this.pressure = weatherData.getPreasure();
			display();
		}
	}
	public void display(){
		System.out.println("Forecast: More of the same");
	}
}
