package template.pattern;

public class Test {

    public static void main(String [] args){
        AutoRobot autoRobot = new AutoRobot();
        CookingRobot cookingRobot = new CookingRobot();

        System.out.println("AutoRobot");
        autoRobot.go();

        System.out.println("CookingRobot");
        cookingRobot.go();
    }
}
