package fun.elegentjs.designpattern.observer;

public class Main {

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student student = new Student();

        WeatherSubject subject = new WeatherSubject();
        subject.registerObserver(teacher);
        subject.registerObserver(student);

        subject.changeWeather();
    }
}
