package fun.elegentjs.designpattern.singleton;

/**
 * 懒汉式单例模式
 * 需要注意线程安全问题
 *
 */
public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton() { }

    public static LazySingleton getInstance() {
        if (instance != null) {
            return instance;
        }

        synchronized (LazySingleton.class) {
            if (instance == null) {
                instance = new LazySingleton();
            }
        }

        return instance;
    }

    public static void main(String[] args) {
        LazySingleton instance1 = LazySingleton.getInstance();
        LazySingleton instance2 = LazySingleton.getInstance();

        System.out.println(instance1 == instance2); // true
    }
}
