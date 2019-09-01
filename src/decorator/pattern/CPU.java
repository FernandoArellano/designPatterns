package decorator.pattern;

public class CPU extends ComputerDecorator {

    private Computer computer;

    public CPU(Computer computer){
        this.computer = computer;
    }

    @Override
    public String description() {
        return computer.description() + " and a CPU";
    }
}
