package builder.pattern;

public class Test {
    public static void main(String [] args){
        RobotBuilder builder = new CookingBuilder();
        builder.addStart();
        builder.addStart();
        builder.addPart();
        builder.addPart();
        builder.addPart();
        builder.addAssemble();
        builder.addStop();

        BuildableRobot robot = builder.getRobot();
        robot.go();

    }
}
