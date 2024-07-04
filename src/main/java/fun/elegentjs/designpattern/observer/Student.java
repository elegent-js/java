package fun.elegentjs.designpattern.observer;

public class Student implements Observer {

    @Override
    public void update(String message) {
        System.out.println("学生收到通知: " + message);
    }
}
