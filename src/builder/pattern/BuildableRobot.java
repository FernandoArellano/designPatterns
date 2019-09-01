package builder.pattern;

import java.util.List;

public interface BuildableRobot {

    void loadActions(List actions);
    void start();
    void assemble();
    void getParts();
    void stop();
    void go();
}
