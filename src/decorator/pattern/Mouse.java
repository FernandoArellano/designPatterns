package decorator.pattern;

public class Mouse extends ComputerDecorator {

    private Computer computer;

    public Mouse(Computer computer){
        this.computer = computer;
    }


    @Override
    public String description() {
        return computer.description() + " and a mouse";
    }
}
