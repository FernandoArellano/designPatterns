package strategy.pattern;

public class TextTester {

    private TextFormatter textFormatter;

    public void setTextFormatter(TextFormatter textFormatter) {
        this.textFormatter = textFormatter;
    }

    public void publishText(String text){
        System.out.println(textFormatter.format(text));
    }
}
