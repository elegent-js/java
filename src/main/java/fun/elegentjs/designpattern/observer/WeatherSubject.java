package fun.elegentjs.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 天气主题/被观察者
 * @author liupj
 */
public class WeatherSubject implements Subject {

    private final List<Observer> observerList = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(observer -> observer.update("天气变化了: " + observer));
    }


    public void changeWeather() {
        System.out.println("天气变化了...");
        notifyObservers();
    }
}
