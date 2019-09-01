package strategy.pattern;

public class Test {
    public static void main(String [] args){
        ReverseTextFormatter reverseTextFormatter = new ReverseTextFormatter();
        UpperCaseTextFormatter upperCaseTextFormatter = new UpperCaseTextFormatter();

        TextTester tester = new TextTester();
        tester.setTextFormatter(reverseTextFormatter);
        tester.publishText("Hola Mundo");

        tester.setTextFormatter(upperCaseTextFormatter);
        tester.publishText("Hola Mundo");
    }
}
