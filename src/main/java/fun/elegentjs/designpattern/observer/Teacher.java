package fun.elegentjs.designpattern.observer;

public class Teacher implements Observer {

    @Override
    public void update(String message) {
        System.out.println("老师收到通知: " + message);
    }
}
