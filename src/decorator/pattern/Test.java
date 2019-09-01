package decorator.pattern;

public class Test {

    public static void main(String [] args){
        Computer computer = new Computer();

        computer = new Mouse(computer);

        computer = new CPU(computer);

        computer = new CPU(computer);

        System.out.println(computer.description());

    }
}
