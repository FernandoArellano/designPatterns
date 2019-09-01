package builder.pattern;

import java.util.ArrayList;
import java.util.List;

public class CookingRobot implements BuildableRobot {

    List<Integer> actions = new ArrayList<>();

    @Override
    public void loadActions(List actions) {
        this.actions = actions;
    }

    @Override
    public void start() {
        System.out.println("Starting");
    }

    @Override
    public void assemble() {
        System.out.println("Cooking cake");
    }

    @Override
    public void getParts() {
        System.out.println("Getting flour");
    }

    @Override
    public void stop() {
        System.out.println("Finished");
    }

    @Override
    public void go() {
        for(Integer i : actions){
            switch(i){
                case 1:
                    start();
                    break;

                case 2:
                    getParts();
                    break;

                case 3:
                    assemble();
                    break;

                case 4:
                    stop();
                    break;
            }
        }
    }
}
