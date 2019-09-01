package builder.pattern;

public interface RobotBuilder {

    public void addStart();
    public void addPart();
    public void addAssemble();
    public void addStop();
    public BuildableRobot getRobot();
}
