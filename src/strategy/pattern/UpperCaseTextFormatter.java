package strategy.pattern;

public class UpperCaseTextFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return "UpperCaseTextFormatter: " +text.toUpperCase();
    }
}
