package singleton;

/**
 * Created by User on 01/05/2017.
 * Singleton Early initialization
 */
/**
 * Exercise 2(a) Using lazy-initialization can improve startup speed, improving response time. The instance is created only when it is needed
 *However using condition variables and execution cycles to check instances will lead to use of more memory and processor time.
 *In the example below, the Singleton is lazy initialized. Using synchronized ensures only one instance is created in
 * multithreading.
 */
public class SingletonDeclareInitialize {
    private static SingletonDeclareInitialize sc = new SingletonDeclareInitialize();
    private SingletonDeclareInitialize(){
    }

    public static SingletonDeclareInitialize getInstance(){
        return sc;
    }
}
