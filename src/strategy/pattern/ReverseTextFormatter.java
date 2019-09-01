package strategy.pattern;

public class ReverseTextFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return "ReverseFormatter: " + new StringBuilder(text).reverse();
    }
}
