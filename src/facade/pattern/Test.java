package facade.pattern;

public class Test {

    public static void main(String [] args){

        Facade facade = new Facade();
        facade.setName("Fernando");

        System.out.println(facade.getName());
    }
}
