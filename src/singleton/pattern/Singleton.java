package singleton.pattern;

public class Singleton {

    private Singleton(){}

    private static Singleton singleton;

    static{
        singleton = new Singleton();
    }

    public static Singleton getInstance(){
        return singleton;
    }

    public void testMethod(){
        System.out.println("singleton method");
    }
}
