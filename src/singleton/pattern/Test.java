package singleton.pattern;

public class Test {

    public static void main(String [] args){
        Singleton singleton = Singleton.getInstance();

        singleton.testMethod();
    }
}
