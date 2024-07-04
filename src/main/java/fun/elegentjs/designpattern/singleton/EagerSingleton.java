package fun.elegentjs.designpattern.singleton;

/**
 * 饿汉式单例模式
 */
public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() { }

    public static EagerSingleton getInstance() {
        return instance;
    }


    public static void main(String[] args) {
        EagerSingleton instance1 = EagerSingleton.getInstance();
        EagerSingleton instance2 = EagerSingleton.getInstance();

        System.out.println(instance1 == instance2); // true
    }
}
