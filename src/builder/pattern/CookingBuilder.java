package builder.pattern;

import java.util.ArrayList;
import java.util.List;

public class CookingBuilder implements RobotBuilder {

    List<Integer> actions;
    BuildableRobot robot = new CookingRobot();

    public CookingBuilder(){
        actions = new ArrayList<Integer>();
    }

    @Override
    public void addStart() {
        actions.add(new Integer(1));

    }

    @Override
    public void addPart() {
        actions.add(new Integer(2));
    }

    @Override
    public void addAssemble() {
        actions.add(new Integer(3));
    }

    @Override
    public void addStop() {
        actions.add(new Integer(4));
    }

    public BuildableRobot getRobot(){
        robot.loadActions(actions);
        return robot;
    }
}
