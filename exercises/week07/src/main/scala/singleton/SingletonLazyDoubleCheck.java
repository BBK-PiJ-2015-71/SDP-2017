package singleton;

/**
 * Singleton lazy initialization
* Exercise 2(a) Using lazy-initialization can improve startup speed, improving response time. The instance is created only when it is needed
 *However using condition variables and execution cycles to check instances will lead to use of more memory and processor time.
 *In the example below, the Singleton is lazy initialized. Using synchronized ensures only one instance is created in
 * multithreading.
 */
public class SingletonLazyDoubleCheck {
    private volatile static SingletonLazyDoubleCheck sc = null;

    private SingletonLazyDoubleCheck() {
    }

    public static SingletonLazyDoubleCheck getInstance() {
        if (sc == null) {
            synchronized (SingletonLazyDoubleCheck.class) {
                if (sc == null) {
                    sc = new SingletonLazyDoubleCheck();
                }
            }
        }
        return sc;
    }
}
